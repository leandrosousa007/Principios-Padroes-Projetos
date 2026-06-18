package questao03;

public class Main {
    public static void main(String[] args) {
        Amplificador amplificador = new Amplificador();
        Luzes luzes = new Luzes();
        MaquinaDePipoca pipoca = new MaquinaDePipoca();
        Projetor projetor = new Projetor();
        PlayerDeStreaming player = new PlayerDeStreaming();
        Telao telao = new Telao();

        HomeTheaterFachada homeTheater = new HomeTheaterFachada(
                amplificador, luzes, pipoca, projetor, player, telao);

        homeTheater.assistirFilme("Clube da Luta");
        
        homeTheater.fimDoFilme();
    }
}