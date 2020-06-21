/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia_VideoMañana_Persona;
import java.util.ArrayList;

/**
 *
 * @author fabia
 */
public class Persona {
    private String nombre;
    private String apellido ;
    private int edad;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre= " + nombre + ", apellido= " + apellido + ", edad= " + edad + '}';
    }
    
}
