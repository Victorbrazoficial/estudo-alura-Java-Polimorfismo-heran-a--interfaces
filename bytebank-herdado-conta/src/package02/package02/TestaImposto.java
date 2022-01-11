package package02;

public class TestaImposto {

    public static void main(String[] args) {
        
        ContaCorrente contaCorrente = new ContaCorrente(111, 1212);
        contaCorrente.deposita(100);

        ContaCorrente contaCorrente2 = new ContaCorrente(111, 1212);
        contaCorrente2.deposita(100);

        SeguroDeVida seguroDeVida = new SeguroDeVida();

        CalculadorImposto calculadorImposto = new CalculadorImposto();
        calculadorImposto.registra(contaCorrente);
        calculadorImposto.registra(contaCorrente2);
        calculadorImposto.registra(seguroDeVida);

        System.out.println(contaCorrente.getValorImposto());
        System.out.println(contaCorrente2.getValorImposto());
        System.out.println(seguroDeVida.getValorImposto());
        System.out.println(calculadorImposto.getValorImposto());

    }   
}