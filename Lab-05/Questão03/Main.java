public class Main {
    public static void main(String[] args) {
        CentralTempo cet = new CentralTempo();
        
        Prefeitura prefeitura = new Prefeitura();
        Aeroporto aeroporto = new Aeroporto();
        
        cet.registrar(prefeitura);
        cet.registrar(aeroporto);
        
        cet.setDados(32.0, 25.0, 40.0);
        
        cet.setDados(28.0, 50.0, 65.0);
    }
}