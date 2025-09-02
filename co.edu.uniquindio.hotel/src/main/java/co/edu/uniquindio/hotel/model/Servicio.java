package co.edu.uniquindio.hotel.model;
import co.edu.uniquindio.hotel.service.Consumible;

public abstract class Servicio implements Consumible {
    private String nombre;
    private double precio;

    public Servicio(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }

    @Override
    public abstract void consumir(); // Polimorfismo
}
