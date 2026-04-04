
/**
 * Escreva uma descrição da classe Pessoa aqui.
 * 
 * @author Julio Arakaki
 * @version (um número da versão ou uma data)
 */
public class Pessoa {
    NomePessoa nome;
    int idade;
    
    Pessoa(String nome, int idade){
        this.nome = new NomePessoa(nome);
        this.idade = idade;
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    
}
