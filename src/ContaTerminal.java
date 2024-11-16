import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu Nome: ");
        String nome = sc.next();

        System.out.print("Digite sua agencia ");
        String agencia = sc.next();

        System.out.print("Digite o numero da sua conta: ");
        int numero = sc.nextInt();

        System.out.print("Digite o valor do depósito: ");
        double saldo = sc.nextDouble();

        System.out.println("Olá "+ nome +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta: "+ numero  + " e seu saldo de R$ "+  saldo +" já está disponível para saque.");

    }
}