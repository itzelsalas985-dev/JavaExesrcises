package Exercises;

public class Vehiculo {
    private final String marca;
    private final String modelo;

    public Vehiculo(String marca, String modelo) {
        if (marca == null || marca.trim().isEmpty()
                || modelo == null || modelo.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "La marca y el modelo son obligatorios"
            );
        }

        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String mostrarInformacion() {
        return marca + " " + modelo;
    }
}