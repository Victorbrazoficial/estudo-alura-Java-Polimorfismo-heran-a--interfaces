package package01;

public class TesteGerente {

    public static void main(String[] args) {
        
        Gerente gerente = new Gerente();

        gerente.setNome("Braz");
        gerente.setCpf("111111111");
        gerente.setSalario(5000);
        gerente.setSenha(1111);

        System.out.println(gerente.getNome());
        System.out.println(gerente.getCpf());
        System.out.println(gerente.getSalario());

        System.out.println();

        gerente.getBonificacao();
        System.out.println(gerente.getBonificacao());

        boolean senhaFoiAutenticada = gerente.autentica(1111);
        System.out.println(senhaFoiAutenticada);

        boolean senhaFoiAutenticada02 = gerente.autentica(5656);
        System.out.println(senhaFoiAutenticada02);
    }
}