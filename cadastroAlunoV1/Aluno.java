
/**
 * Escreva uma descrição da classe Aluno aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Aluno extends Pessoa {
    // Atributos do aluno    
    String ra;
    String curso;
    int semestre;
    //Disciplinas [] disc;

    Aluno(String nome, int idade, String ra, String curso, int semestre){
        // Aciona o construtor da classe pai (Pessoa)
        super(nome, idade);
        
        this.ra = ra;
        this.curso = curso;
        this.semestre = semestre;
    }
    
    public String getRa(){
        return this.ra;
    }
    
    public String getCurso(){
        return this.curso;
    }
    
    public int getSemestre(){
        return this.semestre;
    }
    
    public void setRa(String ra){
         this.ra = ra;
    }
    
    public void setCurso(String curso){
        this.curso = curso;
    }
    
    public void setSemestre(int semestre){
        this.semestre = semestre;
    }
}
