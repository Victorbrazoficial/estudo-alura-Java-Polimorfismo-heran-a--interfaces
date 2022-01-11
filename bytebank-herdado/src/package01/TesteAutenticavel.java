package package01;

public class TesteAutenticavel {

    public static void main(String[] args) {
        
        Administrador administrador = new Administrador();
        boolean autenticou = administrador.autentica(222);
        administrador.setNome("Bolevar");
        administrador.setSalario(10);
        administrador.getBonificacao();
        System.out.println("Nome: " + administrador.getNome());
        System.out.println("Nome e sobrenome: " + administrador.sobrenome());
        System.out.println("Valor bonificação: " + administrador.getBonificacao());
        System.out.println("Senha Administrador correta: " + autenticou);

        System.out.println();

        Gerente gerente = new Gerente();
        gerente.setSenha(11);
        autenticou = gerente.autentica(11);
        System.out.println("Senha Gerente correta: " + autenticou);

        System.out.println();
        
        Cliente cliente = new Cliente();
        autenticou = cliente.autentica(331);
        System.out.println("Senha Cliente correta: " + autenticou);
    }   
}