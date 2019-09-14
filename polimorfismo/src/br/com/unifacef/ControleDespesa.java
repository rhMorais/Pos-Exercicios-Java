package br.com.unifacef;

public class ControleDespesa {

    private double total;

    public void registra(Funcionario funcionario){
        total += funcionario.getBonificacao() + funcionario.getSalario();
    }

//    public void registra(Gerente gerente){
//        total += gerente.getBonificacao() + gerente.getSalario();
//    }
//
//    public void registra(Vendedor vendedor){
//        total += vendedor.getBonificacao() + vendedor.getSalario();
//    }
//
//    public void registra(Desenvolvedor desenvolvedor){
//        total += desenvolvedor.getBonificacao() + desenvolvedor.getSalario();
//    }

    public double getTotal(){
        return total;
    }

}
