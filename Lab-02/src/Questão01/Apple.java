package Questão01;

public class Apple implements FabricanteCelular {

    private static Apple instancia;

    private Apple() {}

    public static Apple getInstancia() {
        if (instancia == null) {
            instancia = new Apple();
        }
        return instancia;
    }

    @Override
    public Celular constroiCelular(String modelo) {

        if(modelo.equals("IPhoneX")) {
            return new IPhoneX();
        }
        else if(modelo.equals("iPhoneS")) {
            return new IPhoneS();
        }
        return null;
    }

}
