import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        float valorSalario = scanner.nextFloat();
        float valorBeneficios = scanner.nextFloat();

        float valorImposto = valorSalario >=0 && valorSalario <=1100 ? 0.05f * valorSalario :
                valorSalario >= 1100 && valorSalario <=2500 ? 0.10f * valorSalario : 0.15f * valorSalario;
        float saida = valorSalario - valorImposto + valorBeneficios;
        System.out.print(String.format("%.2f", saida));
    }
}