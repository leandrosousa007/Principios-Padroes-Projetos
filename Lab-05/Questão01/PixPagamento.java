public class PixPagamento implements PagamentoStrategy {
    @Override
    public void realizaPagamento(double total) {
        System.out.println("pagamento de " + total + " realizado via pix");
    }
}