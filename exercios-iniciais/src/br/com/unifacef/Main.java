package br.com.unifacef;

public class Main {
    public static void main(String[] args) {
        MaiorNumero maiorNumero = new MaiorNumero(3, 5);

        //System.out.println(maiorNumero.Get());

        for (Status status : Status.values()){
            System.out.println(status.getTipo() + " - " + status.getNome());
        }
    }
}
