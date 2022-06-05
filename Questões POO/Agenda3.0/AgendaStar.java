package atividades.Agenda3;

import java.util.ArrayList;
import java.util.List;

public class AgendaStar extends Agenda{
	//SE o contato existir e for do tipo ContatoStar altere o atributo star dele
    public void star(String name, boolean value) {
    	ContactStar aux = (ContactStar)findContact(name);
    	if(aux != null) {
    		aux.setStar(value);
    	}else 
    		System.out.println("fail: contato rex nao existe");
    }
    //filtre em uma nova lista apenas os contatos que forem do tipo ContatoStar e que estÃ£o favoritados
    public List<Contact> getStarred(){
    	List<Contact> aux = new ArrayList<Contact>();
    	List<Contact> sup = getContacts();
    	for(int i = 0; i < sup.size(); i++) {
    		ContactStar c = (ContactStar)sup.get(i);
    		if(c.getStar()) {
    			aux.add(c);
    		}
    	}
    	return aux;
    	
    }

}
