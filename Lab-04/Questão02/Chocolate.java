package questao02;

public class Chocolate extends AdicionalDecorator {
    private Bebida bebida;
    
    public Chocolate(Bebida bebida) {
        this.bebida = bebida;
    }
    
    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " com cobertura de chocolate"; // Descrição inteligível 
    }
    
    @Override
    public double calculaCusto() {
        return bebida.calculaCusto() + 2.00;
    }
}