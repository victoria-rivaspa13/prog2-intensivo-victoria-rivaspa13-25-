package Intensivo.Práctica_primer_parcial;
import java.time.LocalDateTime;

class Trip {
    LocalDateTime fechaHora;
    private double cost;

    public Trip(int day, int month, int year, int hour, int minute, double cost) {
        this.fechaHora = fechaHora;
        this.cost = cost;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public double getCost() {
        return cost;
    }
}

