package Intensivo.Herencia;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

// se inicializan las listas de habitaciones y reservas
public class Hotel {
    private List<Habitacion> habitaciones;
    private List<Reserva> reservas;

    public Hotel() {
        habitaciones = new ArrayList<>();
        reservas = new ArrayList<>();
    }

    public Reserva reservar(Persona persona, int capacidad, double presupuesto, LocalDateTime from, LocalDateTime to) {
        Habitacion habitacion = find(capacidad, presupuesto, from, to).get(0);
        return new Reserva(persona, habitacion, from, to);
    }

    // crea una lista HabitacionesDisponibles donde guardará las habitaciones que cumplen los requisitos
    public List<Habitacion> find(int capacidad, double presupuesto, LocalDateTime from, LocalDateTime to){
        List<Habitacion> HabitacionesDisponibles = new ArrayList<>();
        for (Habitacion habitacion : habitaciones) { // recorre todas las habitaciones.
            if (habitacion.getCapacidad() >= capacidad && habitacion.getPrecio() <= presupuesto) { // verifica que la capacidad de la habitación sea mayor o igual a la requerida, // verifica que el precio sea menor igual al presupuesto
                boolean disponible = true;
                for (Reserva reserva : reservas) { // recorre todas las reservas
                    if (reserva.getHabitacion().equals(habitacion) && (reserva.Ocupado(from)) || reserva.Ocupado(to)) { // si la habitacion ya esta reservada en ese rango de dias, la marca como no disponible
                        disponible = false;
                        break;
                    }
                }
                if (disponible) { // si la habitacion esta libre, se agrega a la lista HabitacionesDisponibles
                    HabitacionesDisponibles.add(habitacion);
                }
            }
        }
        return HabitacionesDisponibles;
    }

    public void agregarHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }
}

