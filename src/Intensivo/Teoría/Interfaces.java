package Intensivo.Teoría;

class Interfaces {
}
interface rotacion extends area, perimetro{
    public abstract void rotar();
}
interface area {
    public double calc_area();
}
interface perimetro {
    public double calc_perimetro();
}

class triangulo implements area, perimetro {
    private double base;
    private double altura;
    public double calc_area(){
        return base*altura / 2;
    }
    public double calc_perimetro(){
        return base * 3;
    }
}

class rectangulo implements area, perimetro {
    private double lado1;
    private double lado2;
    public double calc_area(){
        return lado1*lado2;
    }
    public double calc_perimetro(){
        return 2 * lado1 + 2 * lado2;
    }
}

class circulo implements rotacion {
    private double radio;
    public double calc_area(){
        return Math.PI * radio * radio;
    }
    public double calc_perimetro(){
        return 2 * Math.PI * radio;
    }

    public void rotar() {

    }
}



