package questao03;

public class HomeTheaterFachada {
    private Amplificador amplificador;
    private Luzes luzes;
    private MaquinaDePipoca pipoca;
    private Projetor projetor;
    private PlayerDeStreaming player;
    private Telao telao;

    public HomeTheaterFachada(Amplificador amplificador, Luzes luzes, MaquinaDePipoca pipoca,
                              Projetor projetor, PlayerDeStreaming player, Telao telao) {
        this.amplificador = amplificador;
        this.luzes = luzes;
        this.pipoca = pipoca;
        this.projetor = projetor;
        this.player = player;
        this.telao = telao;
    }

    public void assistirFilme(String filme) {
        System.out.println("Preparando para assistir ao filme...");
        pipoca.liga();
        pipoca.arrebentaPipoca();
        luzes.desliga();
        telao.abaixa();
        projetor.liga();
        amplificador.liga();
        amplificador.ajustaVolume(10);
        player.liga();
        player.play(filme);
    }

    public void fimDoFilme() {
        System.out.println("\nEncerrando a sessão de cinema...");
        player.desliga();
        amplificador.desliga();
        projetor.desliga();
        telao.sobe();
        luzes.liga();
        pipoca.desliga();
    }
}