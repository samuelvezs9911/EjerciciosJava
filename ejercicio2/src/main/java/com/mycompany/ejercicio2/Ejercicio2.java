/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.lang.*;
import java.io.*;
/**
 *
 * @author samue
 */
public class Ejercicio2 {

    
    //FUNCION PARA CONVERTIR A MAYUSCULAS LA PRIMERA LETRA DE LA PALABRA
    public static String capitalize(String s) {
        if (s.length() == 0) return s;
        return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
    }
    
    public static void main(String[] args) {
        List<String> lista = new ArrayList <String>();
		lista.add("juan");
		lista.add("pedro");
		lista.add("jose");
		lista.add("maria");
		lista.add("sofia");
		
		
                
		for (int i = 0; i<lista.size(); i++) {
                    String element = lista.get(i);
                    //System.out.println(capitalize(element));
                    String out = capitalize(element);//manda a llamas
                    lista.set(i, out);//guarda
                }
		
		for(String e: lista) {
			  System.out.println(e);
		}
        
    }
}
