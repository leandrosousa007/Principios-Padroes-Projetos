package Questão02;

public class Toyota implements IVehicleMaker{

    private static Toyota instancia;

        //Aqui impedimos o new Toyota
        private Toyota() {}

        //Singleton
        //O padrão singleton será melhor aproveitado quando existe apenas uma instância a ser criada!
        //Haverá somente uma instância da Toyota.
        public static Toyota getInstancia() {
            if (instancia == null) {
                instancia = new Toyota();
            }
            return instancia;
    }

    //Factory
    //Como haverá a criação de diversos objetos, o correto é o padrão Factory!
    @Override
    public IVehicle makeVehicle(String modelo) {
        if(modelo.equals("Corolla")){
            return new Corolla();
        }
        else if(modelo.equals("Hilux")){
            return new Hilux();
        }
        else if(modelo.equals("Etios")){
            return new Etios();
        }
        return null;
    }

}
