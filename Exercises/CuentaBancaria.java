package Exercises;

public class CuentaBancaria {
    private final String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldoInicial) {
        if (titular == null || titular.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "El titular es obligatorio"
            );
        }

        if (saldoInicial < 0) {
            throw new IllegalArgumentException(
                    "El saldo no puede ser negativo"
            );
        }

        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double cantidad) {
        validarCantidad(cantidad);
        saldo += cantidad;
    }

    public void retirar(double cantidad) {
        validarCantidad(cantidad);

        if (cantidad > saldo) {
            throw new IllegalArgumentException(
                    "Saldo insuficiente"
            );
        }

        saldo -= cantidad;
    }

    private void validarCantidad(double cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException(
                    "La cantidad debe ser positiva"
            );
        }
    }
}