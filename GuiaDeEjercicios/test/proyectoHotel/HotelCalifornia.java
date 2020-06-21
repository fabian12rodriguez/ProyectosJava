package proyectoHotel;

import java.util.ArrayList;

public class HotelCalifornia {

    private ArrayList<Reserva> reservas;

    public HotelCalifornia() {
        reservas = new ArrayList();

    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void agregarReserva(Reserva r) {
        reservas.add(r);
    }

    public double facturacionTotal() {
        double facturacion = 0;
        for (Reserva r : reservas) {
            facturacion += r.calcularTarifa();
        }
        return facturacion;

    }
    public String reservasPorTipo()
    {
        int contadorVacaciones =0;
        int contadorNegocios =0;
        String resultado = "";
        for (Reserva reserva : reservas) {
            if (reserva instanceof Vacaciones) {
                contadorVacaciones++;
            }
            else if (reserva instanceof Negocio)
            {
                contadorNegocios++;
            }
        }
        resultado = "Cantidad Vacaciones: "+contadorVacaciones+" Cantidad Vacaciones: "+contadorNegocios;
        return resultado;
    }

}
