// Polimorfismo de sobrecarga 
// Assinaturas diferentes; mesma classe

package ProjetoA;

public class Cachorro extends Lobo {
    @Override
    public void emitirSom(){
        System.out.println("AU! AU! AU!");
    }
    
    public void reagir(String frase){
        if (frase.equals("toma comida") || frase.equals("Olá")){
            System.out.println("Abanar e latir");
        } else {
            System.out.println("Rosnar");
        }
    }
    
    public void reagir(int hora, int min){
        if (hora < 12){
            System.out.println("Abanar o rabo");
        } else if (hora >= 18){
            System.out.println("Ignorar");
        } else {
            System.out.println("Abanar e latir");
        }
    }
    
    public void reagir(boolean dono){
        if (dono == true){
            System.out.println("Abanar e latir");
        } else {
            System.out.println("Rosnar e latir");
        }
    }
}
