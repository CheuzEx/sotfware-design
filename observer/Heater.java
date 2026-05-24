class Heater implements Observer {
    public void update(float temperature) {
        if (temperature < 16.0f) {
            System.out.println("  [CALEFACTOR] Temperatura baja (" + temperature + "°C). Activando calefaccion.");
        } else {
            System.out.println("  [CALEFACTOR] Temperatura normal (" + temperature + "°C). Sin accion.");
        }
    }
}
