package escola;
public class Escola {
    public static void main(String[] args) {
        Aluno kaleb = new Aluno();
        kaleb.setNome("Kaleb da Silva");
        kaleb.setIdade(4);
        kaleb.setSexo("Masculino");

        System.out.println("O aluno " + kaleb.getNome() + " tem " + kaleb.getIdade() + " " +
                "anos e é do sexo " + kaleb.getSexo());
    }
}