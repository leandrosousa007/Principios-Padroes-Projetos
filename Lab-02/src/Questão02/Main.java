package Questão02;

public class Main {
    public static void main(String[] args) {
        //Produtos HONDA
        IVehicleMaker honda = Honda.getInstancia();

        IVehicle civic = honda.makeVehicle("Civic");
        IVehicle city = honda.makeVehicle("City");
        IVehicle fit = honda.makeVehicle("Fit");

        //Produtos TOYOTA
        IVehicleMaker toyota = Toyota.getInstancia();

        IVehicle corolla = toyota.makeVehicle("Corolla");
        IVehicle hilux = toyota.makeVehicle("Hilux");
        IVehicle etios = toyota.makeVehicle("Etios");


        //Testes

        System.out.println("--- Veículos HONDA ---");
        corolla.start();
        corolla.drive();
        corolla.stop();

        System.out.println("\n");


        System.out.println("--- Veículos TOYOTA ---");
        civic.start();
        civic.drive();
        civic.stop();


    }
}
