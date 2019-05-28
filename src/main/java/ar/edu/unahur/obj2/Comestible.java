package ar.edu.unahur.obj2;

public class Comestible extends Consumible {

    private boolean vegetariano;

    public Comestible(String nombre, double precio, boolean vegetariano) {
        super(nombre, precio);
        this.vegetariano = vegetariano;
    }

    public boolean isVegetariano() {
        return vegetariano;
    }
}
