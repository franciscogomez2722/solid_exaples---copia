/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface_Segregation;

/**
 *
 * @author vasit
 */
// Interfaces separadas según responsabilidades
interface Trabajador {
    void trabajar();
}

interface Comedor {
    void comer();
}

interface Durmiente {
    void dormir();
}

// Programador solo implementa lo que necesita
class Programador implements Trabajador, Comedor {
    @Override
    public void trabajar() {
        System.out.println("El programador esta escribiendo codigo.");
    }

    @Override
    public void comer() {
        System.out.println("El programador esta comiendo.");
    }
}

// Un empleado nocturno sí necesita dormir en el trabajo
class Vigilante implements Trabajador, Durmiente {
    @Override
    public void trabajar() {
        System.out.println("El vigilante esta supervisando el area.");
    }

    @Override
    public void dormir() {
        System.out.println("El vigilante toma una siesta en su turno.");
    }
}

