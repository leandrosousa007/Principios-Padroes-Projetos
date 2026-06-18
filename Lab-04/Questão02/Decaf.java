package questao02;

public class Decaf extends Bebida {
    public Decaf() {
        descricao = "Café Descafeinado";
    }
    
    @Override
    public double calculaCusto() {
        return 4.50; // Custo base do decaf
    }
}