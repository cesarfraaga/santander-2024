package main.java.list.operacoesbasicas.carrinhodecompras;

public class Item {
    private String nome;
    private double preco;
    private int quantidade;

    public Item(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return this.nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return this.preco;
    }

    public double calcularValorTotal() {
        return (double) this.quantidade * this.preco;
    }

    @Override
    public String toString() {
        return "Item: " + nome + " | Preço: " + preco + " | Quantidade: " + quantidade;
    }
}

