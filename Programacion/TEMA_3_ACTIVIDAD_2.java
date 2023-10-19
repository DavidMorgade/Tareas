/*
 * La Unión Europea ha decidido premiar al país que más toneladas de hortalizas exporte a lo largo del año.
Se dispone de un registro de transacciones comerciales en el que aparecen tres valores en cada apunte.
El primer valor es el indicativo del país (E: España, F: Francia y A: Alemania), el segundo valor es un indicativo
de la hortaliza que se ha vendido en una transacción (T: Tomate, P: Patata, E: Espinaca) y el tercer valor
indica las toneladas que se han vendido en esa transacción. Diseñar un programa que lea desde el teclado
este registro, el cual termina siempre al leer un país con indicativo ’@’, y que diga qué país es el que más
hortalizas exporta y las toneladas que exporta
 */

import java.util.Scanner;

public class TEMA_3_ACTIVIDAD_2 {

  public static void main(String[] args) {
    char pais = ' ', hortaliza = ' ';
    int toneladas = 0, toneladasEspana = 0, toneladasFrancia =
      0, toneladasAlemania = 0;
    // Scanner para que el usuario pueda introducir datos
    Scanner sc = new Scanner(System.in);
    // boolean para salir del programa
    boolean salir = false;
    // Bucle que mantendra el programa en ejecucion hasta que el usuario introduzca @
    while (!salir) {
      // Bucle para que el usuario introduzca el pais
      do {
        // Try catch para que el usuario introduzca un numero entero
        try {
          // Mostramos el mensaje de bienvenida y las instrucciones del programa
          System.out.println(
            "Bienvenido al programa de toneladas de hortalizas exportadas por cada pais, sigue las instrucciones del programa."
          );
          System.out.println(
            "Introduce el pais: \n @ - Salir del programa \n E - España \n F - Francia \n A - Alemania"
          );
          // Guardamos el dato introducido por el usuario
          pais = sc.next().charAt(0);
          // Si el usuario introduce @, se mostrara el pais ganador y se saldra del programa
          if (pais == '@') {
            // metodo para mostrar el pais ganador y las toneladas
            if (
              toneladasEspana == 0 &&
              toneladasFrancia == 0 &&
              toneladasAlemania == 0
            ) {
              System.out.println("No se ha introducido ningun dato.");
              System.out.println("Saliendo del programa...");
              return;
            }
            mostrarPaisGanador(
              toneladasEspana,
              toneladasFrancia,
              toneladasAlemania
            );
            System.out.println("Saliendo del programa...");
            salir = true;
            return;
          }
        } catch (Exception e) { // Si el usuario no introduce un numero entero, se le mostrara un mensaje de error
          System.out.println("Error: Debes ingresar un numero entero.");
          pais = ' ';
          // Para que el usuario pueda introducir otro dato
          sc.nextLine();
        }
      } while (pais != 'E' && pais != 'F' && pais != 'A');
      // Bucle para que el usuario introduzca la hortaliza
      do {
        // Try catch para que el usuario introduzca la opcion correcta
        try {
          System.out.println(
            "Introduce la hortaliza: \n  T - Tomate \n P - Patata \n E - Espinaca"
          );
          hortaliza = sc.next().charAt(0);
        } catch (Exception e) {
          // Si el usuario no introduce la opcion correcta, se le mostrara un mensaje de error
          System.out.println("Error: Debes ingresar la opcion correcta.");
          hortaliza = ' ';
          // Para que el usuario pueda introducir otro dato
          sc.nextLine();
        }
      } while (hortaliza != 'T' && hortaliza != 'P' && hortaliza != 'E');
      // Bucle para que el usuario introduzca las toneladas
      do {
        // Try catch para que el usuario introduzca un numero entero
        try {
          System.out.println("Introduce las toneladas: ");
          toneladas = sc.nextInt();
          if (toneladas <= 0) {
            System.out.println(
              "Error: Debes ingresar un numero entero positivo."
            );
          } else {
            // Si el usuario introduce un numero entero positivo, se guardara en la variable correspondiente
            switch (pais) {
              case 'E':
                toneladasEspana += toneladas;
                break;
              case 'F':
                toneladasFrancia += toneladas;
                break;
              case 'A':
                toneladasAlemania += toneladas;
                break;
            }
          }
        } catch (Exception e) {
          // Si el usuario no introduce un numero entero, se le mostrara un mensaje de error
          System.out.println("Error: Debes ingresar un numero entero.");
          toneladas = 0;
          // Para que el usuario pueda introducir otro dato
          sc.nextLine();
        }
      } while (toneladas <= 0);
    }
  }

  public static void mostrarPaisGanador(
    int toneladasEspana,
    int toneladasFrancia,
    int toneladasAlemania
  ) {
    // Variable para guardar el resultado del pais
    String paisResultado = toneladasEspana > toneladasFrancia
      ? "España"
      : toneladasFrancia > toneladasAlemania
        ? "Francia"
        : toneladasAlemania > toneladasEspana ? "Alemania" : "Empate!";
    // Variable para guardar el resultado de las toneladas
    int toneladasMax = toneladasEspana > toneladasFrancia
      ? toneladasEspana
      : toneladasFrancia > toneladasAlemania
        ? toneladasFrancia
        : toneladasAlemania;
    // Mostramos los resultados
    System.out.println(
      "El pais que mas vende es: " +
      paisResultado +
      " con un total de " +
      toneladasMax +
      " toneladas."
    );
  }
}
