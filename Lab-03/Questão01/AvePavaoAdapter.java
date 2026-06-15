

public class AvePavaoAdapter implements Ave {
    
    private Pavao pavao;
    
    public AvePavaoAdapter(Pavao p){
        this.pavao = p;
    }

    public void voar() {
        System.out.println("Pavao nao voa");
    }

    public void emitirSom() {
        pavao.cantar();
    }
    
}
