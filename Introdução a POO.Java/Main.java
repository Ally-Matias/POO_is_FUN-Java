package projeto;

public class Main {
    
    public static void main(String[] args) {
        caneta c1 = new caneta();
        c1.cor = "azul";
        c1.ponta = 0.5f;
        c1.modelo = "bic";
        c1.carga = 40;
        c1.tampada = false;
        c1.status();       
        c1.rabiscar();
        
        caneta c2 = new caneta();
        c2.cor = "vermelha";
        c2.ponta = 0.5f;
        c2.modelo = "bic";
        c2.carga = 80;
        c2.tampada = true;
        c2.status();       
        c2.rabiscar();
    }
    
}
