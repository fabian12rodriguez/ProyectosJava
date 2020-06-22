
package inmobiliaria;

public abstract class Propiedad {
    
    private String direcccion;
    private int cantHabitaciones;
    private float precioBaseAlquiler;
    private boolean usoComercial;
    private int cantidadInquilinos;

    public Propiedad(String direcccion, int cantHabitaciones, float precioBaseAlquiler, boolean usoComercial, int cantidadInquilinos) {
        this.direcccion = direcccion;
        this.cantHabitaciones = cantHabitaciones;
        this.precioBaseAlquiler = precioBaseAlquiler;
        this.usoComercial = usoComercial;
        this.cantidadInquilinos = cantidadInquilinos;
    }

    public String getDirecccion() {
        return direcccion;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public float getPrecioBaseAlquiler() {
        return precioBaseAlquiler;
    }

    public boolean isUsoComercial() {
        return usoComercial;
    }

    public int getCantidadInquilinos() {
        return cantidadInquilinos;
    }

    public abstract float calcularAlquiler();
    
}
