package entidades;

public class ContaEmpresarial extends Conta {
    private Double limiteEmprestimo;

    public ContaEmpresarial() {
        super();
    }

    public ContaEmpresarial(Integer numero, String titular, 
        Double saldo, Double limiteEmprestimo) {
        super(numero, titular, saldo);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public Double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setLimiteEmprestimo(Double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public void emprestimo(Double valor) {
        if(valor >= 0 && valor <= limiteEmprestimo) {
            saldo += valor - 10.0;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", limite de emprestimo: " + limiteEmprestimo;
    }

    
}
