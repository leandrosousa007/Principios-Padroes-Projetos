

public class AvePatoAdapter implements Ave {
    
    private Pato pato;
    
    public AvePatoAdapter(Pato p){
        this.pato = p;
    }

    public void voar() {
        pato.voar();
    }

    public void emitirSom() {
        pato.grasnar();
    }
    
}
