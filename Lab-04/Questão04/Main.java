package questao04;

public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor();
        CintoDeSeguranca cinto = new CintoDeSeguranca();
        Porta porta = new Porta();
        Farol farol = new Farol();
        Radio radio = new Radio();

        CarroFachada carro = new CarroFachada(motor, cinto, porta, farol, radio);

        carro.iniciarCorrida("FM 99.9");
        
        carro.finalizarCorrida();
    }
}