package competicao;

public class Carro {
    public void ligar() { //apenas um método público
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
