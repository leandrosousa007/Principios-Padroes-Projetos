package Questão02;

public class Fit implements IVehicle{

    @Override
    public void start(){
        System.out.println("Ligando o carro...");
        System.out.println("Fit ligado!");
    }

    @Override
    public void drive(){
        System.out.println("Dirigindo o carro...");
        System.out.println("Fit andando!");
    }

    @Override
    public void stop(){
        System.out.println("Parando o carro...");
        System.out.println("Fit parado!");
    }
}