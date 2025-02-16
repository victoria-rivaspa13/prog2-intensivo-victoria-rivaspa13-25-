package Intensivo.Teoría;

public class Areas {
    abstract class Figura {
        protected double base;
        protected double altura;

        public Figura(double base, double altura) {
            this.base = base;
            this.altura = altura;
        }

        abstract double calcularArea();
    }

    class Rectangulo extends Figura {
        public Rectangulo(double base, double altura) {
            super(base, altura);
        }

        @Override
        public double calcularArea() {
            return base * altura;
        }
    }

    class Triangulo extends Figura {
        public Triangulo(double base, double altura) {
            super(base, altura);
        }

        @Override
        public double calcularArea() {
            return (base * altura) / 2;
        }
    }}
