package package02;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {
        double acressimo = super.getSaldo() + valor + 1;
        super.setSaldo(acressimo); 
    }

    
}