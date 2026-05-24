package Questão01;

public class IPhoneS implements Celular {

    @Override
    public void fazLigacao(){
        System.out.println("IPhoneS fazendo ligacao...");
    }

    @Override
    public void tiraFoto(){
        System.out.println("IPhoneS tirando foto...");
    }
}
