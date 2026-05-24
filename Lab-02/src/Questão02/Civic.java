package Questão02;

public class Civic implements IVehicle{

    @Override
    public void start(){
        System.out.println("Ligando o carro...");
        System.out.println("Civic ligado!");
    }

    @Override
    public void drive(){
        System.out.println("Dirigindo o carro...");
        System.out.println("Civic andando!");
    }

    @Override
    public void stop(){
        System.out.println("Parando o carro...");
        System.out.println("Civic parado!");
    }
}