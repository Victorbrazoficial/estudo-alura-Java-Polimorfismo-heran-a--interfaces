package package01;

public class SistemaInterno {

    private int senha = 1234;
  
    public void autentica(Autenticavel funcionarioAutenticavel) {

        boolean autentica = funcionarioAutenticavel.autentica(this.senha);

        if (autentica) {
            System.out.println("Senha Correta.");
        } else {
            System.out.println("Senha incorreta.");
        }  
    }
}