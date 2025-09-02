package co.edu.uniquindio.hotel.implement;
import co.edu.uniquindio.hotel.model.Servicio;

public class ServicioSpa extends Servicio {
    public ServicioSpa(double precio) {
        super("Spa", precio);
    }

    @Override
    public void consumir() {
        System.out.println("El cliente disfruta de un masaje en el Spa.");
    }
}

