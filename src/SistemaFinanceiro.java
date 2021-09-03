public class SistemaFinanceiro {


    public static void main(String[] args) {
        Cliente destinatario = new Cliente();
        destinatario.setNome("João");
        destinatario.setSobrenome("Da Silva");
        Conta contaDestino = new ContaCorrente(destinatario);

        CaixaEletronico caixa = new CaixaEletronico();
        caixa.autenticar("2");
        caixa.efetuarSaque(200);
        caixa.exibirSaldo();
        caixa.encerrar();
        caixa.efetuarTransferencia(contaDestino, 40);
        caixa.exibirSaldo();

    }

}