package package01;

public class Caixa extends Funcionario {

    public double getBonificacao() {
        System.out.println("Caixa: 10% + bonus funcionario de " + super.getBonificacao());
        return super.getBonificacao() + super.getSalario() * 0.1;
    }

    @Override
    public String sobrenome() {
        String segundoNome = super.getNome() + " Caixa";
        return segundoNome;
    }
}