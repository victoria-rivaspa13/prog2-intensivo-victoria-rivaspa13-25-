package Intensivo.Interfaces;

interface Function {
    public double evaluate(double value);
}

class LinealFunction implements Function {
    private double a;
    private double b;

    public LinealFunction(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double evaluate(double value) {
        return a*value + b;
    }
}

class CuadraticFunction implements Function {
    private double a;
    private double b;
    private double c;

    public CuadraticFunction(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double evaluate(double value) {
        return a * value * value + b * value + c;
    }
}

class CompoundFunction implements Function {
    private Function outer;
    private Function inner;

    public CompoundFunction(Function outer, Function inner) {
        this.outer = outer;
        this.inner = inner;
    }

    @Override
    public double evaluate(double value) {
        return outer.evaluate(inner.evaluate(value));
    }
}

