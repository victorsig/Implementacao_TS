public abstract class Conta {
    private int numero;
    private int agencia;
    protected double saldo;
    private Titular titular;

    public Conta(int numero, int agencia, Titular titular) {
        this.numero = numero;
        this.agencia = agencia;
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public abstract boolean sacar(double valor);

    public abstract boolean depositar(double valor);

    public boolean tranferir(double valor, Conta destinatario){
        this.saldo -= valor;

        destinatario.depositar(valor);
        return true;
    }
}