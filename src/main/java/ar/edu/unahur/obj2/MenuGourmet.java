package ar.edu.unahur.obj2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MenuGourmet extends Menu {

    private List<Comida> comidasDelMenu = Stream.of(Comida.Sushi, Comida.Conejo)
            .collect(Collectors.toList());

    @Override
    public List<Comida> comidas() {
        return comidasDelMenu;
    }

    @Override
    public List<Bebida> bebidas() {
        List<Bebida> bebidas = new ArrayList<>();
        bebidas.addAll(super.bebidas());
        bebidas.add(Bebida.Licuado);
        bebidas.add(Bebida.Jugo);

        return bebidas;
    }
}
