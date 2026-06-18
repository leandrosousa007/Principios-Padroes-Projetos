public class Main {
    public static void main(String[] args) {
        AcaoBroker broker = new AcaoBroker();
        
        Acao vale3 = new Acao("VALE3", 65.0);
        
        Investidor investidor1 = new Investidor("carlos", 60.0, 70.0, broker);
        Investidor investidor2 = new Investidor("ana", 55.0, 68.0, broker);
        
        vale3.adicionarInvestidor(investidor1);
        vale3.adicionarInvestidor(investidor2);
        
        vale3.setPrecoAtual(69.0);
        
        vale3.setPrecoAtual(58.0);
    }
}