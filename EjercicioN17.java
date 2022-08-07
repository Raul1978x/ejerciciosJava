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
public class EjercicioN17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        17. Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
        de 2 dígitos, etcétera (hasta 5 dígitos).
         */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int n = leer.nextInt();
        int[] vector = new int[n];
        String aux = "";
        int un = 0;
        int dos = 0;
        int tres = 0;
        int cuatro = 0;
        int cinco = 0;
            for (int i = 0; i < n; i++) {
            int uni = (int) (Math.random() * 10);
            int dec = (int) (Math.random() * 100);
            int cen = (int) (Math.random() * 1000);
            int mil = (int) (Math.random()* 10000);
            int decMil = (int) (Math.random()* 100000);
            vector[i] = decMil;
            }
            /*
            System.out.println("Ingrese el valor de vector[" + i + "]:");
            vector[i] = leer.nextInt();
            */
            for(int i = 0; i < n; i++){
            if (vector[i] < 10) {
                un = un + 1;
            }else if (vector[i] < 100 && vector[i] > 10) {
                dos = dos + 1;
            }else if (vector[i] > 100 && vector[i] < 1000) {
                tres = tres + 1;
            }else if (vector[i] > 1000 && vector[i] < 10000) {
                cuatro = cuatro + 1;
            }else if (vector[i] > 10000 && vector[i] < 100000) {
                cinco = cinco + 1;
            }
            
} 
        
            for (int elemento : vector) {
           
            if (elemento < 10) {
                System.out.println("hay " + un + " elemento/s de una cifra");
                //aux += " " + elemento;
            }else if (elemento < 100 && elemento > 10) {
                // aux += " " + elemento;
                System.out.println("hay " + dos + " elemento/s de dos cifras");
            }else if (elemento < 1000 && elemento > 100) {
                //aux += " " + elemento;
                System.out.println("hay " + tres + " elemento/s de tres cifras");
            }else if (elemento < 10000 && elemento > 1000) {
                //aux += " " + elemento;
                System.out.println("hay " + cuatro + " elemento/s de cuatro cifras");
            }else if (elemento < 100000 && elemento > 10000) {
                //aux += " " + elemento;
                System.out.println("hay " + cinco + " elemento/s de cinco cifras");
            }
            

        }
        for(int elem : vector) {
        aux += " " + elem; 
        System.out.println("|" + elem + "|");
        }
    }
}
