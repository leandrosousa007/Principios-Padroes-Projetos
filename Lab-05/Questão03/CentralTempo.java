import java.util.ArrayList;
import java.util.List;

public class CentralTempo implements Sujeito {
    private List<Observador> observadores = new ArrayList<>();
    private double temperatura;
    private double umidade;
    private double vento;

    @Override
    public void registrar(Observador obs) {
        observadores.add(obs);
    }

    @Override
    public void remover(Observador obs) {
        observadores.remove(obs);
    }

    @Override
    public void notificar() {
        for (Observador obs : observadores) {
            obs.atualizar(temperatura, umidade, vento);
        }
    }

    public void setDados(double temperatura, double umidade, double vento) {
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.vento = vento;
        notificar();
    }
}