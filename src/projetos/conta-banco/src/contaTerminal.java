import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) throws Exception {
        
        //Receber dados
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da conta:");
        int conta = scanner.nextInt();

        System.out.println("Digite o número da agência:");
        String agencia = scanner.next();

        System.out.println("Digite o nome do cliente:");
        String cliente = scanner.next();

        System.out.println("Digite o saldo da conta:");
        double saldo = scanner.nextDouble();
    
        //Imprimir informações da conta
        System.out.println("Olá " + cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo de " + saldo + " já está disponível para saque");
    }
}