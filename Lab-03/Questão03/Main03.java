public class Main03 {
    public static void main(String[] args) {
        SensorImportadoFahrenheit sensorF = new SensorImportadoFahrenheit();
        SensorTemperaturaCelsius sensorAdaptado = new AdaptadorDeSensor(sensorF);

        System.out.println("temperatura em celsius: " + sensorAdaptado.getTemperatura());
    }
}