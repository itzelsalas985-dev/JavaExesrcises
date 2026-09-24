package Exercises;

public class Libro {
    private final String titulo;
    private boolean prestado;

    public Libro(String titulo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "El título es obligatorio"
            );
        }

        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean estaPrestado() {
        return prestado;
    }

    public void prestar() {
        if (prestado) {
            throw new IllegalStateException(
                    "El libro ya está prestado"
            );
        }

        prestado = true;
    }

    public void devolver() {
        prestado = false;
    }
}