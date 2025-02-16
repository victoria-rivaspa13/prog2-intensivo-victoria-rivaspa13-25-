package Intensivo.Herencia;

import java.util.ArrayList;
import java.util.List;

class Curso {
    private String nombre;
    private Profesor profesor;
    private List<Alumno> alumnos;

    public Curso(String nombre, Profesor profesor, List<Alumno> alumnos) {
        this.nombre = nombre;
        this.profesor = profesor;
        this.alumnos = new ArrayList<>();
    }

    public void InscribirAlumno(Alumno alumno) {
        this.alumnos.add(alumno);
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }
}
