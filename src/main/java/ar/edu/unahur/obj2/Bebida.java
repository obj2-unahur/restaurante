package ar.edu.unahur.obj2;

public enum Bebida {

    Agua(10), Vino(100), Jugo(90), Licuado(45);


    private double precio;

    Bebida(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }
}
