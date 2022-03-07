//          * CLASSE DA LUTA *

package Projeto;

import java.util.Random;

public class SegClasse {
    private Classe desafiado;
    private Classe desafiante;
    private int rounds;
    private boolean aprovado;
    
    
    // Métodos
    
    public void marcarLuta(Classe l1, Classe l2){
        if (l1.getCategoria().equals(l2.getCategoria())){
            this.setAprovado(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
           // System.out.println("Ambos estão aprovados e a Luta foi marcada com sucesso!");
        } else {
            this.setAprovado(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
           // System.out.println("Não foi possível marcar a luta!");
        }
    }
    
    public void lutar(){
        if (this.getAprovado()){
            System.out.println("---------------------------------------------------");
            System.out.println("•°•°•°• | APRESENTAÇÃO DO LUTADOR DESAFIADO | •°•°•");
            System.out.println("---------------------------------------------------");
            this.getDesafiado().apresentar();
            System.out.println("---------------------------------------------------");
            System.out.println("•°•°•° | APRESENTAÇÃO DO LUTADOR DESAFIANTE | •°•°");
            System.out.println("---------------------------------------------------");
            this.getDesafiante().apresentar();
            
            Random aleatorio = new Random();
            
            int vencedor = aleatorio.nextInt(3);
            switch(vencedor){
                case 0:  // empate
                    System.out.println("E É UM EMPAAAAAAATEE !!!!!");
                    this.desafiado.empate();
                    this.desafiante.empate();
                    break;
                
                case 1:   //desafiado vence
                    System.out.println("O VENCEDOR É ELEE... * " + this.desafiado.getNome() + " *");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                
                case 2:   // desafiante vence
                    System.out.println("O VENCEDOR É ELEE... * " + this.desafiante.getNome() + " *");
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }
            
        } else {
            System.out.println("A luta não pode acontecer! :(");
        }
    }
    
    
    // Atributos

    public Classe getDesafiado(){
        return desafiado;
    }
    
    public void setDesafiado(Classe desafiado){
        this.desafiado = desafiado;
    }
    
    
    public Classe getDesafiante(){
        return desafiante;
    }
    
    public void setDesafiante(Classe desafiante){
        this.desafiante = desafiante;
    }
    
        
    public int getRounds(){
        return rounds;
    }
    
    public void setRounds(int r){
        this.rounds = r;
    }
    
        
    public boolean getAprovado(){
        return aprovado;
    }
    
    public void setAprovado(boolean a){
        this.aprovado = a;
    }
    
    
    
}
