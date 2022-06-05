package atividades.Agenda3;

import java.util.ArrayList;
import java.util.List;

public class Contact {
    private String name;
    private List<Fone> fones;
    protected String prefix = "-"; //utilizado no toString
    
    //Crie um ArrayList para o ATRIBUTO fones
    //Se a variável fones não for null, adicione todos os fones usando o método addFone
    public Contact(String name, List<Fone> fones) {
    	this.name = name;
    	this.fones = new ArrayList<Fone>();
    	if(fones != null) {
    		for(int i = 0; i < fones.size(); i++) {
    			addFone(fones.get(i));
    		}
    	}
    }
    
    //Se fone for válido, insira no atributo fones
    //Se não, informe o erro
    public void addFone(Fone fone) {
    	if(fone.isValid()) {
    		fones.add(fone);
    	}else
    		System.out.println("fail: numero invalido");
    	//ordena os telefones de acordo com o seu id, em ordem alfabetica
    	fones.sort((Fone f1, Fone f2) -> (f1.getId().compareTo(f2.getId())));
    }
    
    //Se o índice existir no ArrayList, remova o telefone com esse índice
    public void rmFone(int index) {
    	if((index > -1 && index < fones.size())) fones.remove(index);
    	else System.out.println("fail: indice inexistente");
    }
    
    //Use um contador para mostrar o índice do telefone
    //Use o toString do fone para adicioná-lo à saída
    //O resultado dever ficar assim:
    //- david [0:oi:123] [1:tim:9081] [2:claro:5431]
    public String toString() {
    	String retorno = prefix+name;
    	for(int i = 0; i < fones.size(); i++) {
    		retorno += " ["+i+":"+fones.get(i).toString()+"]";
    	}
    	return retorno;
    }
    
    //GETS e SETS
    public String getName() {return name;}
    public void setName(String name) {
    	this.name = name;
    }
    
    public List<Fone> getFones(){
    	return fones;
    }
    
    //limpe a lista de fones
    //utilize o addFone para adicionar apenas os fones válidos
    public void setFones(List<Fone> fones) {
    	this.fones.clear();
    	for(int i = 0; i<fones.size(); i++) {
    		addFone(fones.get(i));
    	}
    	
    }
}
