package ar.edu.unahur.obj2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public abstract class Menu {

    private List<Bebida> bebidasBasicas = Stream.of(Bebida.Agua, Bebida.Vino).collect(Collectors.toList());


    public List<Bebida> bebidas() {
        /*
        List<Bebida> bebidas = new ArrayList<>();
        bebidas.add(Bebida.Agua);
        bebidas.add(Bebida.Vino);
        return bebidas;
        */

        return bebidasBasicas;
    }

    public abstract List<Comida> comidas();
}
