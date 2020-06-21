/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoBanco;

/**
 *
 * @author fabia
 */
public abstract class Tarjeta {

    private int numero;
    private float saldo;
    private String titular;

    public Tarjeta(int numero, float saldo, String titular) {
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    
    public abstract boolean depositar(float importe);
    public abstract boolean extraer(float importe);
    
    
    
    
    
}
