// VERSÃO 1 : SISTEMA BANCÁRIO

// LEMBRETE: A versão 2 irei focar no método "AbrirConta", para quando ele for chamado, o usuário adicine 
// As informações da conta bancária e não informações pré definidas no código main.

package Projeto;

public class Classe {
    public int nconta;
    protected String tipo;
    private String dono;
    private float saldo;
    private String status;
    
    // Método construtor

    public Classe(){
        this.setSaldo(0);
        this.setStatus("Fechada");
    }
    
    // Atributos
    
    // Número da conta
    
    public int getNconta(){
        return this.nconta;
    }
    
    public void setNconta(int n){
        this.nconta = n;
    }
    
    // Tipo

    public String getTipo(){
        return this.tipo;
    }
    
    public void setTipo(String t){
        this.tipo = t;
    }
    
    // Dono

    public String getDono(){
        return this.dono;
    }
    
    public void setDono(String d){
        this.dono = d;
    }
    
    // Saldo
    
    public float getSaldo(){
        return this.saldo;
    }
    
    public void setSaldo(float s){
        this.saldo = s;
    }
    
    // status da conta
    
    public String getStatus(){
        return this.status;
    }
    
    public void setStatus(String st){
        this.status = st;
    }
    
    // Métodos
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus("Aberta");
        if (t == "CC"){
            this.setSaldo(50);
        } else if (t == "CP"){
            this.setSaldo(150);
        }
        System.out.println("PARABÉNS " + this.getDono() + ", Sua conta foi aberta com sucesso! :)");
        System.out.println("---------------------------------------------------");
        System.out.println(" ");
    }
    
    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("Conta não pode ser fechada pois ainda tem " + this.getSaldo() + " R$ de saldo.");
            System.out.println("---------------------------------------------------");
            System.out.println(" ");
        } else if (this.getSaldo() < 0){
            System.out.println("Conta não pode ser fechada pois você está em débito");
            System.out.println("---------------------------------------------------");
            System.out.println(" ");
        } else {
            this.setStatus("Fechada");
            System.out.println("Isso é um adeus então né?! :( . Sua conta foi fechada.");
            System.out.println("---------------------------------------------------");
            System.out.println(" ");
        }
    }
    
    public void depositar(float v){
        if (getStatus() == "Aberta"){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito de " + v + " R$ realizado com sucesso na conta de " + this.getDono());
            System.out.println("---------------------------------------------------");
            System.out.println(" ");
        } else {
            System.out.println("Você não possui uma conta, não é possível depositar. :(");
            System.out.println("---------------------------------------------------");
            System.out.println(" ");
        }
    }
    
    public void sacar(float v){
        if (this.getStatus() == "Aberta" && this.getSaldo() >= v){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Saque de " + v + " R$ realizado com sucesso! :)");
            System.out.println("---------------------------------------------------");
            System.out.println(" ");
        } else if (this.getStatus() == "Aberta" && this.getSaldo() < v) {
            System.out.println("Saldo insuficiente! :(");
            System.out.println("---------------------------------------------------");
            System.out.println(" ");
        } else {
            System.out.println("Você não possui uma conta, não é possível sacar. :(");
            System.out.println("---------------------------------------------------");
            System.out.println(" ");
        }
    }
    
    public void pagarMensal(){
        int v = 0;
        if (this.getTipo() == "CC"){
            v = 12;
        } else if (this.getTipo() == "CP"){
            v = 20;
        }
        if (this.getStatus() == "Aberta" && this.getSaldo() >= v){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso! :)");
            System.out.println("---------------------------------------------------");
            System.out.println(" ");
        } else if (this.getStatus() == "Aberta" && this.getSaldo() < v) {
            System.out.println("Saldo insuficiente! :(");
            System.out.println("---------------------------------------------------");
            System.out.println(" ");
        } else {
            System.out.println("Você não possui uma conta, não é possível realizar o pagamento. :(");
            System.out.println("---------------------------------------------------");
            System.out.println(" ");
        }
    }
    
    
    // Status

    public void status(){
        System.out.println("---------------------------------------------------");
        System.out.println("•°•°•°•°• | STATUS DA SUA CONTA BANCÁRIA | •°•°•°•");
        System.out.println("---------------------------------------------------");
        System.out.println("Dono : " + this.getDono());
        System.out.println("Conta : " + this.getNconta());
        System.out.println("Tipo : " + this.getTipo());
        System.out.println("Saldo : " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
        System.out.println("---------------------------------------------------");
        System.out.println(" ");
    }
    
    
}




////////










package atividade;

public class Conta {
    private int numero;
    private String titular;
    private double saldo;

    public void Conta(int n, String t, double s){
        this.numero = n;
        this.titular = t;
        this.saldo = s;
    } 
    
    public int getNumero(){
        return this.numero;
    }
    
    public void setNumero(int n){
        this.numero = n;
    }

    public void getTitular(){
        return this.titular;
    }
    
    public void setTitular(String t){
        this.titular = t;
    }
    
    public void getSaldo(){
        return this.saldo;
    }

    public void setSaldo(double s){
        this.saldo = s;
    }

    public String toString(){
        return String.format("numero: %d, titular: %s, saldo: %.2f", numero, titular, saldo);
    }

// metodos 

    public static boolean saca(double valor){
        if(saldo >= valor && valor >= 0){
            saldo -= valor;
            return true;
        }
        return false;
    }

    public static boolean depositar(double valor){
        if(valor < 0){
            return false;
        saldo += valor;
        return true;

    }

    public boolean transfere(Conta d, double valor){
        if(saca(valor)){
            d.deposita(valor);
            return true;
        }
        return false;
    }

// exemplo de status dos dados da conta

    public void status(){
        System.out.println("Numero da conta:" + this.getNumero());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("O titula é: " + this.getTitular());

    }



