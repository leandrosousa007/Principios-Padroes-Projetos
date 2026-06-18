import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    private List<Item> itens = new ArrayList<>();
    private PagamentoStrategy estrategia;

    public void setPagamentoStrategy(PagamentoStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public void adicionaItem(Item item) {
        itens.add(item);
    }

    public void removeItem(Item item) {
        itens.remove(item);
    }

    public double calculaTotal() {
        return itens.stream().mapToDouble(Item::getPreco).sum();
    }

    public void realizaPagamento() {
        if (estrategia == null) {
            System.out.println("erro: escolha uma forma de pagamento");
            return;
        }
        double total = calculaTotal();
        estrategia.realizaPagamento(total);
    }
}