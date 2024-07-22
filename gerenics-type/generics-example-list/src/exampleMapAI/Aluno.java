package exampleMapAI;

import java.util.HashMap;
import java.util.Map;

class Aluno {
    private String nome;
    private Map<String, Integer> notas;

    public Aluno(String nome) {
        this.nome = nome;
        this.notas = new HashMap<>();
    }

    public void adicionarNota(String disciplina, int nota) {
        notas.put(disciplina, nota);
    }

    public void imprimirNotas() {
        System.out.println("Notas de " + nome + ":");
        for (Map.Entry<String, Integer> entry : notas.entrySet()) {
            String disciplina = entry.getKey();
            int nota = entry.getValue();
            System.out.println("Disciplina: " + disciplina + ", Nota: " + nota);
        }
    }

    public double calcularMedia() {
        int totalNotas = 0;
        for (int nota : notas.values()) {
            totalNotas += nota;
        }
        return totalNotas / (double) notas.size();
    }

    public String getNome() {
        return nome;
    }
}
