package org.example;

public class ContaPoupanca extends Conta implements Investimento{
    public ContaPoupanca(int numero,double saldo) {
        super(numero, saldo);
    }
    @Override
    public void reajustar(double percentual) {
        double saldoAtual=  this.getSaldo();
        double reajuste = saldoAtual * percentual;
        this.depositar(reajuste);
        /*saldo += saldo * percentual;*/
    }
}


