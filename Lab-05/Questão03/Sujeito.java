public interface Sujeito {
    void registrar(Observador obs);
    void remover(Observador obs);
    void notificar();
}