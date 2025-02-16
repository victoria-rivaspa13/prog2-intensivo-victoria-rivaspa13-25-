package Intensivo;

class Arbol {
    private final String especie;
    private final double altura;

    public Arbol(String especie, double altura) {
        this.especie = especie;
        this.altura = altura;
    }

    public String obtenerEspecie() {
        return especie;
    }

    public double obtenerAltura() {
        return altura;
    }
}

class Coche {
    private final String marca;
    private final String modelo;
    private final int año;

    public Coche(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public String obtenerMarca() {
        return marca;
    }

    public String obtenerModelo() {
        return modelo;
    }

    public int obtenerAño() {
        return año;
    }
}

class Avion {
    private static final double VELOCIDAD_POR_DEFECTO = 300;  // Velocidad máxima por defecto
    private static final int ASIENTOS_POR_DEFECTO = 1;

    private final double velocidadMaxima;
    private final int asientos;
    private final String marca;

    public Avion() {
        this.velocidadMaxima = VELOCIDAD_POR_DEFECTO;
        this.asientos = ASIENTOS_POR_DEFECTO;
        this.marca = "MarcaPorDefecto";
    }

    public Avion(double velocidadMaxima, int asientos, String marca) {
        this.velocidadMaxima = velocidadMaxima;
        this.asientos = asientos;
        this.marca = marca;
    }

    public double obtenerVelocidadMaxima() {
        return velocidadMaxima;
    }

    public int obtenerAsientos() {
        return asientos;
    }

    public String obtenerMarca() {
        return marca;
    }
}

class figuras {
    float medida1;
    float medida2;

    float area(float medida1, float medida2){
        this.medida1 = medida1;
        this.medida2 = medida2;
        return medida1 * medida2;
    }
    float area (float medida1, float medida2, String triangulo){
        this.medida1 = medida1;
        this.medida2 = medida2;
        return medida1 * medida2 / 2;
    }
    figuras triangulo = new figuras();
    figuras rectangulo = new figuras();
}


class Interval {
    private int start;
    private int end;
    private int step;

    Interval(int start, int end, int step) {
        this.start = start;
        this.end = end;
        this.step = step;
    }

    public int first() {
        return start;
    }

    public int last() {
        return start + (size() - 1) * step;
    }

    public int at(int i) {
        return start + i * step;
    }

    public int size() {
        return (end - start) / step;
    }
}

