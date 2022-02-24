package projeto;

public class caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Está tampada?: " + this.tampada);
        System.out.println("O modelo é: " + this.modelo);
        System.out.println("A ponta?: " + this.ponta);
        System.out.println("Carga?: " + this.carga + "%");
    }
    
    void rabiscar(){
      if (this.tampada == true){
          System.out.println("Não posso rabiscar de caneta tampada '_'");
          System.out.println(" ");
        } else {
          System.out.println("Rabiscando...");
          System.out.println(" ");
        }
    }
    
    void tampar(){
      this.tampada = true;  
    }
    
    void destampar(){
      this.tampada = false; 
    }
    
    
    
    
    
    
}
