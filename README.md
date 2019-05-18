# Restaurante

Para el desarrollo de un sistema para la gestion de una nueva cadena de restaurantes se solicita modelar en objetos siguiente problema.
La cadena apunta a atraer a comensales VIP que siempre eligen de un menú el plato más caro y la bebida más cara.
Se desea saber cuanto sería el gasto que debe pagar el comensal según el menú que se elija.

## Menús

Todos los menús ofrecen como bebidas: vino, cerveza, agua y gaseosa.

Con respecto a las comidas, los platos que se puede elegir son:
- Menú Parrilla: Asado, Vacío, Choripan.
- Menú Minutas: Milanesa, Hamburguesa y Papas Fritas.

Los precios son:
- Agua: 10 
- Vino: 100
- Cerveza: 50
- Gaseosa: 40
- Asado: 100
- Vacio: 120
- Choripán: 50
- Milanesa: 80
- Hamburguesa: 60
- Papas Fritas: 30

## Menú Gourmet
Un menú gourmet agrega como bebidas jugo y licuado (sigue ofreciendo también vino, cerveza, agua y gaseosa).
Los platos que ofrece son: Conejo, Ensalada Waldorf y Sushi. 

Los precios son:
- Licuado: 80
- Jugo:	40
- Sushi: 140
- Conejo: 160
- Ensalada Waldorf: 80

Agregar al modelo el menu gourmet.

## Comensales
Ante la crisis que afecta al pais, se decide contemplar otro tipo de comensales, los `Gasolares` .
Este tipo de comensal elije siempre los platos y bebidas más baratas del menú.

Modificar el modelo para que soporte ambos tipos de comensales.

## Propina

Todos los comensales dejan una propina que se calcula como un porcentaje sobre la cuenta: plato + bebida.
Ese porcentaje es configurable para cada comensal, pero un buen valor por defecto es el 20%.
Modificar el cálculo del gasto para que incluya la propina.

## Gasolero Plus

El departamento comercial de la cadena de restaurantes detecto que suelen venir al restaurant un tipo especial de comensal, el `Gasolero plus`.  Es un gasolero que solo deja propina si la cuenta supera los $80. 

Modificar el modelo para que soporte los gasoleros plus.
 
