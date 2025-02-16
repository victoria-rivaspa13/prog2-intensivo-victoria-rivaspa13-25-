package Intensivo.Entrega09;

public class CuentaBancaria {

    private int id;
    private double saldo;

    public CuentaBancaria(int id) {
        this.id = id;
        this.saldo = 0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto debe ser positivo");
        }
        saldo += monto;
    }

    public void retirar(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto debe ser positivo");
        }
        if (saldo < monto) {
            throw new IllegalArgumentException("Saldo insuficiente");
        }
        saldo -= monto;
    }

    public void transferir(CuentaBancaria cuentaDestino, double monto) {
        if (cuentaDestino == null) {
            throw new NullPointerException("Cuenta de destino no existe");
        }
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto debe ser positivo");
        }
        if (this == cuentaDestino) {
            throw new IllegalArgumentException("No se puede transferir entre la misma cuenta");
        }
        if (saldo < monto) {
            throw new IllegalArgumentException("Saldo insuficiente");
        }
        this.retirar(monto);
        cuentaDestino.depositar(monto);
    }
}

