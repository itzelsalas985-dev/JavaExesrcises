package Exercises;

public class NotificacionConsola implements Notificacion {

    @Override
    public void enviar(String mensaje) {
        System.out.println("Notificación: " + mensaje);
    }
}