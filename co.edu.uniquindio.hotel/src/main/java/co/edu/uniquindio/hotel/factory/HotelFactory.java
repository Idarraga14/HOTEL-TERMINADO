package co.edu.uniquindio.hotel.factory;

import java.util.ArrayList;
import java.util.List;
import co.edu.uniquindio.hotel.model.Reserva;

public class HotelFactory {
    private static HotelFactory instance;
    private List<Reserva> reservas = new ArrayList<>();

    private HotelFactory() {}

    public static HotelFactory getInstance() {
        if (instance == null) {
            instance = new HotelFactory();
        }
        return instance;
    }

    public void agregarReserva(Reserva reserva) {
        reservas.add(reserva);
        System.out.println("Reserva agregada exitosamente.");
    }

    public List<Reserva> getReservas() {
        return reservas;
    }
}
