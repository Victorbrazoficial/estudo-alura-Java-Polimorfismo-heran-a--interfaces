package package01;

public class Administrador extends Funcionario implements Autenticavel {

    private ComposiçãoUtil utilizador;

    public Administrador() {
        this.utilizador = new ComposiçãoUtil();
    }

    @Override
    public void setSenha(int senha) {
        this.utilizador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return utilizador.autentica(senha);
    }

    @Override
    public String sobrenome() {
        String segundoNome = super.getNome() + " Administrador";
        return segundoNome;
    }  

    @Override
    public double getBonificacao() {
        return 50;
    }
}