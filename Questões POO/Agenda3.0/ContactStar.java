package atividades.Agenda3;

import java.util.List;

public class ContactStar extends Contact{
	private boolean star;
    //contrutor default
    public ContactStar(String name, List<Fone> fones, boolean star) {
    	super(name,fones);
    	this.star = star;
    }
    //muda o prefixo e o valor de star
    void setStar(boolean value) {
    	star = value;
    	if(star)
    		this.prefix = "@";
    	else
    		this.prefix = "-";
    }
    boolean getStar() {
    	return star;
    }

}
