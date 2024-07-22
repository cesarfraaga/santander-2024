public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };
    
        for (int x=0; x<alunos.length; x++) { //tamanho
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }
    
    }
}