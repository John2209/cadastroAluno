
/**
 * Write a description of class CadastroAluno here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Armazenador implements IArmazenador {

    // Armazenador de alunos
    Aluno[] arm;

    Armazenador(int qtde){
        arm = new Aluno[qtde];
    }

    /**
     * inserir - insere um aluno na estrutura de dados
     *
     * @param  a - objeto aluno a ser inserido no armazenador
     * @return boolean  true - com sucesso, false - falha na inserção
     */
    public boolean inserir(Aluno a, int qtde){
        // TODO
        boolean inserido = false;
        int cont = 0;

        while(inserido == false && cont <= qtde){
            if(arm[cont] == null){
                arm[cont] = a;
            }
            else{
                cont++;
            }
        }
        
        if(inserido == true){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * remover - insere um aluno na estrutura de dados
     *
     * @param  ra - String representando o ra do aluno
     * @return boolean  true - com sucesso, false - falha na remoção
     */
    public boolean remover (String ra, int qtde){
        // TODO
        boolean removido = false;
        int cont = 0;

        while(removido == false && cont <= qtde){
            if(arm[cont].getRa() == ra){
                arm[cont] = null;
                removido = true;
            }
            else{
                cont++;   
            }
        }

        if(removido == true){
            return true;
        }
        else{
            return false;
        }

    }
    
     /**
     * Retorna os atributos como string
     */
    public String toString(){
        return arm.toString();
    }

}