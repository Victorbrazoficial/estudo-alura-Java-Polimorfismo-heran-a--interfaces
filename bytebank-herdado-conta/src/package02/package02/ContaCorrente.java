package package02;

public class ContaCorrente extends Conta implements Tributavel {
    
    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public double getValorImposto() {       
        return super.getSaldo() * 0.01;
    }
    
    @Override
    public boolean saca(double valor) {
        double valorSacar = valor + 0.20;
        return super.saca(valorSacar);
    }

    @Override
    public void deposita(double valor) {
        double deposito = super.getSaldo() + valor;
        super.setSaldo(deposito);   
    }
}
