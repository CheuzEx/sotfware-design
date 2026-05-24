class LCDDisplay implements Observer {
    public void update(float temperature) {
        System.out.println("  [LCD] Actualizando panel: " + temperature + "°C.");
    }
}
