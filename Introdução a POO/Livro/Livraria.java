package atividades.Iivro;

import java.util.Random;

// Nessa classe Livraria eu atribui "disponível" e "preço" para q com eles eu possa saber se o livro está em estoque na livraria ou não e também saber qual o valor do livro para ser adquirido.

public class Livraria {

   public int preco;
   public boolean disponivel;
   
   void inicializaLivraria(int p, boolean d){
     this.preco = p;
     this.disponivel = d;
   }
   
   // Eu usei a função random para saber se o livro está disponível ou nn e também para definir um valor aleatório do tipo double para o livro.
   
   Random aleatorio = new Random();
            
   int dispo = aleatorio.nextInt(2);
   
   // O valor do livro vai de 0 a 200
   
   double prec = aleatorio.nextDouble() * 200;
   
   // Aqui eu iniciei o livro dentro da minha classe livraria e depois passei ele dentro do meu método "mostrarLivroLivraria", e se caso o livro estiver disponível, ele printa uma frase e logo em seguida ja diz o preço.
   
   Livro x = new Livro();

   void mostrarLivroLivraria(){
     if(dispo == 0){
       System.out.println(" ");
       System.out.println("## Livro ##");
       x.mostrarLivro();
       System.out.printf("Disponível e ele está por %.2f R$ na nossa livraria\n", prec);
     }else{
       System.out.println(" ");
       System.out.println("## Livro ##");
       x.mostrarLivro();
       System.out.println("Não disponível, Sinto muito mas não temos o seu livro em estoque na nossa livraria, volte outro dia!\n");
   }
   
 }
   
}
