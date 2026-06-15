public class Main01 {
    
    public static void main(String ... args){
        
        Pavao pavaoAzul = new PavaoAzul();
        Pato patoDomestico = new PatoDomestico();
        
        Ave avePavao = new AvePavaoAdapter(pavaoAzul);
        avePavao.emitirSom();
        avePavao.voar();
                
        Ave avePato = new AvePatoAdapter(patoDomestico);
        avePato.emitirSom();
        avePato.voar();
    }
}
