import Exercises.Notificacion;
import Exercises.NotificacionConsola;
import Exercises.NotificacionCorreo;

import java.util.Arrays;
import java.util.List;

public class NotificacionTest {

    public static void main(String[] args) {
        List<Notificacion> notificaciones = Arrays.asList(
                new NotificacionCorreo("alumno@ejemplo.com"),
                new NotificacionConsola()
        );

        for (Notificacion notificacion : notificaciones) {
            notificacion.enviar(
                    "La actividad fue registrada"
            );
        }

        System.out.println("Prueba Notificacion: true");
    }
}