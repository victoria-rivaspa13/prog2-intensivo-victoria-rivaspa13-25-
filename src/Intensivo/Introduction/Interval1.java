package Intensivo.Introduction;

import Intensivo.Interfaces.Criteria;

import java.util.ArrayList;

public class Interval1 {
    private int start;
    private int end;
    private int step;

    // constructor: inicializa los valores
    public Interval1(int start, int end, int step) {
        this.start = start;
        this.end = end;
        this.step = step;
    }

    // retorna el primer valor del intervalo
    public int first() {
        return start;
    }

    // calcula el último número válido del intervalo
    public int last() {
        return start + (size() - 1) * step;
    }

    // retorna el elemento en la posición i del intervalo
    // se calcula sumando i * step a start
    public int at(int i) {
        return start + i * step;
    }

    // calcula cuantos numeros hay en el intervalo
    // considera que end podria ser parte del intervalo si end-start es divisible por step
    public int size() {
        return ((end - start) / step) + 1;
    }

    // busca el primer número en el intervalo que cumpla con un criteria
    public double findFirst(Criteria evaluator) {
        // recorre los numeros del intervalo sumando step
        for (double i = start; i <= end; i += step) {
            // si encuentra un numero que cumpla con la condicion lo retorna
            if (evaluator.evaluate(i)) {
                return i;
            }
        }
        return -1;
    }

    // busca todos los numeros que cumplen con un criteria
    public ArrayList<Double> findAll(Criteria evaluator) {
        ArrayList<Double> results = new ArrayList<>();
        // recorre el intervalo sumando step
        for (double i = start; i <= end; i += step) {
            // si evaluator.evaluate(i) es true agrega i a la lista
            if (evaluator.evaluate(i)) {
                results.add(i);
            }
        }
        return results;
    }}

