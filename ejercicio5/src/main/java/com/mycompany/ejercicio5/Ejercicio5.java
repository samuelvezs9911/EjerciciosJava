/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author samue
 */
public class Ejercicio5 {

    public static void main(String[] args) {
      List<Integer> data = new ArrayList <Integer>();
		Integer[] numbers = new Integer[] {1, 8, 5, 2, 33, 54, 22, 6, 88, 13};
		
		data.addAll(Arrays.asList(numbers));
		
		data.stream().filter(e -> e%2 == 0).collect(Collectors.toList()).forEach(System.out::println);
    }
}
