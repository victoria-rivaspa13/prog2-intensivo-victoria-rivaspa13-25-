package Intensivo.Composition;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CuentaBancariaTest {

    @Test
    void testCrearCuenta() {
        CuentaBancaria cuenta = new CuentaBancaria(1); // Creando una cuenta con ID 1
        assertEquals(0, cuenta.getSaldo()); // El saldo inicial debe ser 0
    }

    @Test
    void testDepositar() {
        CuentaBancaria cuenta = new CuentaBancaria(1);
        cuenta.depositar(500); // Depositar 500
        assertEquals(500, cuenta.getSaldo()); // El saldo debe ser 500
    }

    @Test
    void testDepositarNegativo() {
        CuentaBancaria cuenta = new CuentaBancaria(1);
        assertThrows(IllegalArgumentException.class, () -> cuenta.depositar(-100)); // no se debe permitir depósito negativo
    }

    @Test
    void testDepositarCuentaNoExistente() {
        CuentaBancaria cuenta = null;
        assertThrows(NullPointerException.class, () -> cuenta.depositar(100)); // no se debe permitir depósito en cuenta no existente
    }

    @Test
    void testRetirar() {
        CuentaBancaria cuenta = new CuentaBancaria(1);
        cuenta.depositar(500);
        cuenta.retirar(200); // Retirar 200
        assertEquals(300, cuenta.getSaldo()); // el saldo debe ser 300
    }

    @Test
    void testRetirarNegativo() {
        CuentaBancaria cuenta = new CuentaBancaria(1);
        assertThrows(IllegalArgumentException.class, () -> cuenta.retirar(-100)); // no se debe permitir retiro negativo
    }

    @Test
    void testRetirarSinSaldo() {
        CuentaBancaria cuenta = new CuentaBancaria(1);
        assertThrows(IllegalArgumentException.class, () -> cuenta.retirar(100)); // no se debe permitir retiro si no hay saldo suficiente
    }

    @Test
    void testRetirarCuentaNoExistente() {
        CuentaBancaria cuenta = null;
        assertThrows(NullPointerException.class, () -> cuenta.retirar(100)); // no se debe permitir retiro en cuenta no existente
    }

    @Test
    void testTransferir() {
        CuentaBancaria cuentaOrigen = new CuentaBancaria(1);
        CuentaBancaria cuentaDestino = new CuentaBancaria(2);

        cuentaOrigen.depositar(500);
        cuentaOrigen.transferir(cuentaDestino, 200); // transferir 200 de cuenta 1 a cuenta 2

        assertEquals(300, cuentaOrigen.getSaldo()); // el saldo de la cuenta origen debe ser 300
        assertEquals(200, cuentaDestino.getSaldo()); // el saldo de la cuenta destino debe ser 200
    }

    @Test
    void testTransferirSinSaldo() {
        CuentaBancaria cuentaOrigen = new CuentaBancaria(1);
        CuentaBancaria cuentaDestino = new CuentaBancaria(2);

        assertThrows(IllegalArgumentException.class, () -> cuentaOrigen.transferir(cuentaDestino, 100)); // no se debe permitir transferencia sin saldo
    }

    @Test
    void testTransferirCuentaNoExistente() {
        CuentaBancaria cuentaOrigen = new CuentaBancaria(1);
        CuentaBancaria cuentaDestino = null;

        assertThrows(NullPointerException.class, () -> cuentaOrigen.transferir(cuentaDestino, 100)); // no se debe permitir transferencia a cuenta no existente
    }

    @Test
    void testTransferirNegativo() {
        CuentaBancaria cuentaOrigen = new CuentaBancaria(1);
        CuentaBancaria cuentaDestino = new CuentaBancaria(2);

        assertThrows(IllegalArgumentException.class, () -> cuentaOrigen.transferir(cuentaDestino, -100)); // no se debe permitir transferencia negativa
    }

    @Test
    void testTransferirMismaCuenta() {
        CuentaBancaria cuenta = new CuentaBancaria(1);
        assertThrows(IllegalArgumentException.class, () -> cuenta.transferir(cuenta, 100)); // no se debe permitir transferencia a la misma cuenta
    }
}

