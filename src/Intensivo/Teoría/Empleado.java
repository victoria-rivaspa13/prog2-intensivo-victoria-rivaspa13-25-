package Intensivo.Teoría;

// clase madre
class Persona {
    private String nombre;
    private String apellido;
    private String dni;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}

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

// clase hija
class Cliente extends Persona{
    private int num_cliente;
    private int nivel_cliente;

    public int getNum_cliente() {
        return num_cliente;
    }

    public void setNum_cliente(int num_cliente) {
        this.num_cliente = num_cliente;
    }

    public int getNivel_cliente() {
        return nivel_cliente;
    }

    public void setNivel_cliente(int nivel_cliente) {
        this.nivel_cliente = nivel_cliente;
    }

    public double calcular_descuento(int nivel_cliente){
        double descuento = 0;
        if (this.nivel_cliente == 3)
            descuento = 0.30;
        return descuento;
    }
}
