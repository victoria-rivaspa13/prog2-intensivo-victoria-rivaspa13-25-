package Intensivo.Herencia;

import java.util.ArrayList;
import java.util.List;

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

class Manager extends Employee {
    private List<Employee> empleados;

    public Manager(int legajo, double sueldo_base, List<Employee> empleados) {
        super(legajo, sueldo_base);
        this.empleados = new ArrayList<>();
    }

    public void añadirEmpleado(Employee empleado) {
        empleados.add(empleado);
    }
    @Override
    public double getSalary(){
        double bonus = 0;
        for (Employee e: empleados){
            bonus += 0.01 * e.getSalary();
        }
        return super.getSalary() + bonus;
    }
}