package Exercises;

public abstract class Usuario {
    private final String nombre;

    protected Usuario(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "El nombre es obligatorio"
            );
        }

        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract int getMaximoPrestamos();
}