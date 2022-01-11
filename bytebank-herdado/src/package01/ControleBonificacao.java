package package01;

public class ControleBonificacao extends Funcionario {

    public double registra(Funcionario funcionario) {
        return funcionario.getBonificacao();
    }

    @Override
    public String sobrenome() {
        return null;
    }
}