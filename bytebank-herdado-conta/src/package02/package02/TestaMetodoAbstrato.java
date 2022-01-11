package package02;

public class TestaMetodoAbstrato {
    
    public static void main(String[] args) {
        
        ContaCorrente contaCorrente = new ContaCorrente(2222, 1151);
        ContaPoupanca contaPoupanca = new ContaPoupanca(1111, 212121);

        contaCorrente.deposita(40);
        System.out.println(contaCorrente.getSaldo());

        contaPoupanca.deposita(20);
        System.out.println(contaPoupanca.getSaldo());
    }
}