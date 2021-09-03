public class CaixaEletronico {
    private Conta conta;

    public Cliente autenticar(String numeroConta){
        Cliente cliente = new Cliente();
        cliente.setNome("João");
        cliente.setSobrenome("Da Silva");

        ContaCorrente contaCorrente = new ContaCorrente(cliente);

        this.conta = contaCorrente;
        System.out.println("Bem vindo cliente: "+cliente.getNome());
        return cliente;
    }

    public void exibirSaldo(){
        if(this.conta == null){
            System.out.println("Faça primeiro sua autenticação");
        } else {
            System.out.println("O seu saldo é: R$" + this.conta.consultarSaldo());
        }
    }

    public void efetuarSaque(double valor){
        if(this.conta.consultarSaldo() >= valor){
            this.conta.sacar(valor);
            System.out.println("Saque efetuado com sucesso!");
            System.out.println("O seu novo saldo é: " + this.conta.consultarSaldo());
        } else {
            System.out.println("Você não tem saldo suficiente!");
        }


    }

    public void efetuarDeposito(double valor){
        this.conta.depositar(valor);
        System.out.println("Depósito efetuado com sucesso!");
        System.out.println("O seu novo saldo é: " + this.conta.consultarSaldo());
    }

    public void efetuarTransferencia(Conta destino, double valor){
        if(this.conta == null){
            System.out.println("Faça primeiro sua autenticação");
        } else {
            this.conta.transferir(valor, conta);
            System.out.println("Transferência realizada com sucesso");
            System.out.println("O seu novo saldo é: " + this.conta.consultarSaldo());

        }
    }

    public void encerrar(){
        this.conta = null;
    }
}
