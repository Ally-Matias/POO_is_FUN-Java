package atividades.Agencia;

import java.util.ArrayList;
import java.util.List;

public class Financas {
    //O id da próxima operação dessa conta
    private int nextId;
    //A lista de operações realizadas
    private List<Operacao> extrato;
    private int saldo;
    public Financas() {
    	saldo = 0;
    	this.nextId = 0;
    	extrato = new ArrayList<Operacao>();
    }
    //Adiciona value ao saldo
    //Crie operação e adiciona ao vetor de operações
    //Incrementa o nextId
    public void addOperacao(Label label, int value) {
    	saldo += value;
    	extrato.add(nextId,new Operacao(nextId, label, value, saldo));
    	nextId++;
    }
    int getSaldo() {
    	return saldo;
    }
    List<Operacao> getExtrato(){
    	return extrato;
    }
    public List<Operacao> getExtrato(int qtdOp){
    	//se a quantidade de operacoes for maior que a quantidade de operacoes existentes, retorna extrato
    	if(qtdOp >= nextId - 1) return extrato;
    	// cria uma lista auxiliar e cria um for comencando do indice final do extrato menos a quantidade de operações solicitadas
    	//e adiciona cada elemento do indice i da Lista extrato na lista aux
    	List<Operacao> aux = new ArrayList<Operacao>();
    	for(int i = nextId - qtdOp; i < extrato.size(); i++) {
    		aux.add(extrato.get(i));
    	}
    	return aux;
    	
    }
}
