package inmobiliaria;

public class Departamento extends Propiedad {

    private float expensas;

    public Departamento(float expensas, String direcccion, int cantHabitaciones, float precioBaseAlquiler, boolean usoComercial, int cantidadInquilinos) {
        super(direcccion, cantHabitaciones, precioBaseAlquiler, usoComercial, cantidadInquilinos);
        this.expensas = expensas;
    }

    public float getExpensas() {
        return expensas;
    }
    
    @Override
    public float calcularAlquiler() {
        float alquilerDepto = 0;
        if (isUsoComercial()) {
            alquilerDepto = getPrecioBaseAlquiler() + expensas + 500;
        } else {
            alquilerDepto = getPrecioBaseAlquiler() + expensas;
        }
        return alquilerDepto;

    }

    @Override
    public String toString() {
        return "Departamento: " + getDirecccion();
    }
    

}
