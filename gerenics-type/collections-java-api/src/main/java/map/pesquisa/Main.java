package main.java.map.pesquisa;

public class Main {
    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();
        estoque.exibirProdutos();

        estoque.adicionarProduto(1L, "Produto A", 10, 5.0d);
        estoque.adicionarProduto(2L, "Produto B", 5, 10.0d);
        estoque.adicionarProduto(3L, "Produto C", 2, 15.0d);
        estoque.adicionarProduto(8L, "Produto D", 2, 20.0d);

        estoque.exibirProdutos();

        System.out.println("Valor total do estoque: R$" +estoque.calcularValorTotalEstoque());
        System.out.println("Produto mais caro: " + estoque.obterProdutoMaisCaro());

    }
}
