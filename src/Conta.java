public abstract class Conta {

    private String numero;
    private double saldo;
    private Cliente titular;

    // Construtor
    public Conta(Cliente titular) {
        this.saldo = 0.0;
        this.numero = "1";
        this.titular = titular;
    }

    public Conta(Cliente titular, String conta){
        this.saldo = 0;
        this.numero = numero;
        this.titular = titular;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }


    public void sacar(double valor) {
        this.saldo -= valor;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void transferir(double valor, Conta destino) {
        this.sacar(valor);
        destino.depositar(valor);
    }

    public double consultarSaldo() {
        return this.saldo;
    }
}