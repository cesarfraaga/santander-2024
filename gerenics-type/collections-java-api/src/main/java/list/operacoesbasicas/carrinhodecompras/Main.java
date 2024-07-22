package main.java.list.operacoesbasicas.carrinhodecompras;

public class Main {
    public static void main(String[] args) {

        CarrinhoDeCompras carrinhoUm = new CarrinhoDeCompras();

        carrinhoUm.adicionarItem("Caneleira", 120.0, 2);
        carrinhoUm.adicionarItem("Luva", 80.0, 1);
        carrinhoUm.adicionarItem("Bandagem", 35.0, 1);

        carrinhoUm.exibirItens(); //Deve ter todos os itens

        carrinhoUm.removerUmItem("Caneleira");
        carrinhoUm.exibirItens(); //Deve ter uma caneleira

        carrinhoUm.removerUmItem("Caneleira");
        carrinhoUm.exibirItens(); //Não deve ter caneleira

        carrinhoUm.removerUmItem("Caneleira");
        carrinhoUm.exibirItens(); //

        System.out.println("O valor total do carrinho é: R$" + carrinhoUm.calcularValorTotal());

    }
}
