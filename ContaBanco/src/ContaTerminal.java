
//Conhecer e importar a class Scanner.
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        // Conhecer e importar a classe Scanner
        Scanner sc = new Scanner(System.in);

        // Exibir as mensagens para nosso usuário.
        System.out.println("Olá novo usuário do nosso banco! \n" +
                "Por favor, informe os dados a seguir");

        // Obter pela scanner os valores digitados no terminal.
        System.out.print("Digite informe número a agência: ");
        String numeroAgencia = sc.nextLine();

        System.out.print("Digite o número da conta: ");
        int numeroConta = sc.nextInt();

        System.out.print("Digite informe seu nome: ");
        String nomeTitular = String.valueOf(sc.next());

        System.out.print("Digite seu saldo: ");
        float saldoConta = Float.valueOf(sc.next());

        // Exibir as mensagens de conta criada.
        System.out.print(nomeTitular + ", obrigado por criar uma conta em nosso banco.\n" +
                "Sua agência é: " + numeroAgencia + " e conta é: " + numeroConta + "\n" +
                "Seu saldo de ");
        System.out.printf("%.2f",saldoConta);
        System.out.println(" já está disponível para saque.");

    }
}