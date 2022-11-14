import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args)throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da Conta !");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite o nome do Cliente !");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o valor a sacar da sua conta!");
        double saldo = scanner.nextDouble();
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " seu saldo " + saldo + " já está disponível para saque");
    }
}