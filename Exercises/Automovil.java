package Exercises;

public class Automovil extends Vehiculo {
    private final int numeroPuertas;

    public Automovil(
            String marca,
            String modelo,
            int numeroPuertas) {

        super(marca, modelo);

        if (numeroPuertas <= 0) {
            throw new IllegalArgumentException(
                    "El número de puertas debe ser positivo"
            );
        }

        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion()
                + ", puertas: " + numeroPuertas;
    }
}