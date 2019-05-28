package ar.edu.unahur.obj2;

public class Bebible extends Consumible {

    private double tamanio;

    public Bebible(String nombre, double precio, double tamanio) {
        super(nombre, precio);
        this.tamanio = tamanio;
    }

    public double getTamanio() {
        return tamanio;
    }
}
