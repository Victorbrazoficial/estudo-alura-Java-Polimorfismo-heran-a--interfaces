package package02;

public class TesteConta {
    
    public static void main(String[] args) {
        
        ContaCorrente contaCorrente = new ContaCorrente(111, 111);
        ContaPoupanca contaPoupanca = new ContaPoupanca(222, 222);

        contaCorrente.deposita(50);
        contaPoupanca.deposita(100);

        contaCorrente.transfere(30, contaPoupanca);

        System.out.println("saldo conta corrente " + contaCorrente.getSaldo());
        System.out.println("saldo conta poupança " + contaPoupanca.getSaldo());
    }
}