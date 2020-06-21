package Herencia_VideoMañana;

import Herencia_VideoMañana_Persona.Padron;
import Herencia_VideoMañana_Persona.Persona;
import Herencia_VideoMañana_vista.Ventana_Persona;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        /*
        ArrayList<Integer> coleccion = new ArrayList<Integer>();
        
        coleccion.add(1);
        coleccion.add(2);
        coleccion.add(2);
        coleccion.add(2);
        for (Integer i : coleccion) {
            
            System.out.println("I:" + i);
        }*/
 /*
        ArrayList<Persona> c = new ArrayList<Persona>();
        c.add(new Persona("Juan", "Perez", 30));
        c.add(new Persona("Tito", "Puente", 22));
        c.add(new Persona("Lalo", "Landa", 15));

        for (Persona persona : c) {
            System.out.println(persona);

        }*/
        //String nombre = "Pepe";
        Padron padron = new Padron();
        Ventana_Persona vp = new Ventana_Persona(padron);
        vp.setVisible(true);

    }

}
