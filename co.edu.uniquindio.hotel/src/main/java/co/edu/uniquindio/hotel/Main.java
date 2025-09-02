package co.edu.uniquindio.hotel;

import co.edu.uniquindio.hotel.Builder.ReservaBuilder;
import co.edu.uniquindio.hotel.factory.HotelFactory;
import co.edu.uniquindio.hotel.implement.ServicioRestaurante;
import co.edu.uniquindio.hotel.model.*;

import javax.swing.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        HotelFactory hotelFactory = HotelFactory.getInstance();

        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "=== MENÚ PRINCIPAL ===\n" +
                            "1. Hacer reserva\n" +
                            "2. Pedir comida del Restaurante\n" +
                            "3. Cancelar reserva\n" +
                            "0. Salir\n"
            ));

            switch (opcion) {
                case 1:
                    //  Datos de la reserva
                    String nombreCliente = JOptionPane.showInputDialog("Ingrese el nombre del cliente:");
                    String dni = JOptionPane.showInputDialog("Ingrese el DNI del cliente:");
                    Cliente cliente = new Cliente(nombreCliente, dni);

                    int numeroHabitacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese número de habitación:"));
                    String tipo = JOptionPane.showInputDialog("Ingrese tipo de habitación (Simple/Doble/Suite):");


                    Habitacion habitacion = new Habitacion(numeroHabitacion, tipo);

                    LocalDate entrada = LocalDate.parse(JOptionPane.showInputDialog("Ingrese fecha de entrada (YYYY-MM-DD):"));
                    LocalDate salida = LocalDate.parse(JOptionPane.showInputDialog("Ingrese fecha de salida (YYYY-MM-DD):"));

                    Reserva reserva = new ReservaBuilder()
                            .setCliente(cliente)
                            .setHabitacion(habitacion)
                            .setFechas(entrada, salida)
                            .build();

                    hotelFactory.agregarReserva(reserva);
                    JOptionPane.showMessageDialog(null, "Reserva creada con éxito");
                    break;

                case 2:
                    //  Pedir comida
                    ServicioRestaurante restaurante = new ServicioRestaurante(30.0);
                    restaurante.consumir();
                    JOptionPane.showMessageDialog(null, " Pedido del restaurante realizado.");
                    break;

                case 3:
                    //  Cancelar reserva
                    if (hotelFactory.getReservas().isEmpty()) {
                        JOptionPane.showMessageDialog(null, " No hay reservas para cancelar.");
                    } else {
                        int index = Integer.parseInt(JOptionPane.showInputDialog(
                                "Ingrese el número de reserva a cancelar (0 a " + (hotelFactory.getReservas().size() - 1) + "):"
                        ));
                        if (index >= 0 && index < hotelFactory.getReservas().size()) {
                            hotelFactory.getReservas().remove(index);
                            JOptionPane.showMessageDialog(null, "reserva cancelada con éxito.");
                        }else {
                            JOptionPane.showMessageDialog(null, " Numero de reserva invalido.");
                        }
                    }
                    break;

                case 0:
                    JOptionPane.showMessageDialog(null, " Saliendo del sistema...");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, " Opción no válida.");
                    break;
            }

        } while (opcion != 0);
    }
}