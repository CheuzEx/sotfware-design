import java.util.Vector;

class TemperatureSensor implements Subject {
    private Vector<Observer> observers;
    private float temperature;

    public TemperatureSensor() {
        observers = new Vector<Observer>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(temperature);
        }
    }

    public void setTemperature(float temp) {
        if (this.temperature != temp) {
            this.temperature = temp;
            System.out.println("\n[SENSOR] Nueva lectura: " + temp + "°C");
            notifyObservers();
        }
    }
}
