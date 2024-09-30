/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prog.ud1.classwork;

/**
 *
 * @author User
 */
public class Activitat22 {

    final static double C1 = -42.379;
    final static double C2 = 2.04901523;
    final static double C3 = 10.14333127;
    final static double C4 = -0.22475541;
    final static double C5 = -6.83783 * Math.pow(10, -3);
    final static double C6 = -5.481717 * Math.pow(10, -2);
    final static double C7 = 1.22874 * Math.pow(10, -3);
    final static double C8 = 8.5282 * Math.pow(10, -4);
    final static double C9 = -1.99 * Math.pow(10, -6);
    final static double KM_A_MILLA = 0.621371;

    public static void main(String[] args) {
        double gradosCentigrados = 13;
        double kmTotales = 20.5;
        double humitat = 50;
        double conversionFahrenheit = (gradosCentigrados * 9 / 5) + 32;
        double conversionKmAMillas = kmTotales * KM_A_MILLA / 1;
        //double TemperaturaReal= 35.74+(0.6215*conversionFahrenheit)-(35.75*(Math.pow(conversionKmAMillas, 0.16))+0.4275*(conversionFahrenheit*(Math.pow(conversionKmAMillas,0.16 ))));
        double TemperaturaReal= 35.74+0.6215*conversionFahrenheit-35.75*Math.pow(conversionKmAMillas, 0.16)+0.4275*conversionFahrenheit*Math.pow(conversionKmAMillas,0.16 );

        double SensacionTermica=C1+C2*TemperaturaReal+C3*humitat+C4*TemperaturaReal*humitat+C5*Math.pow(TemperaturaReal, 2)+C6*Math.pow(humitat, 2)+C7*Math.pow(TemperaturaReal, 2)*humitat+C8*TemperaturaReal*Math.pow(humitat, 2)+C9*Math.pow(TemperaturaReal, 2)*Math.pow(humitat, 2);
        System.out.println(SensacionTermica);
    }
    

}
