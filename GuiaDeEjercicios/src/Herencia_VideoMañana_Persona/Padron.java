
package Herencia_VideoMañana_Persona;

import java.util.ArrayList;


public class Padron {
    
    private ArrayList<Persona> listaDePersonas;

    public Padron(){
    this.listaDePersonas = new ArrayList<Persona>();
    }
    
    public void agregarPersona(Persona p){
    listaDePersonas.add(p);
    }
    
    public void listarPorConsola() {
        for (Persona p : listaDePersonas) {
            System.out.println(p);
            
        }
        
    }
    
}
