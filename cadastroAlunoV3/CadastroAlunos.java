import java.util.Scanner;
/**
 * Write a description of class CadastroAlunos here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CadastroAlunos {

    IArmazenador arm; 
    CadastroAlunos (int qtde){
        arm = new Armazenador(qtde);
    }
    
    // inserir
     public boolean inserirAluno(int qtde){
        boolean sucesso;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        
        System.out.print("Idade: ");
        String ida = sc.nextLine();
        int idade = Integer.parseInt(ida);
        
        System.out.print("Ra: ");
        String ra = sc.nextLine();
        
        System.out.print("Curso: ");
        String curso = sc.nextLine();
        
        System.out.print("Semestre: ");
        String semes = sc.nextLine();
        int semestre = Integer.parseInt(semes);
        
        Aluno a = new Aluno(nome,idade,ra,curso,semestre);
        sucesso = arm.inserir(a,qtde);
        
        
        // Fecha dispositivo de entrada
        sc.close();
        return sucesso;
    
    }
    // remover
    public void removerAluno(int qtde){
    
    }
    
    // listar
    public void listarAluno(int qtde){
        
        int i;
        for(i=0;i<qtde;i++){
            Aluno a = arm.getAluno(i);
            
            if (a != null) {
            System.out.println("Aluno " + (i + 1) + ": " + a.toString());
        }
        }
    
    }
     
    
     

    
}