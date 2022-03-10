package ProjetoA;

public abstract class Animal {
    // Atributos de animal
    protected float peso;
    protected int idade;
    protected int membros;
    
    // Métodos de animal
    public abstract void alimentar();
    public abstract void locomover();
    public abstract void emitirSom();
    
    // get e set
    public float getPeso(){
        return peso;
    }
    
    public void setPeso(float p){
        this.peso = p;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public void setIdade(int i){
        this.idade = i;
    }
    
    
    public int getMembros(){
        return membros;
    }
    
    public void setMembros(int m){
        this.membros = m;
    }
}
