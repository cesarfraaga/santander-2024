package sus;

import vida.Pessoa;

import java.util.Scanner;

public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("123.456.789-10", "Kaleb");
        Scanner scanner = new Scanner(System.in);

        System.out.println(pessoa + ", digite seu bairro: ");

        pessoa.setEndereco(scanner.nextLine());

        System.out.println(pessoa.getNome() + ", registrado no CPF " + pessoa.getCpf() + ", mora no bairro" +
                " " + pessoa.getEndereco() + ".");
    }
}

