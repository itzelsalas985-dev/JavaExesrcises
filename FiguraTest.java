import Exercises.Circulo;
import Exercises.Figura;
import Exercises.Rectangulo;

public class FiguraTest {

    public static void main(String[] args) {
        Figura circulo = new Circulo(2);
        Figura rectangulo = new Rectangulo(4, 3);

        boolean areaCirculoCorrecta =
                Math.abs(circulo.calcularArea() - 12.566370614359172)
                < 0.0001;

        boolean areaRectanguloCorrecta =
                rectangulo.calcularArea() == 12;

        System.out.println(
                "Prueba Figura: "
                + (areaCirculoCorrecta && areaRectanguloCorrecta)
        );
    }
}