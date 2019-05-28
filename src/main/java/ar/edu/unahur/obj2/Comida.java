package ar.edu.unahur.obj2;

public enum Comida {

    Asado(100), Vacio(120), Choripan(50),
    Milanesa(130), Tortilla(40), Conejo(1000), Sushi(1300);

    private double precio;

    Comida(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }
}
