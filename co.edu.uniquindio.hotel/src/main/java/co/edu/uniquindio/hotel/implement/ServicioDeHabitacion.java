package co.edu.uniquindio.hotel.implement;
import co.edu.uniquindio.hotel.model.Servicio;

public class ServicioDeHabitacion extends Servicio {
    public ServicioDeHabitacion(double precio) {
        super("Servicio de Habitación", precio);
    }

    @Override
    public void consumir() {
        System.out.println("El cliente recibe comida en su habitación.");
    }
}
