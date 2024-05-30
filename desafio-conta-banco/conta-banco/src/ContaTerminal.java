import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia;
        String nomeCliente;
        Double saldo;

         Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor, digite o número da Agência: ");
        agencia = scanner.next();
        
        System.out.println("Por favor, digite o número da conta: ");
         numero = scanner.nextInt();

        System.out.println("Por favor, digite o seu nome: ");
        nomeCliente = scanner.next();
        
        System.out.println("Por favor, digite o saldo: ");
        saldo = scanner.nextDouble();

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
        
    }
}
