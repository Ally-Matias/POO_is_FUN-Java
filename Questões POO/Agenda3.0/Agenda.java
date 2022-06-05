package atividades.Agenda3;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contact> contacts;
    
    public Agenda() {
    	contacts = new ArrayList<Contact>();
    }
    
    //retorna a posição do contato com esse nome no vetor ou -1 se não existir.
    private int findPosByName(String name) {
    	for(int i = 0; i < contacts.size(); i++) {
    		if(contacts.get(i).getName().equals(name)) return i;
    	}
    	return -1;
    }
    
    //retorna o objeto contato com esse nome ou null se não existir
    //utilize o método findPosByName
    public Contact findContact(String name) {
    	int i = findPosByName(name);
    	if(i == -1)
    		return null;
    	else
    		return contacts.get(i);
    }
    
    //se nenhum contato existir com esse nome, adicione
    //se ja existir, faça o merge adicionando os telefones
    //por fim, ordene a lista para ficar em ordem alfabética
    public void addContact(Contact contact) {
    	int a = findPosByName(contact.getName());
    	if(a == -1) {
    		contacts.add(contact);
    	}else {
    		for(int j = 0; j < contact.getFones().size(); j++) {
    			contacts.get(a).addFone(contact.getFones().get(j));
    		}
    	}
    	this.contacts.sort((Contact c1, Contact c2) -> (c1.getName().compareTo(c2.getName())));
    }
    //Utilize o método findPosByName
    public void rmContact(String name) {
    	int aux = findPosByName(name);
    	if(aux == -1) {
    		System.out.println("fail: Nome não está na agenda");
    	}else {
    		contacts.remove(aux);
    	}
    }
    //Monte uma lista auxiliar procurando no .toString() de cada contato
    //se ele possui a substring procurada.
    //dica: reveja os métodos da classe String e procure algum que ajude aqui
    public List<Contact> search(String pattern){
    	List<Contact> auxiliar = new ArrayList<Contact>();
    	for(int i = 0; i < contacts.size(); i++) {
    		String aux = contacts.get(i).toString();
    		//usando o método toLowerCase() garantimos comparações ingnorando cases maiúsculos, ex: com o método toLowerCase()
    		//garantimos que a string "Ana" é igual a string "ana", desse modo fazemos a comparação da string aux em minúsculo com 
    		//a string pattern tbm em minúsculo. Caso sejam iguais, adicionamos o contato referente a string aux na lista auxiliar
    		boolean b = aux.toLowerCase().contains(pattern.toLowerCase());
    		if(b == true) auxiliar.add(contacts.get(i));
    	}
    	return auxiliar;

    }
    public List<Contact> getContacts(){
    	return contacts;
    }
    public String toString() {
    	String retorno = "";
    	if(contacts == null) {
    		System.out.println("fail: não existe agenda");
    	}else {
    		for(int i = 0; i < contacts.size(); i++) {
    			retorno += contacts.get(i).toString()+"\n";
    		}
    	}
    	return retorno;
    }
}
