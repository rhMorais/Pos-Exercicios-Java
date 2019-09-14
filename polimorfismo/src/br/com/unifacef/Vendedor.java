package br.com.unifacef;

public class Vendedor extends Funcionario{
    public Vendedor(String nome, double salario) {
        super(nome, salario);
    }

    public Vendedor() {
    }

    public double getBonificacao(){
        return getSalario() * 15 / 100;
    }
}
