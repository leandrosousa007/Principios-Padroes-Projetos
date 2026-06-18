public class SedexFrete implements FreteStrategy {
    @Override
    public double calculaFrete(double totalItens) {
        return 25.0; // valor fixo de entrega rapida para o exemplo
    }
}