package atividades.Agenda3;

public class Fone {
    private String id;
    private String number;
    public Fone(String id, String number) {
    	this.id = id;
    	this.number = number;
    }
    //verifica se o número é um número de telefone válido
    public static boolean validate(String number) {
    	boolean format_1 = number.matches("[[0-9]+[.]+[()]]*");
    	return (format_1);
    }
    //O resultado deve ficar assim
    //oi:1234
    public String toString() {
    	String retorno = id+": "+number;
    	return retorno;
    }
    //GETS e SETS
    public String getId() {
    	return id;
    }
    public void setId(String id) {
    	this.id = id;
    }
    public String getNumber() {return number;}
    public void setNumber(String number) {
    	this.number = number;
    }
    //utiliza o static validate para retornar se essa instancia do fone é valida
    public boolean isValid() {
    	return validate(number);
    }
}
