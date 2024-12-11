package org.example;

public class Conta {
    protected int numero;
    protected double saldo;

    public Conta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public boolean sacar(double valor) {
        if(saldo >= valor) {
            saldo -=valor;
            return true;
        }
        else {
            System.out.println("Saldo insuficiente");
            return false;
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
