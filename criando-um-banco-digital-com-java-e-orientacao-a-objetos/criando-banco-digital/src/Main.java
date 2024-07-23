public class Main {
    public static void main(String[] args) {
        Cliente cesar = new Cliente();
        cesar.setNome("César");

        Conta cc = new ContaCorrente(cesar);
        cc.depositar(100);

        Conta poupanca = new ContaPoupanca(cesar);

        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}
