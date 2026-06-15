public class AdaptadorDeSensor implements SensorTemperaturaCelsius {
    private SensorImportadoFahrenheit sensorEstrangeiro;

    public AdaptadorDeSensor(SensorImportadoFahrenheit sensorEstrangeiro) {
        this.sensorEstrangeiro = sensorEstrangeiro;
    }

    @Override
    public double getTemperatura() {
        double tempF = sensorEstrangeiro.readTemperatureF();
        return (tempF - 32) * 5 / 9;
    }
}