package proyectoHotel;

public abstract class Reserva {

    private int numeroHabitacion;
    private int diasReservados;
    private boolean vigente;

    public Reserva(int numeroHabitacion, int diasReservados, boolean vigente) {
        this.numeroHabitacion = numeroHabitacion;
        this.diasReservados = diasReservados;
        this.vigente = vigente;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public int getDiasReservados() {
        return diasReservados;
    }

    public boolean isVigente() {
        return vigente;
    }
    public abstract float calcularTarifa();

}
