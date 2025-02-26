/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solid_exaples.Single_Responsibility;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author vasit
 */
class ReporteArchivo {
    /**
     * Guarda el contenido de un Reporte en un archivo.
     *
     * @param reporte      Objeto de tipo Reporte, que contiene el contenido a guardar.
     * @param nombreArchivo Nombre del archivo donde se guardará el reporte.
     */
    public void guardar(Reporte reporte, String nombreArchivo) {
        try (FileWriter writer = new FileWriter(nombreArchivo)) {
            // Se obtiene el contenido generado por el Reporte
            writer.write(reporte.generarContenido());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}