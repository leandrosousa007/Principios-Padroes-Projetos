public class Main {
    public static void main(String[] args) {
        CarrinhoCompras carrinho = new CarrinhoCompras();
        
        carrinho.adicionaItem(new Item("teclado mecanico", 250.0));
        carrinho.adicionaItem(new Item("mouse", 80.0));

        carrinho.setFreteStrategy(new SedexFrete());
        carrinho.setPagamentoStrategy(new PixPagamento());

        System.out.println("valor dos itens: " + carrinho.calculaTotal());
        System.out.println("valor do frete: " + carrinho.calculaFrete());
        
        carrinho.realizaPagamento();
    }
}