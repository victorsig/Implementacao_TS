public class ContaEspecial extends ContaCorrente implements Rendimentos{


    public ContaEspecial(int numero, int agencia, Titular titular) {
        super(numero, agencia, titular);
    }

    @Override
    public void atualizar(double taxaRendimento)
    {
        this.saldo = this.saldo * (1 + taxaRendimento) ;
    }
}
