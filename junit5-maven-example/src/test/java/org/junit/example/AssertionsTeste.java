package org.junit.example;

import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;


public class AssertionsTeste {

    @Test
    public void validarLancamentos(){

        int[] primeiroLancamento = {10, 20, 30, 40, 50};
        int[] segundoLancamento = {10, 20, 30, 40, 50};

        assertArrayEquals(primeiroLancamento, segundoLancamento);

    }

    @Test
    public void validarSeObjetoEstiverNull() {
        Pessoa pessoa = null;

        assertNull(pessoa);

        pessoa = new Pessoa("Rosangela", LocalDateTime.now());

        assertNotNull(pessoa);
    }

    @Test
    public void validarNumerosDeTiposDiferentes() {
        double valor = 5.0;
        int outroValor = 5;

        assertEquals(valor, outroValor);
    }

}
