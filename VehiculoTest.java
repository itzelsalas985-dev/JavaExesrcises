import Exercises.Automovil;
import Exercises.Motocicleta;
import Exercises.Vehiculo;

public class VehiculoTest {

    public static void main(String[] args) {
        Vehiculo automovil =
                new Automovil("Nissan", "Kicks", 5);

        Vehiculo motocicleta =
                new Motocicleta("Yamaha", "FZ", true);

        boolean automovilCorrecto =
                automovil.mostrarInformacion()
                .contains("Nissan Kicks");

        boolean motocicletaCorrecta =
                motocicleta.mostrarInformacion()
                .equals("Yamaha FZ - Canastilla: true");

        System.out.println(
                "Prueba Vehiculo: "
                + (automovilCorrecto && motocicletaCorrecta)
        );
    }
}