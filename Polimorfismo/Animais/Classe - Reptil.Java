// Polimorfismo de sobreposição
// Mesma assinatura; Classes diferentes

package ProjetoA;

public class Reptil extends Animal{
    private String corEscama;
    
    @Override
    public void locomover(){
        System.out.println("Rastejando");
    }
    @Override
    public void alimentar(){
        System.out.println("Comendo vegetais");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Som de réptil");
    }
    
    public String getCorEscama(){
        return corEscama;
    }
    
    public void setCorEscama(String ce){
        this.corEscama = ce;
    }
    
}
