package Herencia_Empleado_GuiaTeorica;

public class Administrador extends Empleado {

    private boolean presentismo;

    public Administrador(boolean presentismo, int legajo, String nombre, float sueldoBasico) {
        super(legajo, nombre, sueldoBasico);
        this.presentismo = presentismo;
    }

    @Override
    public float calcularSueldo() {
        double constante = 1.13;
        float sueldoNeto = 0;
        if (presentismo) {
            sueldoNeto = sueldoBasico * (float) constante;

        } else {
            sueldoNeto = sueldoBasico;
        }
        return sueldoNeto;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\n*****Administador*****"
                + "\nSueldo a cobrar: " + calcularSueldo();
    }

}
