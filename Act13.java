/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud3_repasorepeticion;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

/**
 *
 * @author batoi
 */
public class Act13 {

    public static void main(String[] args) throws IOException {
        //Crear fichero para escribir mediante ruta ya hecha. 
        File fichero = new File("/home/batoi/Escritorio/resource/Act13/Act13.txt");
        Path p = Path.of("/home/batoi/Escritorio/resource/Act13/Act13.txt");
        BufferedWriter wr = Files.newBufferedWriter(p, StandardOpenOption.CREATE, StandardOpenOption.APPEND);

        //Escribir y meter lineas, importante cerrar teclado si no, no funciona.
        wr.write("3,Ordinador,20");
        wr.newLine();
        
        wr.write("5,Teclat,12");
        wr.newLine();
        
        wr.write("2,Video-consola,20");
        wr.newLine();
        
        wr.write("9,Telefon,5");
        wr.newLine();
        
        wr.write("7,Television,14");
        wr.newLine();
        
        wr.write("11,Joystick,10");
        wr.newLine();
        
        wr.write("12,Joc,2");
        wr.newLine();
        
        wr.write("8,Monitor,34");
        wr.close();


    }
}
