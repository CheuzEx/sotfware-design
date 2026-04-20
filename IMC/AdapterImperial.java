public class AdapterImperial {
    private DispositivoImperial adaptee;
    private IMCService servicio;

    public AdapterImperial(DispositivoImperial adaptee, IMCService servicio) {
        this.adaptee = adaptee;
        this.servicio = servicio;
    }

    private double librasAKg(double lb) {
        return lb * 0.4536;
    }

    private double piesAMetros(double ft) {
        return ft * 0.3048;
    }

    public void procesarPaciente() {
        double pesoKg = librasAKg(adaptee.getPesoLibras());
        double alturaM = piesAMetros(adaptee.getAlturaPies());
        double imc = servicio.calcularIMC(pesoKg, alturaM);
        String rango = servicio.rango(imc);
        System.out.println("Peso convertido (kg): " + pesoKg);
        System.out.println("Altura convertida (m): " + alturaM);
        System.out.println("IMC: " + imc);
        System.out.println("Rango: " + rango);
    }
}
