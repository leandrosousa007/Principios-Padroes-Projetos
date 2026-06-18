public class Investidor implements ObservadorAcao {
    private String nome;
    private double limiteMinimo;
    private double limiteMaximo;
    private AcaoBroker broker;

    public Investidor(String nome, double limiteMinimo, double limiteMaximo, AcaoBroker broker) {
        this.nome = nome;
        this.limiteMinimo = limiteMinimo;
        this.limiteMaximo = limiteMaximo;
        this.broker = broker;
    }

    @Override
    public void atualizarPreco(Acao acao) {
        double precoAtual = acao.getPrecoAtual();

        if (precoAtual >= limiteMaximo) {
            broker.vender(acao.getNome(), nome, precoAtual);
        } else if (precoAtual <= limiteMinimo) {
            broker.comprar(acao.getNome(), nome, precoAtual);
        }
    }
}