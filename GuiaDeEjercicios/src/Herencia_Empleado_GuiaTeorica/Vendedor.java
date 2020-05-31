package Herencia_Empleado_GuiaTeorica;

public class Vendedor extends Empleado {

    private float totalVentas;

    public Vendedor(float totalVentas, int legajo, String nombre, float sueldoBasico) {
        super(legajo, nombre, sueldoBasico);
        this.totalVentas = totalVentas;
    }

    @Override
    public float calcularSueldo() {
        float sueldoNeto = 0;
        sueldoNeto = sueldoBasico + (float) (totalVentas * 0.01);
        return sueldoNeto;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\n*****Vendedor*****"
                + "\nTotal ventas: " + totalVentas
                + "\nSueldo a cobrar: " + calcularSueldo();
    }

}
