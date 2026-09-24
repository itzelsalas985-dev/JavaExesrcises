package Exercises;

public class UsuarioPremium extends Usuario {

    public UsuarioPremium(String nombre) {
        super(nombre);
    }

    @Override
    public int getMaximoPrestamos() {
        return 5;
    }
}