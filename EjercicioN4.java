/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicios;

import java.util.Scanner;

/**
 *
 * @author Raul
 */
public class EjercicioN4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        4. Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
        Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
        */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en °C");
        double tempCelsius = leer.nextDouble();
        double conversorFa =  32 + (9* tempCelsius/5);
        System.out.println("La temperatura " + tempCelsius + "°C expresada en grados Fahrenheit es: " + conversorFa + "°F");
        
    }
    
}
