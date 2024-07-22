package exampleMapAI;

public class SistemaNotas {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João");
        aluno1.adicionarNota("Matemática", 85);
        aluno1.adicionarNota("História", 90);
        aluno1.adicionarNota("Ciências", 78);

        Aluno aluno2 = new Aluno("Maria");
        aluno2.adicionarNota("Matemática", 92);
        aluno2.adicionarNota("História", 88);
        aluno2.adicionarNota("Ciências", 95);

        aluno1.imprimirNotas();
        System.out.println("Média de " + aluno1.getNome() + ": " + aluno1.calcularMedia());

        aluno2.imprimirNotas();
        System.out.println("Média de " + aluno2.getNome() + ": " + aluno2.calcularMedia());
    }
}
