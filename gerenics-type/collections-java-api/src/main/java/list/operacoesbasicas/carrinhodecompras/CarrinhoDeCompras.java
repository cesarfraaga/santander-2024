package main.java.list.operacoesbasicas.carrinhodecompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        itemList.add(new Item(nome, preco, quantidade));
    }
    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        if (!itemList.isEmpty()) {
            for (Item i : itemList) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(i);
                }
            }
            itemList.removeAll(itensParaRemover);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public void removerUmItem(String nome) { // Void pois não retorna nada. Remove a partir do nome.
        List<Item> itemListAux = new ArrayList<>(itemList); //Declara e instancia uma Lista auxiliar, a partir da itemList.
        //itemListAux.addAll(itemList);     Modo rústico

        for (Item item : itemListAux) { //Itera sobre a lista auxiliar.
            if (item.getNome().equalsIgnoreCase(nome)) { //Se o nome do item for igual ao parâmetro passado no método
                if (item.getQuantidade() > 0) { //Se a quantidade de itens for maior que 0
                    int qtdSubtraida = item.getQuantidade() - 1; // Cria uma variável que armazena o novo valor de item -1.

                    if (qtdSubtraida == 0) { //Se a quantidade atualizada de itens for igual a 0
                        itemList.remove(item); //Remove o item da itemList;
                    } else {
                        item.setQuantidade(qtdSubtraida); //Altera o valor do atributo quantidade do Item
                    }
                }
                break; //Caso encontre o item, interrompe o fluxo/laço.
            } else {
                System.out.println("Item não encontrado.");
            }
        }
    }

    public double calcularValorTotal() {
        double valorTotal = 0.0;
        for (Item item : itemList) {
            double valorItem = item.calcularValorTotal();
            valorTotal += valorItem;
        }
        return valorTotal;
    }

    public void exibirItens() {
        System.out.println(itemList);
    }
}
