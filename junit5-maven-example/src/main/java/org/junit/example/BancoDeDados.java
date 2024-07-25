package org.junit.example;

import java.util.logging.Logger;

public class BancoDeDados {

    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

    public static void iniciarConexao() {
        //fez algo
        LOGGER.info("iniciou conexao");
    }
    public static void finalizarConexao() {
        //fez algo
        LOGGER.info("finalizou conexao");
    }

    public static void inserirDados(Pessoa pessoa) {
        //insere pessoa no BD
        LOGGER.info("Inseriu dados");
    }    public static void  removerDados(Pessoa pessoa) {
        //removeu pessoa no BD
        LOGGER.info("removeu dados");
    }
}
