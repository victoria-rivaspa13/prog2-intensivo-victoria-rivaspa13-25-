package Intensivo.Herencia;

class Alumno extends Persona {
    private String legajo;

    public Alumno(String dni, String nombre, String legajo) {
        super(dni, nombre);
        this.legajo = legajo;
    }

    public String getLegajo() {
        return legajo;
    }
}
