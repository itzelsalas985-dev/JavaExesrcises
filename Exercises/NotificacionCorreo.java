package Exercises;

public class NotificacionCorreo implements Notificacion {
    private final String destinatario;

    public NotificacionCorreo(String destinatario) {
        this.destinatario = destinatario;
    }

    @Override
    public void enviar(String mensaje) {
        System.out.println(
                "Correo para " + destinatario + ": " + mensaje
        );
    }
}