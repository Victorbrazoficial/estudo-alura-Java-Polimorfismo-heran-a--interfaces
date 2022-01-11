package package01;

public class AnalistaDeCredito extends Funcionario {

    public double getBonificacao() {
        System.out.println("Analista de Credito: 20% + bonus funcionario de " + super.getBonificacao());
        return super.getBonificacao() + super.getSalario() * 0.20;
    }

    @Override
    public String sobrenome() {
        String AnalistaDeCredito = super.getNome() + " Analista de Credito";
        return AnalistaDeCredito;
    }
}