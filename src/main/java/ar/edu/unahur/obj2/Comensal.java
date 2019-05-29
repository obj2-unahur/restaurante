package ar.edu.unahur.obj2;

public abstract class Comensal {

    public double calcularCosto(Menu menu) {
        double temporal = elegirComida(menu).getPrecio()
                + elegirBebida(menu).getPrecio();
        return  temporal + calcularPropina(temporal);
    }

    protected double calcularPropina(double temporal) {
        return temporal*0.2;
    }

    protected abstract Bebida elegirBebida(Menu menu);

    protected abstract Comida elegirComida(Menu menu);
}
