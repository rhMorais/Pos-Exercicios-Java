package br.com.unifacef;

public enum Status {
    ATIVO("A", "ativo"),
    INATIVO("I", "inativo"),
    CANCELADO("C", "cancelado");

    final String tipo;
    final String nome;

    Status(String tipo, String nome){
        this.tipo = tipo;
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }
}
