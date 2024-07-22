package main.java.set.operacoesbasicas;

public class Main {
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem: " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de convidados.");

        conjuntoConvidados.adicionarConvidado("Convidado 1", 1234);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 1236);

        conjuntoConvidados.exibirConvidados();

        System.out.println("Existem: " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de convidados.");

        conjuntoConvidados.removerConvidadoPorCodigoConvite(1234);

        conjuntoConvidados.exibirConvidados();

        System.out.println("Existem: " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de convidados.");



    }
}
