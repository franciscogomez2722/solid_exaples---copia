/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solid_exaples.Liskov_Substitution;

/**
 *
 * @author vasit
 */
// 1. Clase base más general
abstract class Ave {
    private String nombre;

    public Ave(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

// 2. Subclase para aves que vuelan
class AveVoladora extends Ave {
    public AveVoladora(String nombre) {
        super(nombre);
    }

    public void volar() {
        System.out.println(getNombre() + " esta volando.");
    }
}

// 3. Subclase para aves que NO vuelan
class AveNoVoladora extends Ave {
    public AveNoVoladora(String nombre) {
        super(nombre);
    }

    public void caminar() {
        System.out.println(getNombre() + " esta caminando.");
    }
}

// 4. Implementaciones específicas
class Aguila extends AveVoladora {
    public Aguila() {
        super("Aguila");
    }
}

class Pinguino extends AveNoVoladora {
    public Pinguino() {
        super("Pinguino");
    }
}
