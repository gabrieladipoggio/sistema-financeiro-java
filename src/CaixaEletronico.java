public class CaixaEletronico {
    private Conta conta;

    public Cliente autenticar(String numeroConta){
        Cliente cliente = new Cliente();
        cliente.setnome("João");
        cliente.setSobrenome("Da Silva");

        ContaCorrente contaCorrente = new ContaCorrente(cliente);

        this.conta = contaCorrente;
        return cliente;
    }

    public void exibirSaldo(){
        System.out.println("O seu saldo é: " + this.conta.consultarSaldo());
    }

    public void efetuarSaque(double valor){
        this.conta.sacar(valor);
        System.out.println("Saque efetuado com sucesso!");
        System.out.println("O seu novo saldo é: " + this.conta.consultarSaldo());
    }

    public void efetuarDeposito(double valor){
        this.conta.depositar(valor);
        System.out.println("Depósito efetuado com sucesso!");
        System.out.println("O seu novo saldo é: " + this.conta.consultarSaldo());

    }
}
