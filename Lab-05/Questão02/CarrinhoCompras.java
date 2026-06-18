import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    private List<Item> itens = new ArrayList<>();
    private PagamentoStrategy pagamentoEstrategia;
    private FreteStrategy freteEstrategia;

    public void adicionaItem(Item item) {
        itens.add(item);
    }

    public void removeItem(Item item) {
        itens.remove(item);
    }

    public double calculaTotal() {
        return itens.stream().mapToDouble(Item::getPreco).sum();
    }

    public double calculaFrete() {
        if (freteEstrategia == null) {
            return 0.0;
        }
        return freteEstrategia.calculaFrete(calculaTotal());
    }

    public void setPagamentoStrategy(PagamentoStrategy estrategia) {
        this.pagamentoEstrategia = estrategia;
    }

    public void setFreteStrategy(FreteStrategy estrategia) {
        this.freteEstrategia = estrategia;
    }

    public void realizaPagamento() {
        if (pagamentoEstrategia == null) {
            System.out.println("erro: escolha uma forma de pagamento");
            return;
        }
        double valorFinal = calculaTotal() + calculaFrete();
        pagamentoEstrategia.realizaPagamento(valorFinal);
    }
}