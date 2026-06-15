public class Main04 {
    public static void main(String[] args) {
        AcessoDadosFuncionario acessoNegado = new ProxyBancoDeDadosRH("estagiario");
        acessoNegado.visualizarSalario("joao");

        AcessoDadosFuncionario acessoPermitido = new ProxyBancoDeDadosRH("diretor");
        acessoPermitido.visualizarSalario("joao");
    }
}