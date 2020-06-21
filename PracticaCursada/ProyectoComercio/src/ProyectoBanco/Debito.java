package ProyectoBanco;

public class Debito extends Tarjeta {

    public Debito(int numero, float saldo, String titular) {
        super(numero, saldo, titular);
    }

    @Override
    public boolean depositar(float importe){
        float total = 0;
        total = getSaldo() + importe;
        setSaldo(total);
        return true;
    }
    
    @Override
    public boolean extraer(float importe){
        boolean exitosa = false;
        if (getSaldo() >= importe) {
            float total = getSaldo() - importe;
            setSaldo(total);
            exitosa = true;
        }
        return exitosa;
    }

}
