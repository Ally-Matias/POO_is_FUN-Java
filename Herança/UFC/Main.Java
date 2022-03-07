//                * UFC *

package Projeto;

public class Main {
    
    public static void main(String[] args) {
       Classe l1 = new Classe("Alliquison", "EUA", 19, 1.70f, 65.0f, 10, 3, 2,"KINGS", 3,"SPIKE");
       
       Classe l2 = new Classe("Matias", "Brasil", 19, 1.70f, 68.5f, 13, 1, 3,"BRMILGRAU", 2, "JORGINHO");

       SegClasse UFC = new SegClasse();
       UFC.marcarLuta(l1, l2);
       UFC.lutar();
        
       l1.status();
       l1.statusE();
       l2.status();
       l2.statusE();
    }
    
}
