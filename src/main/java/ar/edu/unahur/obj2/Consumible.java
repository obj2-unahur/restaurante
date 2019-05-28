package ar.edu.unahur.obj2;

public class Consumible {

    private String nombre;
    private double precio;

    public Consumible(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}
