package br.com.unifacef;

public class MaiorNumero {
    private int num1;
    private int num2;

    public MaiorNumero (int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public String Get(){
        if (num1 > num2)
            return num1 + " é maior que " + num2;
        else if (num1 < num2)
            return num2 + " é maior que " + num1;
        else
            return num2 + " e " + num1 + " são iguais!";
    }
}
