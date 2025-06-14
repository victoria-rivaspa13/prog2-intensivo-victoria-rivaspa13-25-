package Intensivo.Herencia;

public class Employee {
    private double sueldo;
    private int legajo;

    public Employee(int legajo, double sueldo) {
        this.legajo = legajo;
        this.sueldo = sueldo;
    }

    public double getSalary() {
        return sueldo;
    }

    public int getLegajo() {
        return legajo;
    }
}

