package Exercises;

public class Circulo extends Figura {
    private final double radio;

    public Circulo(double radio) {
        if (radio <= 0) {
            throw new IllegalArgumentException(
                    "El radio debe ser positivo"
            );
        }

        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}