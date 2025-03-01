import java.util.Scanner;

public class ContaTerminal {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        int numero = scanner.nextInt();
        System.out.print("Digite a agência: ");
        String agencia = scanner.next();
        System.out.print("Digite seu nome: ");
        String nomeCliente = scanner.next();
        System.out.print("Digite seu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.print("Olá " + nomeCliente + ",obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ",conta " +  numero  + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}
