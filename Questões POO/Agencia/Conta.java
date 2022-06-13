package atividades.Agencia;

public class Conta {
    //O número da conta
    private int id;
    private Financas financas;
    public Conta(int id) {
    	this.id = id;
    	financas = new Financas();
    	financas.addOperacao(Label.abertura, 0);
    }
    //só realiza a operação se houver dinheiro suficiente na conta
    public boolean sacar(int value) {
    	if(financas.getSaldo() >=  value && value > 0) {
    		financas.addOperacao(Label.saque,-value);
    		return true;
    	}
    	System.out.println("fail: valor inadequado ou saldo insuficiente");
    	return false;
    }
    //retira o dinheiro, mesmo que o saldo fique negativo
    public boolean tarifar(int value) {
    	if(value < 0) {
    		System.out.println("fail: valor inadequado");
    		return false;
    	}
    	financas.addOperacao(Label.tarifa, -value);
    	return true;
    }
    //se o índice for válido e representar uma operação de tarifa
    //adicione o mesmo valor tarifado, mas com label de extorno
    public boolean extornar(int indice) {
    	if(indice >= financas.getExtrato().size() || indice < 0) {
    		System.out.println("fail: indice :"+indice+" invalido");
    		return false;
    	}
    	Label l = financas.getExtrato().get(indice).getLabel();
    	if(l != Label.tarifa) {
    		System.out.println("fail: indice "+indice+" não é tarifa");
    		return false;
    	}
    	int saldo = financas.getExtrato().get(indice).getValue();
    	financas.addOperacao(Label.extorno, -saldo);
    	return true;
    }
    //adiciona valor à conta
    public boolean creditar(Label label, int value) {
    	if(value > 0) {
    		financas.addOperacao(label, value);
    		return  true;
    	}
    	System.out.println("fail: valor invalido");
    	return false;
    }
    public String toString() {
    	String retorno = "";
    	retorno += "Conta: "+id+" Saldo: "+financas.getSaldo();
    	return retorno;
    }
    Financas getFinancas() {
    	return financas;
    }
}
