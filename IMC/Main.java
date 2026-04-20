public class Main {
    public static void main(String[] args) {
        DispositivoImperial dispositivo = new DispositivoImperial(180, 5.9);
        IMCService servicio = new IMCServiceImpl();
        AdapterImperial adapter = new AdapterImperial(dispositivo, servicio);
        adapter.procesarPaciente();
    }
}
