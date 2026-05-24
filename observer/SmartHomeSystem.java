public class SmartHomeSystem {
    public static void main(String[] args) {
        TemperatureSensor sensor = new TemperatureSensor();

        sensor.registerObserver(new AirConditioner());
        sensor.registerObserver(new Heater());
        sensor.registerObserver(new LCDDisplay());

        System.out.println("=== Simulacion Smart Home - Patron Observer ===");

        sensor.setTemperature(28.5f);
        sensor.setTemperature(22.0f);
        sensor.setTemperature(13.0f);
        sensor.setTemperature(20.0f);

        System.out.println("\n[TEST] Intentando setTemperature(20.0f) sin cambio...");
        sensor.setTemperature(20.0f);
        System.out.println("[SENSOR] No se enviaron notificaciones (temperatura sin cambio).");
    }
}
