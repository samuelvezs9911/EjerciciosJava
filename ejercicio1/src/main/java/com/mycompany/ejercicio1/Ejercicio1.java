/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio1;

/**
 *
 * @author samue
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        float result;
        Rectangulo rectangulo1=new Rectangulo();
        Rectangulo rectangulo2=new Rectangulo();
        Rectangulo rectangulo3=new Rectangulo(4f,6);
        rectangulo1.setLargo(4);
        rectangulo1.setAncho(2);
        rectangulo1.CalculaArea();
        System.out.println("Area de rectangulo1: "+rectangulo1.getArea());
        rectangulo2.CalculaArea(4,4);
        System.out.println("largo y ancho"+rectangulo2.getAncho()+","+rectangulo2.getLargo());
        System.out.println("Area de rectangulo2: "+rectangulo2.getArea());
        rectangulo3.CalculaArea();
        System.out.println("Area de rectangulo 3: " + rectangulo2.getArea());
        System.out.println("toString "+rectangulo1.toString());
    }
}
