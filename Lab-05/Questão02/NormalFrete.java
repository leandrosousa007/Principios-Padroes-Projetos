public class NormalFrete implements FreteStrategy {
    @Override
    public double calculaFrete(double totalItens) {
        return 10.0; // valor fixo de entrega convencional para o exemplo
    }
}