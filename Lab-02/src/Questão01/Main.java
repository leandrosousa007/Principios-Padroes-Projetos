package Questão01;

public class Main {
    public static void main(String[] args) {
        FabricanteCelular apple = Apple.getInstancia();
        FabricanteCelular samsung = Samsung.getInstancia();

        Celular iphone = apple.constroiCelular("IPhoneX");
        Celular galaxy = samsung.constroiCelular("Galaxy8");

        iphone.fazLigacao();
        iphone.tiraFoto();

        System.out.println();
        galaxy.fazLigacao();
        galaxy.tiraFoto();


    }
}
