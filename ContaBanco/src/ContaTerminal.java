import java.util.Scanner;

public class ContaTerminal {

    int numero;
    String agencia;
    String nomeCliente;
    double saldo;
    Scanner scanner;

    public ContaTerminal(){
        numero = 0;
        agencia = "";
        nomeCliente = "";
        saldo = 0;
        scanner = new Scanner(System.in);
    }

    public void LerInformacoesConta(){

        System.out.println("Por favor insira seu nome: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor insira seu numero: ");
        numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor insira sua agência: ");
        agencia = scanner.nextLine();

        System.out.println("Por favor insira seu saldo: ");
        saldo = scanner.nextDouble();

    }

    public void ImprimirInformacoesConta(){
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua" +
                " agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está" +
                " disponível";

        System.out.print(mensagem);
    }


}
