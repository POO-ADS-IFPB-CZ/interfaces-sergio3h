package org.example;

public class ContaEspecial extends Conta {
    private double limite;

    public ContaEspecial(int numero, double saldo, double limite) {
        super(numero, saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    @Override
    public boolean sacar(double valor) {
        if(valor <= this.limite + this.saldo) {
            this.saldo -= valor;
            return true;
        }else {
            return false;
        }
    }
}
