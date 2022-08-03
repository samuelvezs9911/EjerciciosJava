/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

/**
 *
 * @author samue
 */
public class Rectangulo implements Forma{
    private float ancho, largo, area;

    //Constructores
    public Rectangulo(float largo, float ancho){
        this.largo =largo;
        this.ancho=ancho;
    }
    public Rectangulo(){
        
    }
    
    @Override
    public void CalculaArea() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
//Sobre-carga
    @Override
    public void CalculaArea(float largo, float ancho) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getLargo() {
        return largo;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    //Sobre-escritura 
    @Override
    public String toString() {
        return "Rectangulo{" + "ancho=" + ancho + ", largo=" + largo + ", area=" + area + '}';
    }
    
    
    
    
}
