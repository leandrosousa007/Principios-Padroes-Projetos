public class CartaoPagamento implements PagamentoStrategy {
    @Override
    public void realizaPagamento(double total) {
        System.out.println("pagamento de " + total + " aprovado no cartao de credito");
    }
}