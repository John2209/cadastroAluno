package alunos;

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Zé da Silva", 85);

        System.out.println("Nome retornado: " + pessoa.getNome());
        System.out.println("Idade retornada: " + pessoa.getIdade());
        System.out.println("Nome bibliografico: " + pessoa.getNomeBiblio());
        System.out.println("ToString padrao:\n" + pessoa.toString());

        pessoa.setNome("José Costa");
        pessoa.setIdade(53);

        System.out.println("Novo nome retornado: " + pessoa.getNome());
        System.out.println("Nova idade retornada: " + pessoa.getIdade());
        System.out.println("Novo nome bibliografico: " + pessoa.getNomeBiblio());
    }
}
