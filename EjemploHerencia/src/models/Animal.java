/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author kevin
 */
public class Animal {
    
    //Atributos 
    private String tipo;
    private String nombre;
    private String raza;
    private String tamanio;
    private String color;
    
    
    //Metodos
    public void caminar () {
        System.out.println("Estoy Caminando");
    }
    
    public void comer(){
        System.out.println("Estoy Comiendo");
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    
    }

    @Override
    public String toString() {
        return "Animal{" + "tipo=" + tipo + ", nombre=" + nombre + ", raza=" + raza + ", tamanio=" + tamanio + ", color=" + color + '}';
    }
    
    
    
}
