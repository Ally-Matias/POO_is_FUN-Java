package atividades.Agencia2;

public class SavingsAccount extends Account{
	public SavingsAccount(int id, String idClient) {
		super(id,idClient);
    	super.type = "CP";
	}
    //aumenta saldo em 1%
    public void monthlyUpdate() {
    	super.balance += (super.balance*0.1);
    }

}
