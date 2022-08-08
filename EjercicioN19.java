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
public class EjercicioN19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        19. Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
        matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
        signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
        denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
         */
        int[][] matriz = {{0, -2, 4}, {2, 0, 2}, {-4, -2, 0}};
        int[][] matrizTrans = new int[3][3];
        int[][] matrizCarga = new int[3][3];

        int cont = 0;
        System.out.println("Matriz Origen");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" | " + matriz[i][j] + " | ");
            }
            System.out.println(" ");
        }/*
        
        System.out.println("Matriz Transpuesta");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizTrans[i][j] = matriz[j][i];
                System.out.print(" | " + matrizTrans[i][j] + " | ");
            }
            System.out.println(" ");
        }
        */
        System.out.println("Matriz Antisimetrica");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizTrans[i][j] = -matriz[j][i];
                System.out.print(" | " + matrizTrans[i][j] + " | ");
            }
            System.out.println(" ");

        }

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la matriz a comprobar");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Ingrese el valor M[" + i + "][" + j + "] 0 = ");
                matrizCarga[i][j] = leer.nextInt();

            }

        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizCarga[i][j] != -matriz[j][i]) {
                    cont = cont +1;
                }

            }
            
        }
        if (cont == 0) {
                System.out.println("La matriz ingresada es antisimetrica de la matriz original");
            } else {
                System.out.println("la matriz ingresada No es antisimetrica de la matriz original");
            }
    }
}
