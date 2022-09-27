import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        double saldo = 1000.75;
        int numero;
        String numeroAgencia;
        String nome;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, Digite o número do Usuário:");
        numero = scanner.nextInt();

        System.out.println("Por favor, Digite o número da Agência!");
        numeroAgencia = scanner.next();

        System.out.println("Digite seu nome");
        nome = scanner.next();

        System.out.println("Olá " + nome + " obrigado por criar uma conta em nosso banco, sua agência é: " + numeroAgencia + " conta " + numero + " e" +
                " seu saldo " + saldo + " já está disponível para saque.");


    }

}