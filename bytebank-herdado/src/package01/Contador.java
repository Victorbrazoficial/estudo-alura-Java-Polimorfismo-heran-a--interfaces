package package01;

public class Contador extends Funcionario {

    public double getBonificacao() {
        System.out.println("Contador: Bonificação de 500 reias");
        return 500;
    }

    @Override
    public String sobrenome() {
        String segundoNome = super.getNome() + " Contador";
        return segundoNome;
    }
}