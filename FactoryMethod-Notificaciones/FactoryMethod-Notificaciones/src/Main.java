import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tipo (sms/email): ");
        String tipo = sc.nextLine();

        NotificacionFactory factory;

        switch (tipo.toLowerCase()) {
            case "sms":
                factory = new SMSFactory();
                break;
            case "email":
                factory = new EmailFactory();
                break;
            default:
                throw new IllegalArgumentException("Tipo inválido");
        }

        Notificacion noti = factory.crearNotificacion();
        noti.enviar("Mensaje de prueba");
    }
}
