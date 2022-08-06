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
public class EjercicioN13 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("null")
    public static void main(String[] args) {
        try (/*
                13. Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
                cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
                * * * *
                *     *
                *     *
                * * * *
                 */
        Scanner leer = new Scanner(System.in)) {
            System.out.println("Ingrese el tamaño ");
            
            int tam = leer.nextInt();
      // int[] vector = new int[tam];
      // int[][] matriz = new int[tam][tam];
            for (int i = 0; tam > i; i++) {
                for (int j = 0; tam > j; j++) {
                    if (i == 0 || i == tam-1 || j == 0 || j == tam-1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println("");
            }
        }

    }
}
