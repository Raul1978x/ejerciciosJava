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
public class EjercicioN20corto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int matriz[][] = new int[3][3]; // Le ponemos la dimension a la matriz, 
        //int [][] matriz = {{2,9,4},{7,5,3},{6,1,8}};
        int sumadiagonal1=0, sumadiagonal2=0, fila=0, columna=0;
        boolean esmagica=true;
        Scanner leer = new Scanner(System.in);   
        
        System.out.println("Ingrese la matriz a comprobar");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                do {
                    System.out.print("Matriz[" + i + "][" + j + "] = ");
                    matriz[i][j] = leer.nextInt();
                } while (matriz[i][j] == 0 || matriz[i][j] > 9);
            }
            //System.out.println("");
        }

        for (int i = 0; i < 3; i++) {
            sumadiagonal1+=matriz[i][i];
        }
        int j=2;
        for (int i = 0; i < 3; i++) {
            sumadiagonal2+=matriz[i][j];
            j--;        
        }
        if (sumadiagonal1==sumadiagonal2){
            for (int i = 0; i < 3; i++) {
                for (int n = 0; n < 3; n++) {
                    
                fila+=matriz[i][n];
                columna+=matriz[n][i];  
                
                }
                if(fila!=columna && columna != sumadiagonal1){
                    System.out.println("La matriz no es magica");
                    esmagica=false;
                    break;
                
                }
                
                
            }
            
                       
        }else {
                System.out.println("La matriz no es magica");
                esmagica=false;
    }
      if (esmagica)
                System.out.println("La Matriz es magica");  
        
    }
}