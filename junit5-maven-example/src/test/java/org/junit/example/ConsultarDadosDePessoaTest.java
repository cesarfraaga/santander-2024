package org.junit.example;

import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

public class ConsultarDadosDePessoaTest {

    @BeforeAll
    public static void configurarConexao() {
        BancoDeDados.iniciarConexao();
    }

    @BeforeEach
    void insereDadosParaTeste() {
        BancoDeDados.inserirDados(new Pessoa("João", LocalDateTime.of(2000, 1, 1, 13, 0, 0)));
    }

    @AfterEach
    void removeDadosDoTeste() {
        BancoDeDados.removerDados(new Pessoa("João", LocalDateTime.of(2000, 1, 1, 13, 0, 0)));
    }

    @Test
    public void validarDadosDeRetorno() {
        Assertions.assertTrue(true);
    }

    @Test
    public void validarDadosDeRetorno2() {
        Assertions.assertNull(null);
    }

    @AfterAll
    public static void finalizarConexao() {
        BancoDeDados.finalizarConexao();
    }
}
