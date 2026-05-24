package Questão02;

public class Honda implements IVehicleMaker{

    private static Honda instancia;

    //Aqui impedimos o new Honda
    private Honda() {}

    //Singleton
    //O padrão singleton será melhor aproveitado quando existe apenas uma instância a ser criada!
    //Haverá somente uma instância da Toyota.
    public static Honda getInstancia() {
        if (instancia == null) {
            instancia = new Honda();
        }
        return instancia;
    }

    //Factory
    //Como haverá a criação de diversos objetos, o correto é o padrão Factory!
    @Override
    public IVehicle makeVehicle(String modelo){
        if(modelo.equals("City")){
            return new City();
        }
        else if(modelo.equals("Civic")){
            return new Civic();
        }
        else if(modelo.equals("Fit")){
            return new Fit();
        }
        return null;
    }

}
