package org.junit.example;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PessoaTest {

    @Test
    public void deveCalcularIdadeCorretamente() {

        Pessoa pessoa = new Pessoa("Jennifer", LocalDateTime.of(1995, 2, 24, 15, 0, 0));
        Assertions.assertEquals(29, pessoa.getIdade());
    }

    @Test
    public void deveRetornarSeForMaiorDeIdade() {
        Pessoa pessoa = new Pessoa("Jennifer", LocalDateTime.of(1995, 2, 24, 15, 0, 0));
        Assertions.assertTrue(pessoa.MaiorDeIdade());

        Pessoa pessoa2 = new Pessoa("Francisco César", LocalDateTime.now());
        Assertions.assertFalse(pessoa2.MaiorDeIdade());
    }
}
