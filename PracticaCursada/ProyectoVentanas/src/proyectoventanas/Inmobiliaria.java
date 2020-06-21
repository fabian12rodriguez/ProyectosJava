/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoventanas;

import java.util.ArrayList;

/**
 *
 * @author nbcschneidt2
 */
public class Inmobiliaria {
    private ArrayList<Propiedad> propiedades;

    public Inmobiliaria()
    {
        propiedades = new ArrayList();
    }

    public ArrayList<Propiedad> getPropiedades() {
        return propiedades;
    }
    
    public void agregarPropiedad(Propiedad p)
    {
        propiedades.add(p);
    }
    
    public double promedioAlquileres()
    {
        double acumulador = 0;
        int contador = 0;
        for (Propiedad propiedad : propiedades) {
            if(propiedad.getCantidadInquilinos() == 2)
            {
                acumulador += propiedad.precioAlquiler();
                contador++;
            }
        }
        
        return acumulador / contador;
    }
    
    public int cantidadTresOMas()
    {
        int contador = 0;
        for (Propiedad propiedad : propiedades) {
            if(propiedad instanceof Casa)
            {
                Casa c = (Casa)propiedad;
                if(propiedad.getCantidadHabitaciones() >= 3 && c.isGaraje())
                    contador++;
            }
            
            /*if(propiedad instanceof Casa && propiedad.getCantidadHabitaciones() >= 3 && ((Casa)propiedad).isGaraje())
                contador++;*/
        }
        return contador;
    }
}
