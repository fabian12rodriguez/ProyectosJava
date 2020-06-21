/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectohotel;

import java.util.ArrayList;

/**
 *
 * @author Lucas
 */
public class Hotel {

    private ArrayList<Reserva> reservas; //PASO 1 - CREAMOS LA LISTA

    public Hotel() { //PASO 2  - CONSTRUCTOR no lleva parametros 
        this.reservas = new ArrayList(); //metodo arraylist
    }

    public ArrayList<Reserva> getReservas() { //PASO 3 - GETTER DE LA LISTA
        return reservas;
    }
    
    public void agregarReserva(Reserva nuevaReserva){ //PASO 4 - CREAMOS EL METODO AGREGAR RESERVA QUE AGREGA RESERVAS A LA LISTA
        
        reservas.add(nuevaReserva);//agrega la reserva a la lista
    }
    
    public double facturacionTotal(){
        double facturacion=0;
        
        for (Reserva reserva : reservas) {
            if (reserva.isVigente()) {
                 facturacion+= reserva.calcularTarifa();   
            }                    
        }
        return facturacion;
    }
    
    public String cantReservaPorTipo(){
        int contadorVacaciones=0;
        int contadorNegocios=0;
        String resultado="";     
       
        for (Reserva reserva : reservas) {
            if (reserva instanceof Vacaciones) {
               contadorVacaciones++;                
              
            }
            
            else if (reserva instanceof Negocios){
                contadorNegocios++;
                
            }
        }
               
        return resultado= "Cantidad de Reservas de Vacaciones: "  + contadorVacaciones 
                           + "\n Cantidad de Reservas de Negocios: " + contadorNegocios;
    }
    
    
}
