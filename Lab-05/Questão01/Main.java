public class Main {
    public static void main(String[] args) {
        CarrinhoCompras carrinho = new CarrinhoCompras();
        
        carrinho.adicionaItem(new Item("livro padroes de projeto", 150.0));
        carrinho.adicionaItem(new Item("caderno", 30.0));

        System.out.println("total do carrinho: " + carrinho.calculaTotal());

        carrinho.setPagamentoStrategy(new PixPagamento());
        
        carrinho.realizaPagamento();
    }
}