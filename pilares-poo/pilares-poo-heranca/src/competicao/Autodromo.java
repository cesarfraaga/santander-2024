package competicao;

public class Autodromo  {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setChassi("123456");
        //carro.ligar();

        Moto moto = new Moto();
        moto.setChassi("654321");
        moto.ligar();

        Veiculo coringa = moto;
        //coringa.ligar();
    }
}
