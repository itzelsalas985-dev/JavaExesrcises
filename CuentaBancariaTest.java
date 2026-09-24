import Exercises.CuentaBancaria;

public class CuentaBancariaTest {

    public static void main(String[] args) {
        CuentaBancaria cuenta =
                new CuentaBancaria("Itzel Salas", 1000);

        cuenta.depositar(500);
        cuenta.retirar(300);

        boolean titularCorrecto =
                cuenta.getTitular().equals("Itzel Salas");

        boolean saldoCorrecto =
                cuenta.getSaldo() == 1200;

        System.out.println(
                "Prueba CuentaBancaria: "
                + (titularCorrecto && saldoCorrecto)
        );
    }
}