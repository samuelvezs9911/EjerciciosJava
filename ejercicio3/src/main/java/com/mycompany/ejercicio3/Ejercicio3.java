/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author samue
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese n: ");
        int n = leer.nextInt();
        
       int l=0;
      for(int i=0; i<n; i++) { //Filas 
          for(int j=0;j<=i;j++){//columnas
              l++;
              System.out.print( l+" " );  
          }
      System.out.println("");    
      }  
      
    }   
}
