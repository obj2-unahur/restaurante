package ar.edu.unahur.obj2;

import java.util.Comparator;

public class Gasolero extends Comensal {

    @Override
    protected Bebida elegirBebida(Menu menu) {
        return menu.bebidas()
                .stream()
                .min(Comparator.comparing(Bebida::getPrecio))
                .get();
    }

    @Override
    protected Comida elegirComida(Menu menu) {
        return menu.comidas()
                .stream()
                .min(Comparator.comparing(Comida::getPrecio))
                .get();
    }
}
