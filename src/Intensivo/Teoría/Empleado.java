package Intensivo.Teoría;

// clase hija
class Empleado extends Persona{
    private String cargo;
    private double salario;
    private String legajo;
    private int antiguedad;


    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    void Calcular_Aumento() {
        if (this.antiguedad > 10)
            this.antiguedad = (int) (this.antiguedad * 1.5);
    }

}

