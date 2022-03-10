package ProjetoA;

public class Main {
    
    public static void main(String[] args) {
        // Não pode pois é abstrato
        // Animal a = new Animal();
        
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Cachorro c = new Cachorro();
        
        System.out.println("=•=•=•=•= Mamifero =•=•=•=•=");
        System.out.println(" ");
        
        m.alimentar();
        m.locomover();
        m.emitirSom();
        
        System.out.println(" ");
        System.out.println("==============================");
        System.out.println("=•=•=•=•= Reptil =•=•=•=•=");
        System.out.println(" ");

        r.alimentar();
        r.locomover();
        r.emitirSom();
        
        System.out.println(" ");
        System.out.println("==============================");
        System.out.println("=•=•=•=•= Cachorro =•=•=•=•=");
        System.out.println(" ");

        c.emitirSom();
        c.reagir("toma comida");
        c.reagir(false);
        
        
    }
    
}
