package package01;

public class TestaBonificacao {
    
    public static void main(String[] args) {
        
        Gerente gerente = new Gerente(); // Gerente = tipo // gerente = referencia // new Gerente() = objeto
        AnalistaDeCredito analistaDeCredito = new AnalistaDeCredito();
        Caixa caixa = new Caixa();
        Contador contador = new Contador();
        ControleBonificacao controle = new ControleBonificacao();
        
        gerente.setSalario(1000);
        analistaDeCredito.setSalario(2000);
        caixa.setSalario(5000);

        System.out.println(controle.registra(gerente));
        System.out.println(controle.registra(analistaDeCredito));
        System.out.println(controle.registra(caixa));
        System.out.println(controle.registra(contador));
    } 
}