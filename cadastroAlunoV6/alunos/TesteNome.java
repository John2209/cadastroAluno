package alunos;

public class TesteNome {
    public static void main(String[] args) {
        NomePessoa nome = new NomePessoa("Zé da Silva");

        System.out.println("Nome: " + nome.getNome());
        System.out.println("Quantidade de palavras: " + nome.getQtdePalavras());
        System.out.println("Nome invertido: " + nome.getNomeInvertido());
        System.out.println("Formato bibliografico: " + nome.getNomeBiblio());
        System.out.println("ToString: " + nome.toString());

        System.out.println("\nAlteracao de nome");
        nome.setNome("Josoé Almeida"); 
        System.out.println("Novo nome: " + nome.getNome());
        System.out.println("Formato bibliografico: " + nome.getNomeBiblio());
    }
}
