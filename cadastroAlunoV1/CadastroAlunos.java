import java.util.Scanner;
/**
 * Write a description of class CadastroAlunos here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CadastroAlunos {

    IArmazenador arm;
    int qtde;
    
    CadastroAlunos (int qtde){
        arm = new Armazenador(qtde);
    }
    
    // inserir
    public void inserirAluno(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        
        System.out.print("Idade: ");
        string idade = sc.nextLine();
        
        System.out.print("Ra: ");
        String ra = sc.nextLine();
        
        System.out.print("Curso: ");
        String curso = sc.nextLine();
        
        System.out.print("Semestre: ");
        String semestre = sc.nextLine();
        
        Aluno a = new Aluno(nome,idade,ra,curso,semestre);
        
        qtde++;
        // Fecha dispositivo de entrada
        sc.close();
    
    }
    // remover
    // listar
    public void listarAlunos(){
        
    }
    
}