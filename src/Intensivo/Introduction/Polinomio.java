package Intensivo.Introduction;

class Polinomio {
    private double[] coeficientes; // Arreglo para almacenar los coeficientes del polinomio

    // Constructor que inicializa el polinomio con un grado N
    public Polinomio(int grado) {
        coeficientes = new double[grado + 1]; // Se crean N+1 coeficientes (0..N)
    }

    public void setCoef(int exponente, double coeficiente) {
        if (exponente >= 0 && exponente < coeficientes.length) {
            coeficientes[exponente] = coeficiente;
        }
    }

    public double evaluar(double x) {
        double resultado = 0;
        for (int i = 0; i < coeficientes.length; i++) {
            resultado += coeficientes[i] * Math.pow(x, i);
        }
        return resultado;
    }

    public Polinomio derivar() {
        int gradoNuevo = coeficientes.length - 2; // El grado del polinomio derivado es N-1
        Polinomio derivado = new Polinomio(gradoNuevo + 1);

        for (int i = 1; i < coeficientes.length; i++) {
            derivado.setCoef(i - 1, coeficientes[i] * i);
        }

        return derivado;
    }
}
