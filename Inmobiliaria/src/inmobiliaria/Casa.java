package inmobiliaria;

public class Casa extends Propiedad {

    private boolean garaje;

    public Casa(boolean garaje, String direcccion, int cantHabitaciones, float precioBaseAlquiler, boolean usoComercial, int cantidadInquilinos) {
        super(direcccion, cantHabitaciones, precioBaseAlquiler, usoComercial, cantidadInquilinos);
        this.garaje = garaje;
    }

    public boolean isGaraje() {
        return garaje;
    }
    

    @Override
    public float calcularAlquiler() {
        float alquilerCasa = 0;
        if (isUsoComercial()) {
            alquilerCasa = getPrecioBaseAlquiler() + 1000;
        } else {
            alquilerCasa = getPrecioBaseAlquiler();
        }
        return alquilerCasa;
    }

    @Override
    public String toString() {
        return "Casa: " + getDirecccion()+" Precio: $"+calcularAlquiler();
    }
    
    
}
