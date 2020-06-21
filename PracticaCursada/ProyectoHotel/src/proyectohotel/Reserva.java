/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectohotel;

/**
 *
 * @author Lucas
 */
public abstract class Reserva {
    private int nroHabitacion;
    private int diasReserva;
    private boolean vigente;

    public Reserva(int nroHabitacion, int diasReserva, boolean vigente) {
        this.nroHabitacion = nroHabitacion;
        this.diasReserva = diasReserva;
        this.vigente = vigente;
    }

    public int getNroHabitacion() {
        return nroHabitacion;
    }

    public int getDiasReserva() {
        return diasReserva;
    }

    public boolean isVigente() {
        return vigente;
    }
    
    public abstract double calcularTarifa();
}
