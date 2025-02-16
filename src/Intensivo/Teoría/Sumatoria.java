package Intensivo.Teoría;

class Sumatoria {
    public static int sumatoria(int n) {
        if (n < 1) {
            return 0;
        }
        return n + sumatoria(n - 1);
    }
}
