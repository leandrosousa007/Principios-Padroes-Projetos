public class Aeroporto implements Observador {
    @Override
    public void atualizar(double temperatura, double umidade, double vento) {
        if (vento > 60.0) {
            System.out.println("alerta aeroporto: rajadas de vento perigosas registradas (" + vento + " km/h)");
        }
    }
}