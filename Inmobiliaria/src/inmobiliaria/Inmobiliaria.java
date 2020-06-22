package inmobiliaria;

import java.util.ArrayList;

public class Inmobiliaria {

    private ArrayList<Propiedad> propiedades;

    public Inmobiliaria() {
        propiedades = new ArrayList<>();
    }

    public void agregarPropiedad(Propiedad p) {
        propiedades.add(p);
    }

    public ArrayList<Propiedad> getPropiedades() {
        return propiedades;
    }

    public float promedioAlquileres() {
        float promedio = 0;
        int contador = 0;
        float acumulador = 0;
        for (Propiedad propiedades1 : propiedades) {
            if (propiedades1.getCantidadInquilinos() >= 2) {
                acumulador += propiedades1.calcularAlquiler();
                contador++;
            }

        }
        
        if (acumulador > 0) {
            promedio = acumulador / contador;
        }
        else {
            promedio = 0;
        }
        
        return promedio;
    }

    public  int cantidadCasas3HabitacionesOMas() {
        int contador = 0;
        for (Propiedad propiedades1 : propiedades) {

            if (propiedades1 instanceof Casa && propiedades1.getCantHabitaciones() >= 3) {
                Casa c = (Casa) propiedades1;
                if (c.isGaraje()) {
                    contador++;
                }
            }
        }
        return contador;
    }

}
