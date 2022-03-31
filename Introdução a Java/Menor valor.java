import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valor = 0;
        int valorMenor = 30;
        
        for(int x = 0; x < 5; x++){
            valor = input.nextInt();
            if(valor < valorMenor){
                valorMenor = valor;
            }
        }
        
        System.out.println(valorMenor);

    }

}
