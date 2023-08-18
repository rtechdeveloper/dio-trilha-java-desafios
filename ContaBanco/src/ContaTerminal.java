import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o seu nome.");
        String nomeCliente = sc.nextLine();

        System.out.println("Digite o numero da agencia");
        String agencia = sc.next();

        System.out.println("Por favor, digite o numero da conta com o digito.");
        String numero = sc.next();
        
        System.out.println("Informe seu saldo.");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +
                            ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}

