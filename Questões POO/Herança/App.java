import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Empregado> lista = new ArrayList<>();

        System.out.print("Entre o numero de funcionarios: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            System.out.println("Dados do empregado " + i + ": ");
            System.out.print("Terceirizado (s/n)? ");
            char terceirizado = sc.next().charAt(0);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Horas: ");
            int horas = sc.nextInt();
            System.out.print("Valor por hora: ");
            double valorPorHora = sc.nextDouble();
            if(terceirizado == 's') {
                System.out.print("Despesa adicional: ");
                Double despesaAdicional = sc.nextDouble();
                Terceirizado emp = 
                    new Terceirizado(nome, horas, valorPorHora, despesaAdicional);
                lista.add(emp);
            }
            else {
                Empregado emp = new Empregado(nome, horas, valorPorHora);
                lista.add(emp);
            }
        }

        System.out.println("\nPAGAMENTOS: ");
        for(Empregado e : lista) {
            System.out.printf("%s - R$%.2f%n", e.getNome(), e.pagamento());
        }

        sc.close();
    }
}
