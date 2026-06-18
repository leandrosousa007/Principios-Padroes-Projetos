package questao04;

public class CarroFachada {
    private Motor motor;
    private CintoDeSeguranca cinto;
    private Porta porta;
    private Farol farol;
    private Radio radio;

    public CarroFachada(Motor motor, CintoDeSeguranca cinto, Porta porta, Farol farol, Radio radio) {
        this.motor = motor;
        this.cinto = cinto;
        this.porta = porta;
        this.farol = farol;
        this.radio = radio;
    }

    public void iniciarCorrida(String estacaoPreferida) {
        System.out.println("Iniciando a corrida...");
        motor.ligar();
        porta.trancar();
        cinto.travar();
        farol.acender();
        radio.ligar();
        radio.sintonizar(estacaoPreferida);
    }

    public void finalizarCorrida() {
        System.out.println("\nFinalizando a corrida...");
        motor.desligar();
        porta.destrancar();
        cinto.destravar();
        farol.apagar();
        radio.desligar();
    }
}