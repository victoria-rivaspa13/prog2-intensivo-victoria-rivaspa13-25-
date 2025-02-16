package Intensivo.Práctica_primer_parcial;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

abstract class Tarjeta {
    protected double saldo;
    protected double descubierto;
    protected List<Viaje> viajes;

    public Tarjeta(double saldoInicial, double descubierto) {
        this.saldo = saldoInicial;
        this.descubierto = descubierto;
        this.viajes = new ArrayList<>();
    }

    public boolean registrarViaje(double costo) {
        double saldoDisponible = saldo + descubierto;
        if (saldoDisponible >= costo) {
            saldo -= costo;
            viajes.add(new Viaje(LocalDateTime.now(), costo));
            return true;
        }
        return false;
    }

    public void cargarSaldo(double monto) {
        this.saldo += monto;
    }

    public double consultarSaldo() {
        return saldo;
    }
}

class Viaje {
    LocalDateTime fechaHora;
    private double costo;

    public Viaje(LocalDateTime fechaHora, double costo) {
        this.fechaHora = fechaHora;
        this.costo = costo;
    }
}

class StandardCard extends Tarjeta {
    private int puntos;

    public StandardCard(double saldoInicial, double descubierto) {
        super(saldoInicial, descubierto);
        this.puntos = 0;
    }

    @Override
    public void cargarSaldo(double monto) {
        super.cargarSaldo(monto);
        if (monto > 100) {
            puntos += 10;
        } else {
            puntos += (int) (0.5 * monto);
        }
    }

    public int getPuntos() {
        return puntos;
    }
}

class JubiladoCard extends Tarjeta {
    private int puntos;

    public JubiladoCard(double saldoInicial, double descubierto) {
        super(saldoInicial, descubierto);
        this.puntos = 0;
    }

    @Override
    public boolean registrarViaje(double costo) {
        double costoDescuento = costo * 0.8;
        return super.registrarViaje(costoDescuento);
    }

    @Override
    public void cargarSaldo(double monto) {
        super.cargarSaldo(monto);
        puntos += 2 * monto;
    }

    public int getPuntos() {
        return puntos;
    }
}

class EstudianteCard extends Tarjeta {

    public EstudianteCard(double saldoInicial, double descubierto) {
        super(saldoInicial, descubierto);
    }

    @Override
    public boolean registrarViaje(double costo) {
        long viajesHoy = viajes.stream()
                .filter(v -> v.fechaHora.toLocalDate().equals(LocalDateTime.now().toLocalDate()))
                .count();

        if (viajesHoy < 2) {
            costo *= 0.2;
        }
        return super.registrarViaje(costo);
    }
}
