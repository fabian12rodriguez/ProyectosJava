package Herencia_Empleado_GuiaTeorica;

public abstract class Empleado {

    protected int legajo;
    protected String nombre;
    protected float sueldoBasico;

    public Empleado(int legajo, String nombre, float sueldoBasico) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.sueldoBasico = sueldoBasico;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(float sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    @Override
    public String toString() {
        return "\n*****Empleados*****"
                + "\nLegajo: " + legajo
                + "\nNombre: " + nombre;
               
    }

    public float calcularSueldo() {
        return 0;

}

}
