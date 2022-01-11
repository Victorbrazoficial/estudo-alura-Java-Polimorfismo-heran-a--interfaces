package package01;

public class Gerente extends Funcionario implements Autenticavel {

    private ComposiçãoUtil utilizador;

    public Gerente() {
        this.utilizador = new ComposiçãoUtil();
    }

    public boolean autentica(int senha) {
        return this.utilizador.autentica(senha);   
    }

    public double getBonificacao() {
        System.out.println("Gerente: salaraio + bonus funcionario de " + super.getBonificacao());
        return super.getBonificacao() + super.getSalario();
    }

    @Override
    public String sobrenome() {
        String segundoNome = super.getNome() + " Gerente";
        return segundoNome;
    }

    @Override
    public void setSenha(int senha) {
        this.utilizador.setSenha(senha);
    }
}