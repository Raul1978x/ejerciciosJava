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
public class EjercicioN11Funcion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        11. Realizar un programa que pida dos números enteros positivos por teclado y muestre por
        pantalla el siguiente menú:
                
                MENU
                1. Sumar
                2. Restar
                3. Multiplicar
                4. Dividir
                5. Salir
                Elija opción:
        
        El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
        y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
        Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
        directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
        desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
        programa, caso contrario se vuelve a mostrar el menú.
        */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = leer.nextInt();
         System.out.println("Menu");
                        System.out.println("1 - Sumar");
                        System.out.println("2 - Restar");
                        System.out.println("3 - Multiplicar");
                        System.out.println("4 - Dividir");
                        System.out.println("5 - Salir");
                        System.out.println("Elija opcion:");
                        int menu = leer.nextInt();
                        switch (menu){
                            case 1:
                            System.out.println("La suma es: " + suma(num1, num2));
                            break;
                            case 2:
                            System.out.println("La resta es: " + resta(num1, num2));
                            break;
                            case 3:
                            System.out.println("La multiplicacion es: " + multi(num1,num2));
                            break;
                            case 4:
                              System.out.println("La division es: " + div(num1, num2));
                            break;
                            case 5:
                            System.out.println("¿Está seguro que desea salir del programa (S/N=2)?");
                            String opcion = leer.nextLine();
}
    }
    

public static int suma (int num1, int num2){
         int suma;
        suma = num1+num2;
        return suma;
                }   

public static int resta(int num1, int num2){
         
        int resta = num1-num2;
        return resta;
                }   
public static int multi (int num1, int num2){
         int multi;
        multi = num1*num2;
        return multi;
                } 

public static double div (int num1, int num2){
         double div;
        div = num1/num2;
        return div;
        
}
}

/*public static String salir(String opcion){
String salir;

        if(opcion.equals("S")){
        break;
        }else if(opcion.equals("N")){
        menuFuncion(menu, num1, num2);
        return salir;
        }
}
*/







