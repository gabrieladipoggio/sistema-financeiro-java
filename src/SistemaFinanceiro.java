public class SistemaFinanceiro {

    public static void main(String[] args) {
        CaixaEletronico caixa = new CaixaEletronico();
        caixa.autenticar("2");
        caixa.exibirSaldo();
        caixa.encerrar();
        caixa.exibirSaldo();

    }

}