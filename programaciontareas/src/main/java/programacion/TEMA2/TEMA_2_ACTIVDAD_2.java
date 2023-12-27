/* Realiza un programa en Java que simule la cafetería de una facultad.
El programa pedirá los siguientes datos al usuario:
1. Cantidad de cafés que se van a tomar.
2. Cantidad de tostadas que se van a tomar.
3. Cantidad de zumos de naranja natural que se van a tomar.
El usuario deberá introducir la cantidad de cada uno de estos productos, pudiendo ser 0 si no desea tomar
alguno de ellos.
El programa deberá calcular y mostrar cuánto deberá el pagar el usuario, siendo los precios los siguientes:
1. Precio de 1 café: 1.1€
2. Precio de 1 tostada: 1.5€
3. Precio de 1 zumo de naranja natural: 2€
Para el desarrollo de esta actividad debéis de crear un proyecto en NetBeans y comentarlo de forma que
se pueda entender a la perfección.
No te olvides de declarar un Scanner para cada tipo de datos
*/

package programaciontareas.src.main.java.programacion.TEMA2;

import java.util.Scanner;

public class TEMA_2_ACTIVDAD_2 {

  public static void main(String[] args) {
    // Declaracion de variables
    int cantidadCafes;
    int cantidadTostadas;
    int cantidadZumosNaranja;
    // Variable precio total
    double precioTotal;
    // Variables de precio que son fijas y no van a cambiar
    final double precioCafe = 1.1;
    final double precioTostada = 1.5;
    final int precioZumoNaranja = 2;
    // declaramos scanner para obtener información del usuario
    Scanner sc = new Scanner(System.in);

    // le decimos al usuario lo que queremos:
    System.out.println(
      "Bienvenido a la cafetería de David Morgade, voy a tomar su comanda."
    );
    // Le pedimos el numero de cafes, tostadas, zumos y lo almacenamos en sus respectivas variables
    System.out.println("¿Cuantos cafés va a tomar?");
    cantidadCafes = sc.nextInt();
    System.out.println("¿Cuantas tostadas va a tomar?");
    cantidadTostadas = sc.nextInt();
    System.out.println("¿Cuantos zumos de naranja va a tomar?");
    cantidadZumosNaranja = sc.nextInt();
    sc.close();
    // calculamos el total
    precioTotal =
      (cantidadCafes * precioCafe) +
      (precioTostada * cantidadTostadas) +
      (precioZumoNaranja * cantidadZumosNaranja);
    System.out.println("El precio total de su pedido es de: " + precioTotal);
  }
}
