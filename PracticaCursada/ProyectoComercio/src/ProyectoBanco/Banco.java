package ProyectoBanco;

import java.util.ArrayList;

public class Banco {

    private ArrayList<Tarjeta> tarjetas;

    public Banco() {
        tarjetas = new ArrayList<Tarjeta>();
    }

    public void agregarTarjeta(Tarjeta t) {
        tarjetas.add(t);
    }

       public boolean extraer(int numero, int tipoTarjeta, float importe) {
        boolean operacionExitosa = false;
        for (Tarjeta tarjeta : tarjetas) {
            if (tipoTarjeta == 0) { //tarjeta debito
                if (tarjeta instanceof Debito && tarjeta.getNumero() == numero) {
                    operacionExitosa = tarjeta.extraer(importe);
                    break;
                }
            } else if(tipoTarjeta == 1) { //tarjeta debito
                if (tarjeta instanceof Credito && tarjeta.getNumero() == numero) {
                    operacionExitosa = tarjeta.extraer(importe);
                    break;
                }
            }
        }
        return operacionExitosa;
    }
    
    public boolean depositar(int numero, int tipoTarjeta, float importe) {
        boolean operacionExitosa = false;
        for (Tarjeta tarjeta : tarjetas) {
            if (tipoTarjeta == 0) { //tarjeta debito
                if (tarjeta instanceof Debito && tarjeta.getNumero() == numero) {
                    operacionExitosa = tarjeta.depositar(importe);
                    break;
                }
            } else if(tipoTarjeta == 1) { //tarjeta debito
                if (tarjeta instanceof Credito && tarjeta.getNumero() == numero) {
                    operacionExitosa = tarjeta.depositar(importe);
                    break;
                }
            }
        }
        return operacionExitosa;
    }

    public float saldoTotalTD() {
        float saldoTotal = 0;
        for (Tarjeta tarjeta1 : tarjetas) {
            if (tarjeta1 instanceof Debito) {
                saldoTotal += tarjeta1.getSaldo();
            }

        }
        return saldoTotal;

    }

    public float saldoPromedioTC() {
        int contador = 0;
        float acumulador = 0;
        float promedio = 0;
        for (Tarjeta tarjeta1 : tarjetas) {
            if (tarjeta1 instanceof Credito) {
                acumulador += tarjeta1.getSaldo();
                contador++;
            }
        }
        promedio = acumulador / contador;
        return promedio;
    }

}
