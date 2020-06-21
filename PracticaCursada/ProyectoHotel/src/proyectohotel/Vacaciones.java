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
public class Vacaciones extends Reserva {

    private int cantNinios;

    public Vacaciones(int cantNinios, int nroHabitacion, int diasReserva, boolean vigente) {
        super(nroHabitacion, diasReserva, vigente);
        this.cantNinios = cantNinios;
    }

    @Override
    public double calcularTarifa() {

        double precio = 0;

        return precio = (getDiasReserva() * 600) + getDiasReserva()*(cantNinios * 100);
    }

    @Override
    public String toString() {
        return "Vacaciones{" + "cantNinios=" + cantNinios + '}';
    }

}
