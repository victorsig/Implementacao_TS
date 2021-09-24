public class ContaCorrente extends Conta{

    double limite;
    double taxa;

    public ContaCorrente(int numero, int agencia, Titular titular) {
        super(numero, agencia, titular);
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor) {
        return false;
    }

    @Override
    public boolean depositar(double valor) {
        return false;
    }
}
