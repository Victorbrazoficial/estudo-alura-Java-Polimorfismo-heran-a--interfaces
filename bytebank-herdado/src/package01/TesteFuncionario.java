package package01;

public class TesteFuncionario {

    public static void main(String[] args) {
        
        // Funcionario gerente = new Funcionario(); " calss Funcionario não pode ser objeto pois a classe passou a ser abstrata"
        Funcionario gerente = new Gerente();

        gerente.setNome("Victor ");
        gerente.setCpf("111.111.111-11");
        gerente.setSalario(5000);

        System.out.println(gerente.getNome());
        System.out.println(gerente.getCpf());
        System.out.println(gerente.getSalario());
    }
}