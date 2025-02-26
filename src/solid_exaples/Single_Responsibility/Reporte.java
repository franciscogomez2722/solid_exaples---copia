/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solid_exaples.Single_Responsibility;

/**
 *
 * @author vasit
 */
import java.io.FileWriter;
import java.io.IOException;
import solid_exaples.Single_Responsibility.ReporteArchivo;
class Reporte {
    private String titulo;
    private String autor;
    private String contenido;

    public Reporte(String titulo, String autor, String contenido) {
        this.titulo = titulo;
        this.autor = autor;
        this.contenido = contenido;
    }

    public String generarContenido() {
        return "Titulo: " + titulo + "\n" +
               "Autor: " + autor + "\n" +
               "Contenido:\n" + contenido;
    }
    
     // Método para imprimir el reporte en formato legible
    @Override
    public String toString() {
        return "Titulo: " + titulo + "\n" +
               "Autor: " + autor + "\n" +
               "Contenido: " + contenido;
    }
}
/*
class ReporteArchivo {
   

    public void guardar(Reporte reporte, String nombreArchivo) {
        try (FileWriter writer = new FileWriter(nombreArchivo)) {
            // Se obtiene el contenido generado por el Reporte
            writer.write(reporte.generarContenido());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}*/