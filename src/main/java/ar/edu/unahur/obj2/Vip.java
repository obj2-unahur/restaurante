package ar.edu.unahur.obj2;

import java.util.Comparator;

public class Vip extends Comensal {

    @Override
    protected Bebida elegirBebida(Menu menu) {
        return menu.bebidas()
                .stream()
                .max(Comparator.comparing(Bebida::getPrecio))
                .get();
    }

    @Override
    protected Comida elegirComida(Menu menu) {
        return menu.comidas()
                .stream()
                .max(Comparator.comparing(Comida::getPrecio))
                .get();
    }
}
