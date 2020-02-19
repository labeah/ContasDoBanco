package exemplodeclasses;

// importo classe joptionpane e scanner
import javax.swing.JOptionPane;
import java.util.Scanner;

public class DigitaConta {
    public static void main(String Args[]){
        // istancia classe scanner
        Scanner sc = new Scanner(System.in);
        int opcao = 9;
        
        while (opcao != 0) {
            // entrada de dados modo grafico
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "Escolha "
                    + "<1> para Poupança, "
                    + "<2> para Corrente, "
                    + "<3> para investimentos e "
                    + "<0> para sair: "));
            
            if (opcao == 1) {
                     
                ContaPoupanca cp = new ContaPoupanca();
                
                JOptionPane.showMessageDialog(null, "Cadastro em Conta Poupança");
                
                while (cp.numeroConta == 0 ) {
                cp.numeroConta = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero da conta :"));
            }
            do {
            cp.numeroCliente = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero do cliente:"));
            } while (cp.numeroCliente == 0);
            
            cp.dataAbertura = JOptionPane.showInputDialog(null, "Digite a data de abertura: ");
            
            cp.depositoConta(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do depósito: ")));
        
            cp.saqueConta(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do saque: ")));
        
            JOptionPane.showMessageDialog(null, "O número da conta é: " + cp.numeroConta + 
                    "\nO número do cliente é: " + cp.numeroCliente +
                    "\nA data de abertura é: " + cp.dataAbertura + 
                    "\nSaldo da conta poupança: " + cp.saldo + "R$");
        }
        
        if (opcao == 2) {
            
            ContaCorrente cc = new ContaCorrente();
            
            JOptionPane.showMessageDialog(null, "Cadastro em Conta Corrente");
                        
            cc.numeroConta = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero da conta :"));;
           
            cc.numeroCliente = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero do cliente:"));
          
            cc.dataAbertura = JOptionPane.showInputDialog(null, "Digite a data de abertura: ");            
            
            cc.depositoConta(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do depósito: ")));            
           
            cc.saqueConta(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do saque: ")));
            
            JOptionPane.showMessageDialog(null, "O número da conta é: " + cc.numeroConta + 
                    "\nO número do cliente é: " + cc.numeroCliente +
                    "\nA data de abertura é: " + cc.dataAbertura + 
                    "\nSaldo da conta poupança: " + cc.saldo + "R$");
            }
        
        
        if (opcao == 3)
        {
            ContaInvestimento ci = new ContaInvestimento();
            
            JOptionPane.showMessageDialog(null, "Cadastro em Conta Investimento");
                                                
            ci.numeroConta = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero da conta :"));;
           
            ci.numeroCliente = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero do cliente:"));
          
            ci.dataAbertura = JOptionPane.showInputDialog(null, "Digite a data de abertura: ");               
            
            // utilizando metodo set
            ci.setCapital((Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do capital que deseja investir: "))));
            
            ci.setRentabilidade(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a porcentagem de rentabilidade mensal desejada: ")));
            
            // utilizando metodos get e loop while
            while (ci.getRentabilidade() < 0 && ci.getRentabilidade() > 100)
            {
                ci.setRentabilidade(Integer.parseInt(JOptionPane.showInputDialog(null, "Valor da rentabilidade inválido! Digite um valor de 0 a 100: ")));
            }      
            
            ci.calculaFatorRisco(ci.getRentabilidade());
            
            System.out.println(ci.fatorRisco);
            
            int confirma = 0;
            
            System.out.println("Para confirmar digite <1>, para cancelar digite qualquer outro número: ");
            confirma = sc.nextInt();
            
            if (confirma != 1)
            {
                ci.setCapital(0);
                ci.setRentabilidade(0);
                
                System.out.println("Investimento cancelado!");                
            }
            
            else
            {
                System.out.println("Investimento Confirmado!");
            }       
            
                        JOptionPane.showMessageDialog(null, "O número da conta é: " + ci.numeroConta + 
                    "\nO número do cliente é: " + ci.numeroCliente +
                    "\nA data de abertura é: " + ci.dataAbertura + 
                    "\nCapital investido: " + ci.getCapital() + "R$");
            }
        }
        }
    }
    
