package Questão02;

public class City implements IVehicle{

    @Override
    public void start(){
        System.out.println("Ligando o carro...");
        System.out.println("City ligado!");
    }

    @Override
    public void drive(){
        System.out.println("Dirigindo o carro...");
        System.out.println("City andando!");
    }

    @Override
    public void stop(){
        System.out.println("Parando o carro...");
        System.out.println("City parando!");
    }
}