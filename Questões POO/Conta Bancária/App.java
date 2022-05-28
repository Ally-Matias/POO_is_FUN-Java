import entidades.Conta;
import entidades.ContaEmpresarial;
import entidades.ContaPoupanca;

public class App { 
    public static void main(String[] args) throws Exception {
        // UPCASTING
        Conta c1 = new ContaEmpresarial(12, "Ana", 
            456.7, 1000.0);
        Conta c2 = new ContaPoupanca(13, "Pedro", 
            765.87, 0.01);

        System.out.println(c1); // invoca toString
        System.out.println(c2); // invoca toString

        // DOWNCASTING 
        if(c2 instanceof ContaEmpresarial) {
            ContaEmpresarial c3 = (ContaEmpresarial) c2;
            System.out.println("Detalhes da conta empresarial: ");
            System.out.println(c3);
            System.out.println("Limite de emprÃ©stimo: " + c3.getLimiteEmprestimo());
        }

        if(c2 instanceof ContaPoupanca) {
            ContaPoupanca c3 = (ContaPoupanca) c2;
            c3.atualizaSaldo();
            System.out.println("Detalhes da conta poupanÃ§a: ");
            System.out.println(c3);
        }
    }
}

