package Intensivo.Herencia;

import java.util.List;

class Seminario extends Curso {
    private String temaEspecifico;

    public Seminario(String nombre, Profesor profesor, List<Alumno> alumnos, String temaEspecifico) {
        super(nombre, profesor, alumnos);
        this.temaEspecifico = temaEspecifico;
    }
}
