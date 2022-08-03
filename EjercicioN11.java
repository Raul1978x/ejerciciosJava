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
public class EjercicioN11 {

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
        int suma = num1+num2;
        int resta = num1-num2;
        int multi = num1*num2;
        double div = num1/num2;
        
        
        System.out.println("Menu");
        System.out.println("1 - Sumar");
        System.out.println("2 - Restar");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("5 - Salir");
        System.out.println("Elija opcion:");
        int menu = leer.nextInt();
        
        switch(menu){
            case 1:
                System.out.println("La suma es: " + suma);
                break;
            case 2:
                System.out.println("La resta es: " + resta);
                break;
            case 3:
                System.out.println("La multiplicacion es: " + multi);
                break;
            case 4:
                System.out.println("La division es: " + div);
                /*
                EL RESULTADO DE LA DIVISION SOLO ME DA LA PARTE ENTERA A PESAR QUE LA VARIABLE DIV ESTA DEFINIDA COMO DOUBLE 
                ¿POR QUÉ?
                */
                break;
            case 5:
                System.out.println("¿Está seguro que desea salir del programa (S=1 / N=2)?");
                int opcion = leer.nextInt();
                /*
                USO LA VARIABLE NUMERICA PORQUE NO ME DEJA USAR STRING 
                String opcion = leer.nextLine();
                ME HACE UN ERROR Y NO SE ¿POR QUÉ?
                TAMBIEN PENSE EN HACER UNA FUNCION PARA LLAMAR AL MENU, PERO LO DEJE ASI POR QUE ES EN LA PARTE DE 
                BUCLES Y SENTENCIAS NO EN LA DE FUNCIONE
                */
                switch(opcion){
                    case 1:
                      break;
                    case 2:
                        
                   
                        System.out.println("Menu");
                        System.out.println("1 - Sumar");
                        System.out.println("2 - Restar");
                        System.out.println("3 - Multiplicar");
                        System.out.println("4 - Dividir");
                        System.out.println("5 - Salir");
                        System.out.println("Elija opcion:");
                        menu = leer.nextInt();
            switch(menu){
            case 1:
                System.out.println("La suma es: " + suma);
                break;
            case 2:
                System.out.println("La resta es: " + resta);
                break;
            case 3:
                System.out.println("La multiplicacion es: " + multi);
                break;
            case 4:
                System.out.println("La division es: " + div);
                break;
            case 5:
                break;
                /*
                NO PUEDO HACER QUE INICIE DE NUEVO ME DA ERROR LA VARIABLE OPCION
                */
                //System.out.println("¿Está seguro que desea salir del programa (S=1 / N=2)?");
                //opcion = leer.nextLine();

            }
             }
        }
    }
}