package main.java.map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> estoqueProdutosMap; //Criando um map com chave e valor;

    public EstoqueProdutos() { //Sem parâmetros;
        this.estoqueProdutosMap = new HashMap<>(); //Esperando para receber elementos
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0d;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {  //Extrair só os valores pois nesse caso a chave não importa
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.NEGATIVE_INFINITY; //Método estático.    | MIN_VALUE não é bom nesse cenário
        if(!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if(p.getPreco() > maiorPreco) {
                    maiorPreco = p.getPreco(); //Adicionado após análise, para melhor entendimento do códig
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

}
