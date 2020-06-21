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
public class Negocios extends Reserva {

    private boolean conferencia;

    public Negocios(boolean conferencia, int nroHabitacion, int diasReserva, boolean vigente) {
        super(nroHabitacion, diasReserva, vigente);
        this.conferencia = conferencia;
    }

    @Override
    public double calcularTarifa() {

        double precio = 0;

        if (conferencia) {
            precio = 500 * getDiasReserva() + 700;
        } else {
            precio = getDiasReserva() * 500;
        }
        return precio;
    }

    @Override
    public String toString() {
        return "Negocios{" + "conferencia=" + conferencia + '}';
    }

}
