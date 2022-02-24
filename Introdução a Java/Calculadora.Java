import java.util.Scanner;

public class Main{
  
  static int soma(int a, int b){
    int s = a + b;
    return s;
  }
  static int sub(int a, int b){
    int s = a - b;
    return s;
  }
  static int mult(int a, int b){
    int s = a * b;
    return s;
  }
  static int div(int a, int b){
    int s = a / b;
    return s;
  }

  public static void main(String[] args){
    
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("CALCULADORA");
    
    System.out.print("Qual operação? [soma, sub, mult, div]: ");
    String operação = teclado.nextLine();

    System.out.print("Primeiro número: ");
    int n1 = teclado.nextInt();
    System.out.print("Segundo número: ");
    int n2 = teclado.nextInt();
    
    if (operação.equals("soma")){
      int resposta = soma(n1, n2);
    System.out.println("A soma vale: " + resposta);
    } 
    if (operação.equals("sub")){
      int resposta = sub(n1, n2);
    System.out.println("A subtração vale: " + resposta);
    } 
    if (operação.equals("mult")){
      int resposta = mult(n1, n2);
    System.out.println("A multiplicação vale: " + resposta);
    } 
    if (operação.equals("div")){
      int resposta = div(n1, n2);
    System.out.println("A divisão vale: " + resposta);
    } 
      
  }
  
}
