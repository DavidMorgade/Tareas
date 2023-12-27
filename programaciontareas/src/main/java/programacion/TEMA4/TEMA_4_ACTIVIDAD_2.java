/*
 * Desarrolla una aplicación que genere un array de 50 números aleatorios. El programa mostrará al usuario
el siguiente menú hasta que éste pulse la opción ‘Salir’:
Menú
1. Mostrar el array.
2. Mostrar el array en orden inverso.
3. Buscar el número menor.
4. Buscar el número mayor.
5. Comprobar si existe un número en el array.
6. Cambiar el valor de un número.
7. Cambiar dos números de posición.
0. Salir
 */

package programaciontareas.src.main.java.programacion.TEMA4;

import java.util.Scanner;

public class TEMA_4_ACTIVIDAD_2 {

  public static void main(String[] args) {
    // Creamos un scanner que usaremos para los inputs del usuario
    Scanner sc = new Scanner(System.in);
    // Creamos un array aleatorio con nuestro metodo, de 50 numeros
    int[] arrayAleatorio = generarArrayAleatorio(0, 50);
    // Boolean para salir del programa
    boolean salir = false;
    // Comiendza el programa
    while (!salir) {
      // Definimos la opcion del usuario, por defecto -1 ya que 0 chocaría con el input de "salir"
      int opcion = -1;

      // do while donde mostraremos el menu con las diferentres opciones.
      do {
        System.out.println("1. Mostrar el array.");
        System.out.println("2. Mostrar el array en orden inverso.");
        System.out.println("3. Buscar el número menor.");
        System.out.println("4. Buscar el número mayor.");
        System.out.println("5. Comprobar si existe un número en el array.");
        System.out.println("6. Cambiar el valor de un número.");
        System.out.println("7. Cambiar dos números de posición.");
        System.out.println("0. Salir");
        // Con este trycatch nos aseguramos que el input del usuario es un numero entero
        try {
          opcion = sc.nextInt();
        } catch (Exception e) {
          // En caso de error  vuelve a mostrar el menu
          System.out.println("Opción no válida.");
          sc.nextLine();
        }
      } while (opcion < 0 || opcion > 7);
      // Una vez tenemos la opcion usamos switch para evaluar cada caso
      switch (opcion) {
        // salir del programa
        case 0:
          salir = true;
          break;
        // mostrar Array
        case 1:
          mostrarArray(arrayAleatorio);
          break;
        // mostrar Array inverso
        case 2:
          mostrarArrayInverso(arrayAleatorio);
          break;
        // Buscar el numero menor
        case 3:
          System.out.println(
            "El número menor es: " + buscarNumeroMenor(arrayAleatorio)
          );
          break;
        // Busca el numero mayor
        case 4:
          System.out.println(
            "El número mayor es: " + buscarNumeroMayor(arrayAleatorio)
          );
          break;
        // Busca el numero dentro del Array
        case 5:
          System.out.println("Introduce un número: ");
          int numero = sc.nextInt();
          if (buscarNumero(arrayAleatorio, numero)) {
            System.out.println("El número " + numero + " está en el array.");
          } else {
            System.out.println("El número " + numero + " no está en el array.");
          }
          break;
        // Cambia el numero que elijamos dentro del array
        case 6:
          System.out.println(
            "Introduce el número que quieres cambiar en el array: "
          );
          int numero1 = sc.nextInt();
          System.out.println("Introduce un número: ");
          int numero2 = sc.nextInt();
          // Si se encuentra el numero del array
          if (buscarNumero(arrayAleatorio, numero1)) {
            for (int i = 0; i < arrayAleatorio.length; i++) {
              // Aqui una vez encontramos el numero en el array, le asignamos el valor que hemos introducido
              if (arrayAleatorio[i] == numero1) {
                arrayAleatorio[i] = numero2;
              }
            }
            // En caso de que no se encuentre, ira a este else directamente y mostrará el mensaje por pantalla
          } else {
            System.out.println(
              "El número " + numero1 + " no está en el array."
            );
          }
          break;
        // cambiamos 2 numeros entre si que existan en el array
        case 7:
          System.out.println(
            "Introduce el primer número que quieres cambiar de posición en el array: "
          );
          int numero3 = sc.nextInt();
          System.out.println(
            "Introduce el segundo número que quieres cambiar de posición en el array: "
          );
          int numero4 = sc.nextInt();
          // Si ambos existen se cumple la condición
          if (
            buscarNumero(arrayAleatorio, numero3) &&
            buscarNumero(arrayAleatorio, numero4)
          ) {
            // Recorremos el array, y hacemos el swap de los numeros
            for (int i = 0; i < arrayAleatorio.length; i++) {
              if (arrayAleatorio[i] == numero3) {
                arrayAleatorio[i] = numero4;
              }
              if (arrayAleatorio[i] == numero4) {
                arrayAleatorio[i] = numero3;
              }
            }
          } else {
            System.out.println(
              "Alguno de los dos numeros no está en el array."
            );
          }
          break;
        // No es valida la opcion
        default:
          System.out.println("Opción no válida.");
      }
    }
  }

  // Método encargado de mostrar el array
  public static void mostrarArray(int[] array) {
    // Un Loop normal que se encarga de recorrer el array desde 0 hasta el final (array.length)
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }
  }

  // Método encargado de mostrar el array al reves
  public static void mostrarArrayInverso(int[] array) {
    // Loop inverso que recorre el array desde la última posicion hasta la posicion 0
    for (int i = array.length - 1; i >= 0; i--) {
      System.out.println(array[i]);
    }
  }

  // Método encargado de buscar el numero más pequeño dentro del array
  public static int buscarNumeroMenor(int[] array) {
    // Tomamos de referencia el primer valor del array (0)
    int menor = array[0];
    // Comenzamos el bucle desde la posicion 1 (segundo valor) ya que hemos seleccionado el menor como la posicion 0, no tenemos que empezar por el mismo
    for (int i = 1; i < array.length; i++) {
      // Si el array en la posicion de i es menor que menor, significa que este será el nuevo menor
      if (array[i] < menor) {
        menor = array[i];
      }
    }
    // Devolvemos el menor
    return menor;
  }

  // Método encargado de buscar el numero mayor en el array
  public static int buscarNumeroMayor(int[] array) {
    // Tomamos de referencia el primer valor como mayor
    int mayor = array[0];
    // Recorremos el array desde la posicion 1
    for (int i = 1; i < array.length; i++) {
      // Si el valor del array en la posicion de i es mayor que "mayor" asignamos este valor a mayor
      if (array[i] > mayor) {
        mayor = array[i];
      }
    }
    // Devolvemos el numero mayor
    return mayor;
  }

  // Método encargado de buscar un numero dentro del array
  public static boolean buscarNumero(int[] array, int numero) {
    for (int i = 0; i < array.length; i++) {
      // Si el array en la posición de i es igual que el número que pasamos por parametro devolvemos true
      if (array[i] == numero) {
        return true;
      }
    }
    // Si no se encuentra devuelvo false
    return false;
  }

  // Método para generar un numero aleatorio
  public static int generarNumeroAleatorio(int min, int max) {
    return (int) (Math.random() * (max - min + 1) + min);
  }

  // Método para generar un Array Aleatorio de 50 valores
  public static int[] generarArrayAleatorio(int min, int max) {
    // Declaramos el array con 50 posiciones
    int[] array = new int[50];
    // Recorremos el array
    for (int i = 0; i < array.length; i++) {
      // En cada hueco del enlace le asignamos un numero aleatorio de nuestro método generarNumeroAleatorio
      array[i] = generarNumeroAleatorio(min, max);
    }
    // Devolvemos el array
    return array;
  }
}
