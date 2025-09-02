package co.edu.uniquindio.hotel.implement;
import co.edu.uniquindio.hotel.model.Servicio;

public class ServicioRestaurante extends Servicio {
    public ServicioRestaurante(double precio) {
        super("Restaurante", precio);
    }

    @Override
    public void consumir() {
        System.out.println("El cliente disfruta de la comida en el Restaurante.");
    }
}
