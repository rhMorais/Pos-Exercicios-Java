package br.com.unifacef;

public class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    public Gerente() {
    }

    public double getBonificacao(){
        return getSalario() * 25 / 100;
    }
}
