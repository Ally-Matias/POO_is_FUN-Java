package atividades.Iivro;

import atividades.Iivro.Livraria;
import java.util.Scanner;

// Aqui é meu código principal onde primeiro chamei o scanner para receber todos os inputs.

public class App {

  public static void main(String[] args) {
        System.out.println("Digite o nome do livro, autor e o gênero do livro: ");
        Scanner teclado = new Scanner(System.in);
        
        String nome = teclado.nextLine();
        String autor = teclado.nextLine();
        String genero = teclado.nextLine();
        int pag = teclado.nextInt(); 
        
// chamei a classe livraria e a classe biblioteca e depois inicializei ambas recebendo como parâmetro os inputs que antes foram inseridos e após isso chamei o método mostrarLivroLivraria e mostrarLivroBiblioteca.
        
        Livraria l = new Livraria();
        
        Biblioteca b = new Biblioteca();
        
        l.x.inicializaLivro(nome, autor, pag, genero);
        b.x.inicializaLivro(nome, autor, pag, genero);
        System.out.println("|||| Livraria ||||");
        l.mostrarLivroLivraria();
        System.out.println(" ");
        System.out.println("•°•°• Biblioteca •°•°•");
        b.mostrarLivroBiblioteca();
        teclado.close();
  }

}
