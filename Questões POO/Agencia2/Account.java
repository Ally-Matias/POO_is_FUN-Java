package atividades.Agencia2;

abstract class Account {
	protected int id;
    protected float balance;
    protected String clientId;
    protected String type; //CC or CP
    public Account(int id, String clientId) {
    	this.id = id;
    	this.clientId = clientId;
    	this.balance = 0;
    }
    //abstract method
    public abstract void monthlyUpdate();
    //saque
    public void withdraw(float value) {
    	if(balance >= value && value > 0) {
    		balance -= value;
    	}else
    		System.out.println("fail: saldo insuficiente");
    }
    //deposito
    public void deposit(float value) {
    	if(value >= 0)
    		balance += value;
    	else
    		System.out.println("fail: valor negativo");
    }
    //transferencia para outra conta
    public void transfer(Account other, float value) {
    	
    }
    public String toString() {
    	String retorno;
    	retorno = id+":"+clientId+":"+balance+":"+type+"\n";
    	return retorno;
    }
    //GETS and SETS
    int getId() {
    	return id;
    }
    float getBalance() {
    	return balance;
    }
    String getClientId() {
    	return clientId;
    }
    String getType() {
    	return type;
    }

}
