/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio8;

import java.util.Scanner;

/**
 *
 * @author samue
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println(" Ingresa a: ");
        int a= leer.nextInt();
        System.out.println(" Ingresa b: ");
        int b= leer.nextInt();
        System.out.println(" Ingresa c: ");
        int c= leer.nextInt();
        
        if(a>b){////a es mayor que b
            if(a>c){/////a es amyor que c y b
                if(b>c){///b
                    System.out.println("a= "+a);
                    System.out.println("b= "+b);
                   System.out.println("c= "+c); 
                }else{///si c es mayor que b pero menor que a ,   a,c,b
                    System.out.println("a= "+a);
                    System.out.println("c= "+c);
                   System.out.println("b= "+b); 
                }
                
            }else{// c es mayor que a y b es el menor
                System.out.println("c= "+c); 
                System.out.println("a= "+a); 
                System.out.println("b= "+b); 
            }
        }else{
            if(b>c){ // b es mayor que a y c
                if(a>c){
                    System.out.println("b= "+b); 
                    System.out.println("a= "+a); 
                    System.out.println("c= "+c); 
                }else{
                    System.out.println("b= "+b); 
                    System.out.println("c= "+c); 
                    System.out.println("a= "+a); 
                }
                    
               }else{ // c es mayor que a y b
                if (b>a){
                    System.out.println("c= "+c); 
                    System.out.println("b= "+b); 
                    System.out.println("a= "+a); 
                }else{
                    System.out.println("c= "+c); 
                    System.out.println("a= "+a); 
                    System.out.println("b= "+b); 
                }
            
            }
            
            }
        }
}
         
    

