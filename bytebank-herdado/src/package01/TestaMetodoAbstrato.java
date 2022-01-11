package package01;

public class TestaMetodoAbstrato {

    public static void main(String[] args) {
        
        AnalistaDeCredito analistaDeCredito = new AnalistaDeCredito();
        Caixa caixa = new Caixa();
        Contador contador = new Contador();
        Gerente gerente = new Gerente();

        analistaDeCredito.setNome("Joao");
        analistaDeCredito.sobrenome(); // metodo abstrato
        System.out.println(analistaDeCredito.getNome());
        System.out.println(analistaDeCredito.sobrenome());

        caixa.setNome("Vander");
        caixa.sobrenome(); // metodo abstrato
        System.out.println(caixa.getNome());
        System.out.println(caixa.sobrenome());

        contador.setNome("Osvaldo");
        contador.sobrenome(); // metodo abstrato
        System.out.println(contador.getNome());
        System.out.println(contador.sobrenome());

        gerente.setNome("Olanda");
        gerente.sobrenome(); // metodo abstrato
        System.out.println(gerente.getNome());
        System.out.println(gerente.sobrenome());   
    }  
}