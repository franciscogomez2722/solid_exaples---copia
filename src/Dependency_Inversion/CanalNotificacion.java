/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dependency_Inversion;

/**
 *
 * @author vasit
 */
// Interfaz para los canales de notificación
interface CanalNotificacion {
    void enviarMensaje(String mensaje);
}

// Implementación concreta: Correo Electrónico
class CorreoElectronico implements CanalNotificacion {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando correo: " + mensaje);
    }
}

// Implementación concreta: SMS
class SMS implements CanalNotificacion {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando SMS: " + mensaje);
    }
}

// Implementación concreta: WhatsApp
class WhatsApp implements CanalNotificacion {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando WhatsApp: " + mensaje);
    }
}

// Clase Notificador que depende de la abstracción, no de una implementación específica
class Notificador {
    private CanalNotificacion canal;

    public Notificador(CanalNotificacion canal) {
        this.canal = canal; // Inyección de dependencia
    }

    public void notificar(String mensaje) {
        canal.enviarMensaje(mensaje);
    }
}
