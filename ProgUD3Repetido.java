/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package progud3repetido;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ProgUD3Repetido {

    static final String RESET = "\u001B[0m";
    
    static final String ROIG = "\u001B[31m";
    static final String VERD = "\u001B[32m";
    static final String CIAN = "\u001B[36m";
    static final String BLANC = "\u001B[37m";
    
    static final String FONS_NEGRE = "\u001B[40m";
    static final String FONS_VERD = "\u001B[42m";
    static final String FONS_MAGENTA = "\u001B[45m";
    
    static final String SUBRATLLAT = "\u001B[4m";


        
    public static void main(String[] args) {
        
        System.out.println("%s%sCalculo de calificaciones");
        
        Scanner teclat =new Scanner(System.in);
        
        System.out.println("Escribe tu nombre: ");
        String nombre= teclat.next();

        System.out.println("Escribe tu edad: ");
        int edad= teclat.nextInt();
        
        System.out.println("Escribe la calificacion de la asignatura 1: ");
        double calificacion1= teclat.nextDouble();
        
        System.out.println("Escribe la calificacion de la asignatura 2: ");
        double calificacion2= teclat.nextDouble();
        
        System.out.println("Escribe la calificacion de la asignatura 3: ");
        double calificacion3= teclat.nextDouble();

        double media= (calificacion1+calificacion2+calificacion3)/3;
        double mediaPonderada= (calificacion1*0.3+calificacion2*0.4+calificacion3*0.3);
        
        
        
    }
    
}
