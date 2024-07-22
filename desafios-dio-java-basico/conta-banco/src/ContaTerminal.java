import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Seja bem vindo a criação de contas do Banco César");
        System.out.println("Digite o seu nome completo: ");
        String nomeCliente = scanner.nextLine();
        System.out.println("Digite o número da sua conta: ");
        int numeroConta = scanner.nextInt();
        System.out.println("Digite o número da agência: ");
        String agencia = scanner.next();
        System.out.println("Digite o saldo inicial a ser depositado: ");
        Double saldo = scanner.nextDouble();

        System.out.println("Olá "+ nomeCliente + ", obrigado por criar uma conta em nosso banco, sua " + 
                        "agência "+ agencia + ", conta "+ numeroConta + " e seu saldo de "+ saldo + " reais " + 
                        "já está disponível para saque.");


    }
}

