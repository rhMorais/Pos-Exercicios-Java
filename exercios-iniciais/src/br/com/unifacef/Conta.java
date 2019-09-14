package br.com.unifacef;

import java.util.Date;

public class Conta {
    static final double LIMITE_INICIAL = 1000;

    private int numero;
    private double saldo;
    private double limite;
    private Date vencimento;

    public Conta(int numero, Date vencimento) {
        this.numero = numero;
        this.vencimento = vencimento;
        this.limite = LIMITE_INICIAL;
    }

    public Conta(int numero, double saldo, Date vencimento) {
        this.numero = numero;
        this.saldo = saldo;
        this.vencimento = vencimento;
        this.limite = LIMITE_INICIAL;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public Date getVencimento() {
        return vencimento;
    }

    public void setVencimento(Date vencimento) {
        this.vencimento = vencimento;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void sacar(double valor){
        this.saldo -= valor;
    }
}
