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
    public static void main(String[] args) {
        /*
        13. Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
        cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
        * * * *
        *     *
        *     *
        * * * *
        */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de los lados");
        int tam = leer.nextInt();
        //int lados = tam;
        for(int i=0; i < tam; i++){
            for(int j=0; j < tam; j++){
                if(i == 0 || i == tam || j == 0 || j == tam)
               
            
          System.out.print("* ");
        }
        
         System.out.println("");
    }
    } 
}
