package package01;

public class TesteSistemaInterno {

    public static void main(String[] args) {    
        
        Gerente gerente = new Gerente();
        Administrador administrador = new Administrador();
        Cliente cliente = new Cliente();
        
        gerente.setSenha(1234);
        administrador.setSenha(124);
        cliente.setSenha(1234);

        SistemaInterno sistemaInterno = new SistemaInterno();
        sistemaInterno.autentica(gerente);
        sistemaInterno.autentica(administrador);
        sistemaInterno.autentica(cliente);
    }
}