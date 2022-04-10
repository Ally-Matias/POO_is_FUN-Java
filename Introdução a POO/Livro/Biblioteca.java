package atividades.Iivro;

import java.util.Random;

// Nessa classe biblioteca eu atribui somente "disponível" para q com ele eu possa saber se o livro está em estoque na biblioteca ou não.

public class Biblioteca {

   public boolean disponivel;
   
   void inicializaBiblioteca(boolean d){
     this.disponivel = d;
   }
   
   // Eu usei a função random para saber se o livro está disponível ou nn.
   
   Random aleatorio = new Random();
            
   int dispo = aleatorio.nextInt(2);
   
   // Iniciei o livro dentro da minha classe biblioteca e depois passei ele dentro do meu método "mostrarLivroBiblioteca" para que após mostrar o livro, ele me dizer se está disponível ou não.
   
   Livro x = new Livro();

   void mostrarLivroBiblioteca(){
     if(dispo == 0){
       System.out.println(" ");
       System.out.println("## Livro ##");
       x.mostrarLivro();
       System.out.println("Disponível na nossa biblioteca, assine aqui para pegar seu livro.");
     }else{
       x.mostrarLivro();
       System.out.println(" ");
       System.out.println("## Livro ##");
       System.out.println("Não disponível, Sinto muito mas não temos o seu livro em estoque na nossa biblioteca, volte outro dia!");
   }
   
 }
   
}
