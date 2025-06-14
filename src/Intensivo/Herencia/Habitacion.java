package Intensivo.Herencia;


public abstract class Habitacion {
    protected double precio;
    protected int capacidad;

    // inicializa precio y capacidad
    public Habitacion(double precio, int capacidad) {
        this.precio = precio;
        this.capacidad = capacidad;
    }

    // metodos getter para obtener precio y capacidad
    public double getPrecio() {
        return precio;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public boolean available(int capacidad, double budget) {
        return false;
    }

    public abstract String roomService();

}