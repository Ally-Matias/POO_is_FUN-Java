package Projeto;

public class Main {
    
    public static void main(String[] args) {
        // Criação das contas
       Classe c1 = new Classe();
        c1.setDono("Alliquison Matias");
        c1.setNconta(1101);
        c1.abrirConta("CC");
        
        /*
        Classe c2 = new Classe();
        c2.setDono("Fatima Matias");
        c2.setNconta(1102);
        c2.abrirConta("CP");
        */
        
        // Métodos sendo aplicados
        
        c1.depositar(670);
        c1.pagarMensal();
        c1.fecharConta();
        c1.sacar(708);
        c1.sacar(2000);
        c1.fecharConta();
        
        // Status
        c1.status();
        
    }
    
}



package atividades;

public class Main {
    
    public static void main(String[] args) {
     
        Conta ally = new Conta();
        Conta matias = new Conta();

        ally.setNumero(1);
        ally.setSaldo(10000000);
        ally.setTitular("Alliquison");

        System.out.println(ally.toString());
        
    }
    
}
