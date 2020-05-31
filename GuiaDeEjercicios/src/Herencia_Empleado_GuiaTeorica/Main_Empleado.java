package Herencia_Empleado_GuiaTeorica;

import java.util.Scanner;

public class Main_Empleado {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese cantidad de empleados: ");
        int cantidadEmpleados = lector.nextInt();
        Empleado e[] = new Empleado[cantidadEmpleados];

        for (int i = 0; i < e.length; i++) {
            System.out.println("\nIngrese legajo del empleado: ");
            int legajo = lector.nextInt();
            lector.nextLine();
            System.out.println("Ingrese empleado: ");
            String nombre = lector.nextLine();
            System.out.println("Ingrese sueldo basico del empleado: ");
            float sueldoBasico = lector.nextFloat();
            System.out.println("Ingrese tipo de empleado: 1-Obrero 2-Administrativo 3-Vendedor");
            int tipoEmpleado = lector.nextInt();

            if (tipoEmpleado == 1) {

                System.out.println("Ingrese dias trabajados del empleado: ");
                int diasTrabajados = lector.nextInt();
                Obrero o = new Obrero(diasTrabajados, legajo, nombre, sueldoBasico);
                e[i] = o;

            } else if (tipoEmpleado == 2) {

                System.out.println("Ingrese 1-Si cumplio con el presentismo 2-Si no cumplio: ");
                int cumplioPresentismo = lector.nextInt();
                if (cumplioPresentismo == 1) {
                    Administrador a = new Administrador(true, legajo, nombre, sueldoBasico);
                    e[i] = a;

                } else {
                    Administrador a = new Administrador(false, legajo, nombre, sueldoBasico);
                    e[i] = a;
                }

            } else if (tipoEmpleado == 3) {

                System.out.println("Ingrese total de ventas: ");
                float totalVentas = lector.nextFloat();
                Vendedor v = new Vendedor(totalVentas, legajo, nombre, sueldoBasico);
                e[i] = v;

            }

        }
        for (Empleado empleado : e) {
            System.out.println(empleado.toString());

        }

    }

}
