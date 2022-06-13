package atividades.Agencia2;

import java.util.ArrayList;
import java.util.List;

public class Client {
	private String clientId;
    private List<Account> accounts;
    public Client(String clientId) {
    	this.clientId = clientId;
    	accounts = new ArrayList<Account>();
    }
    public void addAccount(Account account) {
    	accounts.add(account);
    }
    public String toString(){
    	String retorno;
    	retorno = "- "+clientId+" [";
    	for(int i = 0; i < accounts.size(); i++) {
    		if(i == accounts.size()-1)
    			retorno += accounts.get(i).id+"]";
    		else
    			retorno += accounts.get(i).id+", ";
    	}
    	return retorno += "\n";
    }
    //GETS and SETS
    String getClientId() {
    	return clientId;
    }
    void setClientId(String clientId) {
    	this.clientId = clientId;
    }
    List<Account> getAccounts(){
    	return accounts;
    }
    void setAccounts(List<Account> accounts) {
    	try {
    		for(int i = 0; i < accounts.size(); i++) {
    			this.accounts.add(accounts.get(i));
    		}
    	}catch (AccountException ae) {
            System.out.println(ae.getMessage());
        }
    }

}
