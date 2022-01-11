package package01;

public class ComposiçãoUtil {
    
    private int senha = 222;
   
    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha) {

        if (this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }
}