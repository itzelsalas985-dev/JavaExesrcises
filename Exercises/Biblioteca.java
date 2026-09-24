package Exercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Biblioteca {
    private final List<Libro> libros = new ArrayList<>();
    private final Map<Usuario, List<Libro>> prestamos =
            new HashMap<>();

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void prestarLibro(Libro libro, Usuario usuario) {
        if (!libros.contains(libro)) {
            throw new IllegalArgumentException(
                    "El libro no pertenece a la biblioteca"
            );
        }

        List<Libro> librosDelUsuario =
                prestamos.computeIfAbsent(
                        usuario,
                        clave -> new ArrayList<>()
                );

        if (librosDelUsuario.size()
                >= usuario.getMaximoPrestamos()) {
            throw new IllegalStateException(
                    "Se alcanzó el límite de préstamos"
            );
        }

        libro.prestar();
        librosDelUsuario.add(libro);
    }

    public void devolverLibro(
            Libro libro,
            Usuario usuario) {

        List<Libro> librosDelUsuario =
                prestamos.get(usuario);

        if (librosDelUsuario == null
                || !librosDelUsuario.remove(libro)) {
            throw new IllegalArgumentException(
                    "El usuario no tiene este libro"
            );
        }

        libro.devolver();
    }
}