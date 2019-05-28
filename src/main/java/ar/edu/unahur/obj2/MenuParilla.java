package ar.edu.unahur.obj2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MenuParilla extends Menu {

    private List<Comida> comidasDelMenu = Stream.of(Comida.Asado, Comida.Choripan).collect(Collectors.toList());

    @Override
    public List<Comida> comidas() {
        return comidasDelMenu;
    }
}
