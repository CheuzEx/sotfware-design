public class IMCServiceImpl implements IMCService {
    @Override
    public double calcularIMC(double pesoKg, double alturaM) {
        return pesoKg / (alturaM * alturaM);
    }

    @Override
    public String rango(double imc) {
        if (imc < 18.5) return "Bajo peso";
        if (imc < 25) return "Normal";
        return "Sobrepeso";
    }
}
