package Herencia_Empleado_GuiaTeorica;

public class Obrero extends Empleado {

    private int diasTrabajados;

    public Obrero(int diasTrabajados, int legajo, String nombre, float sueldoBasico) {
        super(legajo, nombre, sueldoBasico);
        this.diasTrabajados = diasTrabajados;
    }

    @Override
    public float calcularSueldo() {
        float sueldoNeto = diasTrabajados * (sueldoBasico / 22);

        return sueldoNeto;
    }

    @Override
    public String toString() {
        return super.toString()
                +"\n*****Obrero*****" 
                + "\nDias trabajados: " + diasTrabajados
                 + "\nSueldo a cobrar: " + calcularSueldo();

    }

}
