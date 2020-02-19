package exemplodeclasses;
import java.util.Scanner;

public class DigitaConta {
    public static void main(String Args[]){
        Scanner tc = new Scanner(System.in);
        ContaPoupanca cp = new ContaPoupanca();
        
        System.out.println("Cadastro em Conta Poupança");
        while (cp.numeroConta == 0 ) {
        System.out.print("Digite o numero da conta :");
        cp.numeroConta = tc.nextInt();
        }
        do {
        System.out.print("Digite o numero do cliente:");
        cp.numeroCliente = tc.nextInt();
        } 
        while (cp.numeroCliente == 0);

        System.out.print("Digite a data de abertura: ");
        cp.dataAbertura = tc.next();
        
        System.out.print("Digite o valor do depósito: ");
        cp.depositoConta(tc.nextDouble());
        
        System.out.print("Digite o valor do saque: ");
        cp.saqueConta(tc.nextDouble());
        
        System.out.println("Agora, seu saldo da conta poupança é :" + cp.saldo);
    }
}
