/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author samue
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader (isr);
        int randomValue = (int) Math.floor(Math.random()*100+1),
                        attemps = 5,
                        attempsCounter = 0,
                        inputData = 0;

        System.out.println("Adivina el numero entre 1  y 100");
        System.out.println("Ingresa un número:");
        while(attempsCounter <= attemps) {

                try {
                        inputData = Integer.parseInt (br.readLine());

                        if(inputData != randomValue) {
                                String dir = inputData > randomValue ? "MENOR" : "MAYOR";
                                System.out.println("Incorrecto, pero la respuesta es: "+dir+" que el valor ingresado"
                                                + "\nIntentos restantes: "+ (attemps - attempsCounter - 1)
                                                + "\nIntenta ingresando otra vez: "+randomValue);
                                attempsCounter++;

                                if(attempsCounter == 5) {
                                        System.out.println("¡GameOver!");
                                        break;
                                }
                        }else {
                                System.out.println("¡Exito!");
                                break;
                        }
                } catch (NumberFormatException | IOException e1) {
                        System.out.println("Debe ingresar obligatoriamente un número entero:");
                }


                }

        }
}
