package exemplodeclasses;

public class ContaInvestimento extends Conta{
    // encapsulamento
    private int rentabilidade;
    String fatorRisco;    
    private double capital;
    int gerente;
    double taxaMensal;    

    public int getRentabilidade() {
        return rentabilidade;
    }

    public void setRentabilidade(int rentabilidade) {
        this.rentabilidade = rentabilidade;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }
    
        void calculaFatorRisco (int rentabilidade){
        // Condicional
        if (rentabilidade >= 50)
        {
            fatorRisco = "A porcentagem de risco desse investimento é alta!";
        }
         
        else
        {
            fatorRisco = "A porcentagem de risco desse investimento será média!";
        }
    }
}


