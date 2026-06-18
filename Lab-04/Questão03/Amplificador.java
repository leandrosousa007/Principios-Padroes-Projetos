package questao03;

public class Amplificador {
    public void liga() {
        System.out.println("Amplificador ligado.");
    }

    public void desliga() {
        System.out.println("Amplificador desligado.");
    }

    public void ajustaVolume(int nivel) {
        System.out.println("Volume do amplificador ajustado para " + nivel + ".");
    }
}