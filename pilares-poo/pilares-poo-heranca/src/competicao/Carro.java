package competicao;

public class Carro extends Veiculo {
    @Override
    public void ligar() {
        conferirCombustivel();
        conferirCambio();
        System.out.println("O carro foi ligado");
    }

    private void conferirCombustivel() { //encapsulamento
        System.out.println("Conferindo combustível");
    }

    private void conferirCambio() {
        System.out.println("Conferindo câmbio em P");
    }
}
