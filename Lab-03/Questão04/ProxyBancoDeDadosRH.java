public class ProxyBancoDeDadosRH implements AcessoDadosFuncionario {
    private BancoDeDadosRH bancoReal;
    private String cargoUsuarioLogado;

    public ProxyBancoDeDadosRH(String cargoUsuarioLogado) {
        this.cargoUsuarioLogado = cargoUsuarioLogado;
    }

    @Override
    public void visualizarSalario(String nomeFuncionario) {
        if ("diretor".equalsIgnoreCase(cargoUsuarioLogado)) {
            if (bancoReal == null) {
                bancoReal = new BancoDeDadosRH();
            }
            bancoReal.visualizarSalario(nomeFuncionario);
        } else {
            System.out.println("acesso negado. apenas diretores podem ver salarios.");
        }
    }
}