package Intensivo.Herencia;

import java.time.LocalDateTime;

public class Reserva{
    private Intensivo.Herencia.Persona cliente;
    private Habitacion habitacion;
    private LocalDateTime from;
    private LocalDateTime to;

    // constructor recibe todos los tributos y los asigna
    public Reserva(Persona cliente, Habitacion habitacion, LocalDateTime from, LocalDateTime to) {
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.from = from;
        this.to = to;
    }

    public Persona getCliente() {
        return cliente;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public LocalDateTime getFrom() {
        return from;
    }

    public LocalDateTime getTo() {
        return to;
    }

    // verifica si una fecha esta dentro del rango de la reserva
    public boolean Ocupado(LocalDateTime fecha) {
        return fecha.isAfter(from) && fecha.isBefore(to);
    }

}
