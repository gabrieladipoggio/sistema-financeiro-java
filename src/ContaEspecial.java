public class ContaEspecial extends ContaCorrente {

    private double limite;

    public ContaEspecial(Cliente titular) {
        super(titular);
        this.limite = 1000;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public double consultarSaldo() {
        return getSaldo() + this.limite;
    }
}