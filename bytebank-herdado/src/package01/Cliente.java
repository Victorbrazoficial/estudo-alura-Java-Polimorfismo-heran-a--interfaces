package package01;

public class Cliente implements Autenticavel {
    
    ComposiçãoUtil utilizador;

    public Cliente() {
        this.utilizador = new ComposiçãoUtil();
    }

    public void setSenha(int senha) {
       this.utilizador.setSenha(senha);
    }

    public boolean autentica(int senha) {
       return this.utilizador.autentica(senha);
    }
}