package Intensivo.Herencia;

class Empleado extends Persona {
    private double salario;

    public double getSalario() {
        return salario;
    }

    public Empleado(String dni, String nombre, double salario) {
        super(dni, nombre);
        this.salario = salario;
    }
}
