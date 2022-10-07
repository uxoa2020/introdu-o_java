/*
na classe dto colocamos todas as variaveis
e essas estarão protegidas 
não ha acesso direto para as variáveis
precisamos utlizar o metodo 
detters e setters
 */
package F_encapsulamento_1;
public class clienteDTO {
    private String nome="", rg="";
    private int idade=0;
    
    public void setNome(String nome){
        this.nome=nome;
    }
    
    public void setRG(String rg){
        this.rg=rg;
    }
    
    public void setIdade(int idade){
        this.idade=idade;
    }
    
    
    
    
    public String getNome(){
        return this.nome;
    }
    
    public String getRG(){
        return this.rg;
    }
    
    public int getIdade(){
        return this.idade;
    }
}
