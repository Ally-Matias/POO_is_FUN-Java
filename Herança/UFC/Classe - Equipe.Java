package Projeto;

public class Equipe {
    private String NomeEquipe;
    private int classificacao;
    private String lider;
     
    
    public String getNomeEquipe(){
        return NomeEquipe;
    }
    
    public void setNomeEquipe(String no){
        this.NomeEquipe = no;
    }
    
    
    public int getClassificacao(){
        return classificacao;
    }
    
    public void setClassificacao(int c){
        this.classificacao = c;
    }
    
        
    public String getLider(){
        return lider;
    }
    
    public void setLider(String l){
        this.lider = l;
    }
}
