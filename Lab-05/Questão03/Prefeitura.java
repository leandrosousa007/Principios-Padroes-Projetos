public class Prefeitura implements Observador {
    @Override
    public void atualizar(double temperatura, double umidade, double vento) {
        if (umidade < 30.0) {
            System.out.println("alerta defesa civil: umidade relativa do ar em nivel critico (" + umidade + "%)");
        }
    }
}