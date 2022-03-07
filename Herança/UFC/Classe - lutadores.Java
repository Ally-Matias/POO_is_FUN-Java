//        * CLASSE DOS LUTADORES *

package Projeto;

public class Classe extends Equipe{
    private String nome;
    private String nacional;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    
    // Método construtor
    
    public Classe(String n, String na, int i, float a, float p, int v, int d, int e, String no, int c, String l){
        this.nome = n;
        this.nacional = na;
        this.idade = i;
        this.altura = a;
        this.setPeso(p);
        this.vitorias = v;
        this.derrotas = d;
        this.empates = e;
        this.setNomeEquipe(no);
        this.setClassificacao(c);
        this.setLider(l);
        
    }
    
    // Atributos
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String n){
        this.nome = n;
    }
    
    
    public String getNacional(){
        return this.nacional;
    }
    
    public void setNacional(String na){
        this.nacional = na;
    }
    
    
    public int getIdade(){
        return this.idade;
    }
    
    public void setIdade(int i){
        this.idade = i;
    }
    
    
    public float getAltura(){
        return this.altura;
    }
    
    public void setAltura(float a){
        this.altura = a;
    }
    
    
    public float getPeso(){
        return this.peso;
    }
    
    public void setPeso(float p){
        this.peso = p;
        this.setCategoria();
    }
    
    
    public String getCategoria(){
        return this.categoria;
    }
    
    public void setCategoria(){
        if (this.peso < 52.2){
            this.categoria = "Abaixo do peso limite";
        } else if (this.peso <= 70.3){
            this.categoria = "Peso leve";
        } else if (this.peso <= 83.9){
            this.categoria = "Peso médio";
        } else if (this.peso <= 120.2){
            this.categoria = "Peso pesado";
        } else {
            this.categoria = "Acima do peso limite";
        }
    }
    
    public int getVitorias(){
        return this.vitorias;
    }
    
    public void setVitorias(int v){
        this.vitorias = v;
    }
    
    
    public int getDerrotas(){
        return this.derrotas;
    }
    
    public void setDerrotas(int d){
        this.derrotas = d;
    }
    
    
    public int getEmpates(){
        return this.empates;
    }
    
    public void setEmpates(int e){
        this.empates = e;
    }
   
    
    // Métodos públicos
    
    public void apresentar(){
        System.out.println(" ");
        System.out.println("E ELE VEM! Apresentamos o lutador... * " + this.getNome() + " *");
        System.out.println("Que veio do " + this.getNacional());
        System.out.println("Com " + this.getIdade() + " anos");
        System.out.println("E " + this.getAltura() + "m de altura");
        System.out.println("Pesando exatamente " + this.getPeso() + "Kg");
        System.out.println("E ele ganhou " + this.getVitorias() + " lutas");
        System.out.println("Perdeu " + this.getDerrotas());
        System.out.println("E empatou " + this.getEmpates());
        System.out.println("E esse é ele, o nosso grande lutador!!!!!!!");
        System.out.println("---------------------------------------------------");
        System.out.println(" ");

    }
    
    
    public void status(){
        System.out.println("---------------------------------------------------");
        System.out.println("       ~•~•~•~ | STATUS DO LUTADOR | ~•~•~•~");
        System.out.println("---------------------------------------------------");
        System.out.println(" ");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Categoria: " + this.getCategoria());
        System.out.println("Vitórias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());     
    }
    
    public void statusE(){
        System.out.println("---------------------------------------------------");
        System.out.println("       ~•~•~•~ | STATUS DA EQUIPE | ~•~•~•~");
        System.out.println("---------------------------------------------------");
        System.out.println(" ");
        System.out.println("Equipe : " + this.getNomeEquipe());
        System.out.println("Classificação : " + this.getClassificacao());
        System.out.println("Lider : " + this.getLider());   
        System.out.println(" ");
    }
    
    
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    
    
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    
    
    public void empate(){
        this.setEmpates(this.getEmpates() + 1);
    }
    

 }   
    

