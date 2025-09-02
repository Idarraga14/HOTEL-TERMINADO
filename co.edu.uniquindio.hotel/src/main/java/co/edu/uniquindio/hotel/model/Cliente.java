package co.edu.uniquindio.hotel.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String dni;
    private List<Reserva> reservas = new ArrayList<>();

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void agregarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    // 👉 Agregar estos métodos
    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }
}