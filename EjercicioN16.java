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
public class EjercicioN16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        16. Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
        usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
        numero y si se encuentra repetido
        */
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int tam = leer.nextInt();
        System.out.println("Ingrese un numero a usar");
        int n = leer.nextInt();
        int cont=0;
        int pos=0;
        int[] vector = new int[tam];
        String aux = "";
        for(int i = 0; i < tam; i++){
            int numero = (int) (Math.random() * 10);
            vector[i] = numero;
            if(vector[i] == n){
                cont = cont +1;
                pos = i+1;
            }
        }
        for(int elemento: vector){
            aux += " " + elemento;
            System.out.println(elemento);
        }
        System.out.println("El numero " + n + " esta en el vector " + cont + " vez/veces en la posicion " + pos);
    }
    
}
