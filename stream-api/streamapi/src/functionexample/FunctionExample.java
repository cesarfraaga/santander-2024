package functionexample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R.
 * É utilizada para transformar, ou mapear os elementos do Stream em outros valores, ou tipos.
 */
public class FunctionExample {
    public static void main(String[] args) {
        // Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Usar a Function com expressão lambda para dobrar todos os números
        Function<Integer, Integer> dobrar = numero -> numero * 2;
        //caso eu utilize a linha 22, não preciso da linha 17

        // Usar a função para dobrar todos os números no Stream e armazená-los em outra lista
        List<Integer> numerosDobrados = numeros.stream()
                //.map(n -> n * 2) transformação ou conversão é melhor | iteração
                .map(dobrar) //transformação ou conversão é melhor | iteração
                .toList(); //Pegar a transformação que o .map fez e converter em uma list

        // Imprimir a lista de números dobrados
        numerosDobrados.forEach(System.out::println);
    }
}