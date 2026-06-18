package questao02;

public class Leite extends AdicionalDecorator {
    private Bebida bebida;
    
    public Leite(Bebida bebida) {
        this.bebida = bebida;
    }
    
    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " com leite";
    }
    
    @Override
    public double calculaCusto() {
        return bebida.calculaCusto() + 1.50;
    }
}