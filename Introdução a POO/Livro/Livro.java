package atividades.Iivro;

// A classe livro onde nela eu tenho nome, autor, genero e a quantidade de páginas.

public class Livro {
   
   public String nome, autor, genero;
   public int pag;
    
    void inicializaLivro(String n, String a, int p, String g) {
        this.nome = n;
        this.autor = a;
        this.pag = p;
        this.genero = g;
    }
    
 // Um método simples para mostrar o livro
    
    void mostrarLivro(){
      System.out.print("O livro " + nome + " do Autor " + autor + " do gênero " + genero + " de " + pag + " páginas está\n");
    }
    
    
    
}
