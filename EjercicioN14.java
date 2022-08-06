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
public class EjercicioN14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        14. Crea una aplicación que a través de una función nos convierta una cantidad de euros
        introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
        función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
        una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
        (void).
        El cambio de divisas es:
            * 0.86 libras es un 1 €
            * 1.28611 $ es un 1 €
            * 129.852 yenes es un 1 €
         */
        conversor();
        
}

public static void conversor() {
        
        Scanner leer = new Scanner(System.in);
        Scanner leerString = new Scanner(System.in);
        String moneda = null;
        do {
            System.out.println("Ingrese la moneda conventir(yenes, dolar, libras)");
            moneda = leerString.nextLine();
            moneda = moneda.toLowerCase();
        } while (!moneda.equalsIgnoreCase("dolar") && !moneda.equalsIgnoreCase("yenes") && !moneda.equalsIgnoreCase("libras"));
        System.out.println("Ingrese el valor a convertir");
        int euros = leer.nextInt();
        double conversor = 0;
        double libras = 0.86;
        double dolar = 1.28611;
        double yenes = 129.852;
        switch (moneda) {
            case "libras":
                conversor = (double) libras * euros;
                System.out.println(euros + "€, equivalen a: " + conversor + " " + moneda);
                break;
            case "yenes":
                conversor = (double) yenes * euros;
                System.out.println(euros + "€, equivalen a: " + conversor + " " + moneda);
                break;
            case "dolar":
                conversor = (double) dolar * euros;
                System.out.println(euros + "€, equivalen a: " + conversor + " " + moneda);
                break;
        }
    }
}

