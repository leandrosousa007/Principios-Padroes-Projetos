public class BoletoPagamento implements PagamentoStrategy {
    @Override
    public void realizaPagamento(double total) {
        System.out.println("boleto gerado no valor de " + total);
    }
}