/**
 * Classe de teste simples para a entidade Aluno.
 *
 * @author Julio Arakaki
 * @version 1.0 2026/04/03
 */
public class TestaAluno {
    /**
     * Executa um teste simples de criação e exibição de um aluno.
     *
     * @param args argumentos recebidos pela linha de comando
     */
    public static void main(String args[]) {
        Aluno a = new Aluno("Ze da Silva Pereira Antunes", 22, "RA123456", "Engenharia Civil", 3);

        System.out.println(a);
        System.out.println("Nome bibliografico: " + a.getNomeBiblio());
    }
}
