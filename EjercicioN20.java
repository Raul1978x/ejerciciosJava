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
public class EjercicioN20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        20. Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
        suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
        permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
        El programa deberá comprobar que los números introducidos son correctos, es decir,
        están entre el 1 y el 9.
         */

        int[][] matriz = new int[3][3];
        //int[][] matriz = {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}};
        int[] Fila0 = new int[3];
        int[] Fila1 = new int[3];
        int[] Fila2 = new int[3];
        int[] Col0 = new int[3];
        int[] Col1 = new int[3];
        int[] Col2 = new int[3];
        int sFila0 = 0;
        int sFila1 = 0;
        int sFila2 = 0;
        int sDiagP = 0;
        int sDiagS = 0;
        int sCol0 = 0;
        int sCol1 = 0;
        int sCol2 = 0;

        String aux = null;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la matriz a comprobar");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                do {
                    System.out.println("Matriz[" + i + "][" + j + "] = ");
                    matriz[i][j] = leer.nextInt();
                } while (matriz[i][j] == 0 || matriz[i][j] > 9);
            }
        }

        for (int[] fila : matriz) {
            aux = "";
            for (int elemento : fila) {
                aux += "  " + elemento;
                System.out.print(" |" + elemento + "| ");
            }
            System.out.println("");
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    sDiagP += matriz[i][j];
                }
                if (i + j == (matriz.length - 1)) {
                    sDiagS += matriz[i][j];
                }
                switch (i) {
                    case 0:
                        Fila0[j] = matriz[i][j];
                    case 1:
                        Fila1[j] = matriz[i][j];
                    case 2:
                        Fila2[j] = matriz[i][j];
                        switch (j) {
                            case 0:
                                Col0[i] = matriz[i][j];
                            case 1:
                                Col1[i] = matriz[i][j];
                            case 2:
                                Col2[i] = matriz[i][j];
                        }
                }
            }
        }
        for (int elemF0 : Fila0) {
            sFila0 = elemF0 + sFila0;
        }
        for (int elemF1 : Fila1) {
            sFila1 = elemF1 + sFila1;
        }
        for (int elemF2 : Fila2) {
            sFila2 = elemF2 + sFila2;
        }
        for (int elemC0 : Col0) {
            sCol0 = elemC0 + sCol0;
        }
        for (int elemC1 : Col1) {
            sCol1 = elemC1 + sCol1;
        }
        for (int elemC2 : Col2) {
            sCol2 = elemC2 + sCol2;
        }
        if (sFila0 == sFila1 && sFila0 == sFila2 && sFila0 == sCol0 && sFila0 == sCol1 && sFila0 == sCol2 && sFila0 == sDiagP && sFila0 == sDiagS) {
            System.out.println("La matriz ingresada es Magica");
        } else {
            System.out.println("La matriz ingresada NO es Magica");
        }
    }
}
