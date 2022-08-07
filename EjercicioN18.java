/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicios;

/**
 *
 * @author Raul
 */
public class EjercicioN18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        18. Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
        traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
        cambiando sus filas por columnas (o viceversa).
         */
        int[][] matriz = new int[4][4];
        int[][] matrizTrans = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int num = (int) (Math.random() * 10);
                matriz[i][j] = num;
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizTrans[i][j] = matriz[j][i];
            }
        }
        System.out.println("La matriz es: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("y su transpuesta es: ");
        String espacio=null;
        for(int[] fila: matrizTrans){
            espacio = " ";
            for(int elemento : fila){
            espacio += " " + elemento; 
        System.out.print("|" + elemento + "|");
            }
            System.out.println(" ");
        } 
    }
         
}
