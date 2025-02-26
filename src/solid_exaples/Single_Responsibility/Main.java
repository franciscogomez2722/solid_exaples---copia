/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solid_exaples.Single_Responsibility;

/**
 *
 * @author vasit
 */
import solid_exaples.Single_Responsibility.Reporte;

public class Main {
    public static void main(String[] args) {
        // 1. Crear un reporte con título, autor y contenido
        Reporte reporte = new Reporte("Analisis de Datos", "Juan Perez", "Este reporte analiza tendencias del mercado...");

        // 2. Crear un gestor de almacenamiento para guardar el reporte
        ReporteArchivo reporteArchivo = new ReporteArchivo();

        // 3. Guardar el reporte en un archivo llamado "reporte.txt"
        reporteArchivo.guardar(reporte, "reporte.txt");

        System.out.println("Reporte guardado exitosamente.");
        
        System.out.println(reporte);
    }
}

