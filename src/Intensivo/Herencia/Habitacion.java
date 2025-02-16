package Intensivo.Herencia;


public class Habitacion {
    protected double precio;
    protected int capacidad;

    // inicializa precio y capacidad
    public Habitacion(double precio, int capacidad) {
        this.precio = precio;
        this.capacidad = capacidad;
    }

    // metodos getter para obtener precio y capacidad
    public double getPrecio() {
        return precio;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public boolean available(int capacidad, double budget) {
        return false;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            Habitacion that = (Habitacion) object;
            return precio == that.precio && capacidad == that.capacidad;
        }
        return false;


    }



    // estandar: cuesta 200 y tiene capacidad para 4 personas
public class Estandar extends Habitacion {
    public Estandar() {
        super(200, 4);
    }
}

// suite: cuesta 300 y tiene capacidad para 2 personas
public class Suite extends Habitacion {
    public Suite() {
        super(300, 2);
    }
}

// presidencial: cuesta 600 y tiene capacidad para 2 personas
public class Presidencial extends Habitacion {
    public Presidencial() {
        super(600, 2);
    }
}

}