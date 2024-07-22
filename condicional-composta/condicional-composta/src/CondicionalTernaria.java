import java.util.Scanner;
public class CondicionalTernaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua nota: ");
        double nota = scanner.nextInt();

        String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);

    }
} 