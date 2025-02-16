package Intensivo.Herencia;

import org.junit.Test;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.Assert.*;

public class HotelTest {

    @Test
    public void testReservaExitosa() {
        Hotel hotel = new Hotel();
        Persona persona = new Persona("Victoria", "Rivas Patrese");
        Habitacion habitacion = new Habitacion(1000, 2);
        hotel.agregarHabitacion(habitacion);

        LocalDateTime from = LocalDateTime.of(2025, 2, 16, 14, 0);
        LocalDateTime to = LocalDateTime.of(2025, 2, 18, 12, 0);

        Reserva reserva = hotel.reservar(persona, 2, 1500, from, to);

        assertNotNull(reserva);
        assertEquals(persona, reserva.getCliente());
        assertEquals(habitacion, reserva.getHabitacion());
    }

    @Test
    public void testFindMultipleHabitacionesDisponibles() {
        Hotel hotel = new Hotel();
        Habitacion habitacion1 = new Habitacion( 100.0, 2);
        Habitacion habitacion2 = new Habitacion( 200.0, 3);
        Habitacion habitacion3 = new Habitacion( 150.0, 2);
        hotel.agregarHabitacion(habitacion1);
        hotel.agregarHabitacion(habitacion2);
        hotel.agregarHabitacion(habitacion3);

        LocalDateTime from = LocalDateTime.of(2025, 5, 1, 14, 0);
        LocalDateTime to = LocalDateTime.of(2025, 5, 5, 12, 0);

        List<Habitacion> disponibles = hotel.find(2, 150.0, from, to);

        assertEquals(2, disponibles.size()); // debería haber 2 habitaciones disponibles
        assertTrue(disponibles.contains(habitacion1)); // la habitación 1 debe estar disponible
        assertTrue(disponibles.contains(habitacion3)); // La habitación 3 debe estar disponible
    }

}

