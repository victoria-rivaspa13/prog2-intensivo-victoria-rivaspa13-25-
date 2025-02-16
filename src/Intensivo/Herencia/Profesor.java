package Intensivo.Herencia;

class Profesor extends Empleado {
    private String departamento;

    public Profesor(String dni, String nombre, double salario, String departamento) {
        super(dni, nombre, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }
}
