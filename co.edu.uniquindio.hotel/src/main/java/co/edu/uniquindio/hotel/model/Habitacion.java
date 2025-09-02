package co.edu.uniquindio.hotel.model;

public class Habitacion {
    private int numero;
    private String tipo;
    private double precio;

    public Habitacion(int numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
        this.precio = asignarPrecio(tipo); // Se asigna automáticamente
    }

    private double asignarPrecio(String tipo) {
        switch (tipo.toLowerCase()) {
            case "simple": return 100.0;
            case "doble": return 150.0;
            case "suite": return 250.0;
            default: return 120.0; // precio por defecto si no coincide
        }
    }

    public int getNumero() { return numero; }
    public String getTipo() { return tipo; }
    public double getPrecio() { return precio; }

    @Override
    public String toString() {
        return "Habitación " + numero + " (" + tipo + ") - Precio: $" + precio;
    }
}
