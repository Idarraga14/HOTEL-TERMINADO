package co.edu.uniquindio.hotel.Builder;

import co.edu.uniquindio.hotel.model.*;

import java.time.LocalDate;

public class ReservaBuilder {
    private Habitacion habitacion;
    private Cliente cliente;
    private LocalDate entrada;
    private LocalDate salida;

    public ReservaBuilder setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
        return this;
    }

    public ReservaBuilder setCliente(Cliente cliente) {
        this.cliente = cliente;
        return this;
    }

    public ReservaBuilder setFechas(LocalDate entrada, LocalDate salida) {
        this.entrada = entrada;
        this.salida = salida;
        return this;
    }

    public Reserva build() {
        return new Reserva(habitacion, cliente, entrada, salida);
    }
}
