package main.java.set.pesquisa;

public class Main {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();
        //Adicionando dentro de um HashSet = Adicionando na ordem aleatória
        agendaContatos.adicionarContato("César", 12345678);
        agendaContatos.adicionarContato("César", 0);
        agendaContatos.adicionarContato("César Fraga", 87654321);
        agendaContatos.adicionarContato("César Aluno", 22334455);
        agendaContatos.adicionarContato("Kaleb Silva", 33445566);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("César"));

        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Kaleb Silva", 99887766));

        agendaContatos.exibirContatos();
    }
}
