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
public class EjercicioN15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        15. Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
        muestre por pantalla en orden descendente.
        */
    String aux = "";
    int[] vector = new int[100];
    for(int i = 0; i < 100; i++) {
      vector[i] = i + vector[i] ;
    }
       for(int elemento: vector){
           aux = aux + "  " + elemento;
        //for(int i=0; vector.length > i; i--){
         //   aux = aux + " " + vector[i];
        }
        System.out.print(aux);
}
    
    
    
}