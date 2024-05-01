import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //TODO: Conhecer e importar a classe Scanner
        //TODO:Exibir as mensagens para nosso usuário
        //TODO:Obter pela scanner os valores digitados no terminal
        //TODO:Exigir a mensagem da conta criada
        int numeroDaConta;
        String agencia, nomeDoCliente;
        double saldo;

        Scanner s = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Olá, Digite o número da conta: ");
        numeroDaConta = s.nextInt();
        System.out.print("Digite a agência: ");
        agencia = s.next();
        System.out.print("Digite o nome do cliente: ");
        s.nextLine();
        nomeDoCliente = s.nextLine();
        System.out.print("Digite o saldo a ser depositado: ");
        saldo = s.nextDouble();

        System.out.println("--------------------------------------------");
        System.out.printf("Olá %s, obrigado por criar a conta em nosso banco, sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque.", nomeDoCliente, agencia, numeroDaConta, saldo);
          }
}