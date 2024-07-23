package binaryoperatorexample;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/*Representa uma operação que combina dois argumentops do tipo T e retorna um resultado do mesmo tipo T.
* É usada para realizar operação de redução em pares de elementos, como somar números ou combinar trajetos*/

public class BinaryOperatorExample {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        BinaryOperator<Integer> somar = Integer::sum;

        int resultado = numeros.stream() //numeros transformados em stream
                //.reduce(0, somar); //reduce para implementar o binaryOperator || identity = variarvel temporária
                .reduce(0, somar); //reduce para implementar o binaryOperator || identity = variarvel temporária

        System.out.println("A soma dos números é: " + resultado);

    }

}
