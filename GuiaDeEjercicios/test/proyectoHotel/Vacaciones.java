package proyectoHotel;

public class Vacaciones extends Reserva {

    private int cantNinios;

    public Vacaciones(int cantNinios, int numeroHabitacion, int diasReservados, boolean vigente) {
        super(numeroHabitacion, diasReservados, vigente);
        this.cantNinios = cantNinios;
    }

    @Override
    public float calcularTarifa() {
        float precio = 0;
        precio = (getDiasReservados() * 600) + (cantNinios * 100);
        return precio;
    }

    @Override
    public String toString() {
        return "Vacaciones" + " Cantidad niños: " + cantNinios;
    }

}
