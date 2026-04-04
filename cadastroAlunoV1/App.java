import javax.swing.JOptionPane;
/**
 * Write a description of class App here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class App {
    public static void main(String args[]) {
        int qtde = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de alunos: "));

        CadastroAlunos ca = new CadastroAlunos(qtde);
        
        
        // menu (em loop)
        // switch case
        
        
    }
}