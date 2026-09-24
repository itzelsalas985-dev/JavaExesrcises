package Exercises;

public class UsuarioRegular extends Usuario {

    public UsuarioRegular(String nombre) {
        super(nombre);
    }

    @Override
    public int getMaximoPrestamos() {
        return 2;
    }
}