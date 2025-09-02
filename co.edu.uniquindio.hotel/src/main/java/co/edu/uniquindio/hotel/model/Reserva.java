package co.edu.uniquindio.hotel.model;
import java.time.LocalDate;

public class Reserva {
    private Habitacion habitacion;
    private Cliente cliente;
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;

    public Reserva(Habitacion habitacion, Cliente cliente, LocalDate entrada, LocalDate salida) {
        this.habitacion = habitacion;
        this.cliente = cliente;
        this.fechaEntrada = entrada;
        this.fechaSalida = salida;
    }

    public Cliente getCliente() {
        return cliente;
    }
}

