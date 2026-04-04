import javax.swing.JOptionPane;
import menu.*;
/**
 * Write a description of class App here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class App {
    public static void main(String args[]) {
        int qtde = Integer.parseInt(JOptionPane.showInputDialog("Forneça a quantidade de alunos: "));

        CadastroAlunos ca = new CadastroAlunos(qtde);

        IMenu mn = new MenuGrafico(); 
        //IMenu mn = new MenuTexto(); 

        String [] itensMenu = {"1 - inserir", "2 - remover", "3 - listar", "4 - sair"};

        int opcao = 0;
        
        do {
            opcao = mn.criarMenu(itensMenu);
            boolean sucesso;
            
            switch(opcao){
                case 1:sucesso = ca.inserirAluno(qtde);
                       if(sucesso == true){
                           System.out.print("Aluno inserido com sucesso!!\n\n");
                        }
                        else{
                            System.out.print("Não foi possível inserir o aluno.\n\n");
                        }
                break;
                
                case 2:sucesso = ca.removerAluno(qtde);
                       if(sucesso == true){
                           System.out.print("Aluno removido com sucesso!!\n\n");
                        }
                        else{
                            System.out.print("Aluno não existe ou já foi reomvido.\n\n");
                        }
                break;
                
                case 3:ca.listarAluno(qtde);
                break;
            
            }

        } while(opcao != 4);

    }
}