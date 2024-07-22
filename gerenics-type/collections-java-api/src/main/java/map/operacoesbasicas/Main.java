package main.java.map.operacoesbasicas;

public class Main {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("César", 12345);
        agendaContatos.adicionarContato("César", 5665);
        agendaContatos.adicionarContato("César Fraga", 11111111);
        agendaContatos.adicionarContato("César UNINASSAU", 654987);
        agendaContatos.adicionarContato("Kaleb Silva", 1111111);
        agendaContatos.adicionarContato("César", 44444);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Kaleb Silva");
        agendaContatos.exibirContatos();

        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("César UNINASSAU"));

    }
}
