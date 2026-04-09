public class NotificacionEmail implements Notificacion {
    public void enviar(String mensaje) {
        System.out.println("Email: " + mensaje);
    }
}
