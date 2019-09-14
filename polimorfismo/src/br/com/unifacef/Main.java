package br.com.unifacef;

public class Main {

    public static void  main (String[] args){

        Gerente gerente = new Gerente();
        gerente.setNome("Rafael");
        gerente.setSalario(1000);
        System.out.println("Bonificação gerente: " + gerente.getBonificacao());
        gerente.getBonificacao();

        Vendedor vendedor = new Vendedor("Madruga", 500);
        System.out.println("Bonificação vendedor: " + vendedor.getBonificacao());

        Desenvolvedor desenvolvedor = new Desenvolvedor("Girafales", 700);
        System.out.println("Bonificação desenvolvedor: " + desenvolvedor.getBonificacao());

        ControleDespesa controle = new ControleDespesa();
        controle.registra(gerente);
        System.out.println("Total: " + controle.getTotal());

        controle.registra(vendedor);
        System.out.println("Total: " + controle.getTotal());

        controle.registra(desenvolvedor);
        System.out.println("Total: " + controle.getTotal());
    }
}
