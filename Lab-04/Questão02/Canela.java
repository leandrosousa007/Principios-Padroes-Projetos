package questao02;

public class Canela extends AdicionalDecorator {
    private Bebida bebida;
    
    public Canela(Bebida bebida) {
        this.bebida = bebida;
    }
    
    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " e um toque de canela"; // Descrição inteligível 
    }
    
    @Override
    public double calculaCusto() {
        return bebida.calculaCusto() + 0.50;
    }
}