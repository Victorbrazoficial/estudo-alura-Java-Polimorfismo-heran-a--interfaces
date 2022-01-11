package package02;

public class CalculadorImposto {

    private double totalImposto;

    public void registra(Tributavel tributavel) {

        double valor = (tributavel.getValorImposto());
        this.totalImposto += valor;
    }
    
    public double getValorImposto() {

        return totalImposto;
    }
}