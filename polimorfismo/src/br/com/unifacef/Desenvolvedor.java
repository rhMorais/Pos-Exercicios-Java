package br.com.unifacef;

public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    public Desenvolvedor() {
    }

    public double getBonificacao(){
        return getSalario() * 10 / 100;
    }
}
