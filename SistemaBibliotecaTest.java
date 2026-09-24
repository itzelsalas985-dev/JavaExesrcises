import Exercises.Biblioteca;
import Exercises.Libro;
import Exercises.Usuario;
import Exercises.UsuarioPremium;
import Exercises.UsuarioRegular;

public class SistemaBibliotecaTest {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Libro libro1 = new Libro("El principito");
        Libro libro2 = new Libro("Don Quijote");
        Libro libro3 = new Libro("Cien años de soledad");

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);

        Usuario usuarioRegular =
                new UsuarioRegular("Itzel");

        Usuario usuarioPremium =
                new UsuarioPremium("María");

        biblioteca.prestarLibro(libro1, usuarioRegular);
        biblioteca.prestarLibro(libro2, usuarioRegular);
        biblioteca.prestarLibro(libro3, usuarioPremium);

        boolean prestamosCorrectos =
                libro1.estaPrestado()
                && libro2.estaPrestado()
                && libro3.estaPrestado();

        boolean limitesCorrectos =
                usuarioRegular.getMaximoPrestamos() == 2
                && usuarioPremium.getMaximoPrestamos() == 5;

        biblioteca.devolverLibro(
                libro1,
                usuarioRegular
        );

        boolean devolucionCorrecta =
                !libro1.estaPrestado();

        System.out.println(
                "Prueba SistemaBiblioteca: "
                + (prestamosCorrectos
                && limitesCorrectos
                && devolucionCorrecta)
        );
    }
}