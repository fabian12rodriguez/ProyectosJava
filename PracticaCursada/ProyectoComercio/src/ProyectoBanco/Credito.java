package ProyectoBanco;

public class Credito extends Tarjeta {

    private float limite;

    public Credito(float limite, int numero, float saldo, String titular) {
        super(numero, saldo, titular);
        this.limite = limite;
    }

    @Override
    public boolean depositar(float importe){
        float total = 0;
        total = getSaldo()- importe;
        setSaldo(total);
        return true;    
    }
    
    @Override
    public boolean extraer(float importe){
        boolean exitosa = false;
        if ((getSaldo() + importe) <= limite) {
            float total = getSaldo() + importe;
            setSaldo(total);
            exitosa = true;
        }
        return exitosa;
    }
}
