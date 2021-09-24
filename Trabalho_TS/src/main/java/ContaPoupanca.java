public class ContaPoupanca extends Conta implements Rendimentos {

    public ContaPoupanca(int numero, int agencia, Titular titular) {
        super(numero, agencia, titular);
    }

    @Override
    public boolean sacar(double valor) {
        return false;
    }

    @Override
    public boolean depositar(double valor) {
        return false;
    }

    @Override
    public void atualizar(double taxaRendimento) {
        this.saldo = this.saldo * (1 + taxaRendimento) ;
    }
}

