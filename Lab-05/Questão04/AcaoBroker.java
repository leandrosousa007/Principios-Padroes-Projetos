public class AcaoBroker {
    public void vender(String acao, String investidor, double preco) {
        System.out.println("venda da acao " + acao + " executada para o investidor " + investidor + " no valor de " + preco);
    }

    public void comprar(String acao, String investidor, double preco) {
        System.out.println("compra da acao " + acao + " executada para o investidor " + investidor + " no valor de " + preco);
    }
}