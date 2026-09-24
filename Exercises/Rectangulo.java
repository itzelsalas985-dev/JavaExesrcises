package Exercises;

public class Rectangulo extends Figura {
    private final double base;
    private final double altura;

    public Rectangulo(double base, double altura) {
        if (base <= 0 || altura <= 0) {
            throw new IllegalArgumentException(
                    "La base y la altura deben ser positivas"
            );
        }

        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}