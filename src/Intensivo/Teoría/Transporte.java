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

class aereo extends Transporte {
    private int altitud_max;

    public aereo(String patente, String color, int cantidad_ruedas, double velocidad_max) {
        super(patente, color, cantidad_ruedas, velocidad_max);
    }

    public int getAltitud_max() {
        return altitud_max;
    }

    public void setAltitud_max(int altitud_max) {
        this.altitud_max = altitud_max;
    }

    public aereo() {
        super();
        this.altitud_max = 100;
    }

    public aereo(String patente, String color, int cantidad_ruedas, double velocidad_max, int altitud_max) {
        super(patente, color, cantidad_ruedas, velocidad_max); //no hace falta poner el tipo de dato porque solo se está llamando al constructor
        this.altitud_max = altitud_max;
    }
}

class terrestre extends Transporte {
    private String tipo_terrestre;

    public terrestre(String patente, String color, int cantidad_ruedas, double velocidad_max) {
        super(patente, color, cantidad_ruedas, velocidad_max);
    }

    public String getTipo() {
        return tipo_terrestre;
    }

    public void setTipo(String tipo) {
        this.tipo_terrestre = tipo;
    }

    public terrestre() {
        this.tipo_terrestre = "4x4";
    }
    public terrestre(String patente, String color, int cantidad_ruedas, double velocidad_max, String tipo_terrestre) {
        super(patente, color, cantidad_ruedas, velocidad_max);
        this.tipo_terrestre = tipo_terrestre;
    }
}

class maritimo extends Transporte {
    private int capacidad_carga;

    public maritimo(String patente, String color, int cantidad_ruedas, double velocidad_max) {
        super(patente, color, cantidad_ruedas, velocidad_max);
    }

    public int getCapacidad_carga() {
        return capacidad_carga;
    }

    public void setCapacidad_carga(int capacidad_carga) {
        this.capacidad_carga = capacidad_carga;
    }

    public maritimo() {
        this.capacidad_carga = 100;
    }

    public maritimo(String patente, String color, int cantidad_ruedas, double velocidad_max, int capacidad_carga) {
        super(patente, color, cantidad_ruedas, velocidad_max);
        this.capacidad_carga = capacidad_carga;
    }

//    Transporte transpor1 = new Transporte();
//    Transporte transpor2 = new Transporte("ABCD", "Azul", 4, 300);
//    aereo Avion1 = new aereo();
//    aereo Avion2 = new aereo("XYZK", "Rojo", 8, 500, 8000);
//    transpor1 = transpor2;
//    Avion1 = transpor1;
//    transpor2 = Avion2;

}