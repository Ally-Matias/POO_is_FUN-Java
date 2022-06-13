package atividades.Agencia2;

import java.util.Map;
import java.util.TreeMap;

public class BankAgency {
	private Map<String, Client> clients;
    private Map<Integer, Account> accounts;
    private int nextAccountId = 0;
    //obtém conta ou lança exceção
    private Account getAccount(int id) {
    	Account aux = null;
    	try {
    		aux = accounts.get(id);
    	}catch (AccountException ae) {
            System.out.println(ae.getMessage());
        }
    	return aux;
    }
    public BankAgency() {
    	clients = new TreeMap<String,Client>();
    	accounts = new TreeMap<Integer, Account>();
    }
    //se o cliente não existir
    //cria o cliente
    //cria uma conta poupança e uma conta corrent para o cliente
    //adiciona essas contas no vetor de contas e no vetor do cliente
    //adiciona o cliente no mapa de clientes
    public void addClient(String clientId) {
    	if(!clients.containsKey(clientId)) {
    		//cria o cliente e uma conta corrente e uma poupança para ele
    		Client cliente = new Client(clientId);
    		CheckingAccount cc = new CheckingAccount(nextAccountId,clientId);
    		SavingsAccount cp = new SavingsAccount(nextAccountId+1,clientId);
    		// add as contas para o cliente
    		cliente.addAccount(cc);
    		cliente.addAccount(cp);
    		//inserindo as contas no mapa de contas e incrementando o contador de contas
    		accounts.put(nextAccountId, cc);
    		nextAccountId++;
    		accounts.put(nextAccountId, cp);
    		nextAccountId++;
    		//inserindo o cliente no mapa de clientes
    		clients.put(clientId, cliente);
    	}else
    		System.out.println("fail: cliente já cadastrado");
    }
    //obtem o cliente e invoca as ações
    public void withdraw(int idConta, float value) {
    	if(idConta < 0 || idConta > (nextAccountId-1))
    		System.out.println("fail: conta não encontrada");
    	else
    		accounts.get(idConta).withdraw(value);
    }
    public void deposit(int idConta, float value) {
    	if(idConta < 0 || idConta > (nextAccountId-1))
    		System.out.println("fail: conta não encontrada");
    	else
    		accounts.get(idConta).deposit(value);
    }
    public void transfer(int contaDe, int contaPara, float value) {
    	if(accounts.containsKey(contaDe) && accounts.containsKey(contaPara) && value > 0) {
    		Account enviar = getAccount(contaDe);
    		Account receber = getAccount(contaPara);
    		if(!(enviar.balance < value)) {
    			enviar.withdraw(value);
    			receber.deposit(value);
    		}else
    			System.out.println("fail: saldo insuficiente");
    	}else
    		System.out.println("fail: conta não encontrada ou valor inapropiado");
    }
    public void monthlyUpdate() {
    	for(int i = 0; i < (nextAccountId); i++) {
    		Account aux = accounts.get(i);
    		if(aux.type.equals("CC")) ((CheckingAccount)aux).monthlyUpdate();
    		if(aux.type.equals("CP")) ((SavingsAccount)aux).monthlyUpdate();
    	}
    }
    public String toString() {
    	String retorno = "Clients: \n";
    	for(Client client: clients.values()) {
    		retorno += client.toString();
    	}
    	retorno += "Accounts: \n";
    	for(int i = 0; i < accounts.size(); i++) {
    		retorno += accounts.get(i);
    	}
    	return retorno;
    }

}
