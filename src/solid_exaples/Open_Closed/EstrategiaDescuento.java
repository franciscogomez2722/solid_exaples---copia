/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solid_exaples.Open_Closed;

/**
 *
 * @author vasit
 */
// 1. Interfaz que define el comportamiento de los descuentos
interface EstrategiaDescuento {
    double aplicarDescuento(double precio);
}

// 2. Implementaciones específicas para cada tipo de cliente
class DescuentoNormal implements EstrategiaDescuento {
    public double aplicarDescuento(double precio) {
        return precio * 0.05; // 5% de descuento
    }
}

class DescuentoVIP implements EstrategiaDescuento {
    public double aplicarDescuento(double precio) {
        return precio * 0.10; // 10% de descuento
    }
}

class DescuentoPremium implements EstrategiaDescuento {
    public double aplicarDescuento(double precio) {
        return precio * 0.15; // 15% de descuento
    }
}

// 3. Clase que usa polimorfismo para calcular descuentos sin modificar su estructura
class CalculadoraDescuento {
    private EstrategiaDescuento estrategia;

    public CalculadoraDescuento(EstrategiaDescuento estrategia) {
        this.estrategia = estrategia;
    }

    public double calcular(double precio) {
        return estrategia.aplicarDescuento(precio);
    }
}
