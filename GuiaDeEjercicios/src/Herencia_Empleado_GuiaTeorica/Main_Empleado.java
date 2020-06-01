package Herencia_Empleado_GuiaTeorica;

import java.util.Scanner;

public class Main_Empleado {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        float sueldoObrero = 0, sueldoAdministrativo = 0, sueldoVendedores = 0, totalGeneral = 0, promedioSueldoObrero = 0, menor = 0;
        String nombreMenor = "";
        int contadorObrero = 0;
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
                sueldoObrero += o.calcularSueldo();
                contadorObrero++;
            } else if (tipoEmpleado == 2) {
                System.out.println("Ingrese 1-Si cumplio con el presentismo 2-Si no cumplio: ");
                int cumplioPresentismo = lector.nextInt();
                if (cumplioPresentismo == 1) {
                    Administrador a = new Administrador(true, legajo, nombre, sueldoBasico);
                    e[i] = a;
                    sueldoAdministrativo += a.calcularSueldo();
                } else {
                    Administrador a = new Administrador(false, legajo, nombre, sueldoBasico);
                    e[i] = a;
                    sueldoAdministrativo += a.calcularSueldo();
                }
            } else if (tipoEmpleado == 3) {
                System.out.println("Ingrese total de ventas: ");
                float totalVentas = lector.nextFloat();
                Vendedor v = new Vendedor(totalVentas, legajo, nombre, sueldoBasico);
                e[i] = v;
                sueldoVendedores += v.calcularSueldo();
            }
            if (i == 0) {
                menor = e[i].calcularSueldo();
                nombreMenor = e[i].toString();
            } else {
                if (e[i].calcularSueldo() < menor) {
                    menor = e[i].calcularSueldo();
                    nombreMenor = e[i].toString();
                }
            }
        }
        totalGeneral = sueldoObrero + sueldoAdministrativo + sueldoVendedores;
        promedioSueldoObrero = sueldoObrero / (float)contadorObrero;
        for (Empleado empleado : e) {
            System.out.println(empleado.toString());
        }
        System.out.println("\n-----------------------------");
        System.out.println("Sueldo a pagar a obreros: " + sueldoObrero);
        System.out.println("Sueldo a pagar a administrativos: " + sueldoAdministrativo);
        System.out.println("Sueldo a pagar a vendedores: " + sueldoVendedores);
        System.out.println("\n-----------------------------");
        System.out.println("Total de sueldos a pagar: " + totalGeneral);
        System.out.println("\n-----------------------------");
        System.out.println("Empleado que menos sueldo cobra: " + nombreMenor);
        System.out.println("\n-----------------------------");
        System.out.println("Promedio genral de sueldos: " + promedioSueldoObrero);
    }
}
