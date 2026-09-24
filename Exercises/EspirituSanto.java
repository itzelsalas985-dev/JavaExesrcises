package Exercises;

public class EspirituSanto extends Hijo {
    String apellidoReal;

    public EspirituSanto(
            String nombre,
            String apellido,
            String apellidoReal) {

        super(nombre, apellido);
        this.apellidoReal = apellidoReal;
    }

    public Boolean pruebaParternidad() {
        return apellido.equals(apellidoReal);
    }
}