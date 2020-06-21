
package proyectoHotel;

public class Negocio extends Reserva {

    public boolean conferencia;

    public Negocio(int numeroHabitacion, int diasReservados, boolean vigente) {
        super(numeroHabitacion, diasReservados, vigente);
    }

    @Override
    public float calcularTarifa() {
        float precio = 0;

        if (conferencia) {
            precio = (getDiasReservados() * 500) + 700;

        } else {
            precio = (getDiasReservados() * 500);
        }

        return precio;
    }

    @Override
    public String toString() {
        return "Negocio " + " Conferencia: " + conferencia;
    }

}
