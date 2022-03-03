// CANETA

package Projeto;

public class Classe {
    private String modelo;
    private String cor;
    private float ponta;
    private boolean tampada;
    
    // Método construtor

    public Classe(String m, String c, float p){
        this.setModelo(m);
        this.setCor(c);
        this.setPonta(p);
        this.tampar();
    }
    
    
    
    // Modelo
    
    public String getModelo(){
        return this.modelo;
    }
    
    public void setModelo(String m){
        this.modelo = m;
    }
    
    // Cor

    public String getCor(){
        return this.cor;
    }
    
    public void setCor(String c){
        this.cor = c;
    }
    
    // Ponta

    public float getPonta(){
        return this.ponta;
    }
    
    public void setPonta(float p){
        this.ponta = p;
    }
    
    // Tampada
    
    public boolean getTampada(){
        return this.tampada;
    }
    
    public void setTampada(boolean t){
        this.tampada = t;
    }
    
    
    
    // Tampar e destampar
    
    public void tampar(){
        this.tampada = true;
    }
    
    public void destampar(){
        this.tampada = false;
    }
    
    
    // Status

    public void status(){
        System.out.println("SUA CANETA :)");
        System.out.println(" ");
        System.out.println("O modelo é: " + this.getModelo());
        System.out.println("A ponta é: " + this.getPonta());
        System.out.println("A cor é: " + this.getCor());
        System.out.println("E ela está tampada?: " + this.getTampada());
        System.out.println(" ");
    }
    
    
}
