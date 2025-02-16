package Intensivo.Teoría;

public class Transporte {
    private String patente;
    private String color;
    private int cantidad_ruedas;
    private double velocidad_max;

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getCantidad_ruedas() {
        return cantidad_ruedas;
    }

    public void setCantidad_ruedas(int cantidad_ruedas) {
        this.cantidad_ruedas = cantidad_ruedas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVelocidad_max() {
        return (int) velocidad_max;
    }

    public void setVelocidad_max(int velocidad_max) {
        this.velocidad_max = velocidad_max;
    }

    // constructor por defecto
    Transporte() {
        this.patente = "";
        this.color = "";
        this.cantidad_ruedas = 2;
        this.velocidad_max = 100;
    }
    public Transporte(String patente, String color, int cantidad_ruedas, double velocidad_max) {
        this.patente = patente;
        this.color = color;
        this.cantidad_ruedas = cantidad_ruedas;
        this.velocidad_max = velocidad_max;
    }
}

