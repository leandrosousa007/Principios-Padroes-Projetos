import java.util.ArrayList;
import java.util.List;

public class Acao {
    private String nome;
    private double precoAtual;
    private List<ObservadorAcao> investidores = new ArrayList<>();

    public Acao(String nome, double precoAtual) {
        this.nome = nome;
        this.precoAtual = precoAtual;
    }

    public String getNome() {
        return nome;
    }

    public double getPrecoAtual() {
        return precoAtual;
    }

    public void adicionarInvestidor(ObservadorAcao investidor) {
        investidores.add(investidor);
    }

    public void removerInvestidor(ObservadorAcao investidor) {
        investidores.remove(investidor);
    }

    public void setPrecoAtual(double novoPreco) {
        this.precoAtual = novoPreco;
        notificarInvestidores();
    }

    private void notificarInvestidores() {
        for (ObservadorAcao investidor : investidores) {
            investidor.atualizarPreco(this);
        }
    }
}