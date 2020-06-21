/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoventanas;

/**
 *
 * @author nbcschneidt2
 */
public class Departamento extends Propiedad {
    private double expensas;

    public Departamento(String direccion, int cantidadHabitaciones, double precio, boolean usoComercial, int cantidadInquilinos, double expensas) {
        super(direccion, cantidadHabitaciones, precio, usoComercial, cantidadInquilinos);
        this.expensas = expensas;
        
    }
    
    @Override
    public double precioAlquiler()
    {
        double precio = getPrecio() + expensas;
        
        if(isUsoComercial())
            precio += 500;
        
        return precio;
    }
    
    public String toString()
    {
        return "Departamento: Direccion: " + getDireccion();
    }
}
