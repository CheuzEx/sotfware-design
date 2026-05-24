class AirConditioner implements Observer {
    public void update(float temperature) {
        if (temperature > 26.0f) {
            System.out.println("  [AC] Temperatura alta (" + temperature + "°C). Activando enfriamiento.");
        } else {
            System.out.println("  [AC] Temperatura normal (" + temperature + "°C). Sin accion.");
        }
    }
}
