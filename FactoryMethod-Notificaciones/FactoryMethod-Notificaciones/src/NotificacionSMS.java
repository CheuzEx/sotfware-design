public class NotificacionSMS implements Notificacion {
    public void enviar(String mensaje) {
        System.out.println("SMS: " + mensaje);
    }
}
