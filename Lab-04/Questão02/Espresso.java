package questao02;

public class Espresso extends Bebida {
    public Espresso() {
        descricao = "Café Espresso";
    }
    
    @Override
    public double calculaCusto() {
        return 5.00; // Custo base do espresso
    }
}