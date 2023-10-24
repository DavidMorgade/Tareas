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

import java.util.Scanner;

public class TEMA_4_ACTIVIDAD_2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arrayAleatorio = generarArrayAleatorio(0, 50);
    mostrarArray(arrayAleatorio);
    int opcion;
    boolean salir = false;
    while (!salir) {
      System.out.println("Menú");
      System.out.println("1. Mostrar el array.");
      System.out.println("2. Mostrar el array en orden inverso.");
      System.out.println("3. Buscar el número menor.");
      System.out.println("4. Buscar el número mayor.");
      System.out.println("5. Comprobar si existe un número en el array.");
      System.out.println("6. Cambiar el valor de un número.");
      System.out.println("7. Cambiar dos números de posición.");
      System.out.println("0. Salir");
      try {
        opcion = sc.nextInt();
      } catch (Exception e) {
        System.out.println("Introduce un número.");
        opcion = sc.nextInt();
      }
      switch (opcion) {
        case 0:
          salir = true;
          break;
        case 1:
          mostrarArray(arrayAleatorio);
          break;
        case 2:
          mostrarArrayInverso(arrayAleatorio);
          break;
        case 3:
          System.out.println(
            "El número menor es: " + buscarNumeroMenor(arrayAleatorio)
          );
        case 4:
          System.out.println(
            "El número mayor es: " + buscarNumeroMayor(arrayAleatorio)
          );
          break;
        case 5:
          System.out.println("Introduce un número: ");
          int numero = sc.nextInt();
          if (buscarNumero(arrayAleatorio, numero)) {
            System.out.println("El número " + numero + " está en el array.");
          } else {
            System.out.println("El número " + numero + " no está en el array.");
          }
          break;
        case 6:
          System.out.println(
            "Introduce el número que quieres cambiar en el array: "
          );
          int numero1 = sc.nextInt();
          System.out.println("Introduce un número: ");
          int numero2 = sc.nextInt();
          if (buscarNumero(arrayAleatorio, numero1)) {
            for (int i = 0; i < arrayAleatorio.length; i++) {
              if (arrayAleatorio[i] == numero1) {
                arrayAleatorio[i] = numero2;
              }
            }
          } else {
            System.out.println(
              "El número " + numero1 + " no está en el array."
            );
          }
          break;
        case 7:
          System.out.println(
            "Introduce el primer número que quieres cambiar de posición en el array: "
          );
          int numero3 = sc.nextInt();
          System.out.println(
            "Introduce el segundo número que quieres cambiar de posición en el array: "
          );
          int numero4 = sc.nextInt();
          if (
            buscarNumero(arrayAleatorio, numero3) &&
            buscarNumero(arrayAleatorio, numero4)
          ) {
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
        default:
          System.out.println("Opción no válida.");
      }
    }
  }

  public static void mostrarArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }
  }

  public static void mostrarArrayInverso(int[] array) {
    for (int i = array.length - 1; i >= 0; i--) {
      System.out.println(array[i]);
    }
  }

  public static int buscarNumeroMenor(int[] array) {
    int menor = array[0];
    for (int i = 1; i < array.length; i++) {
      if (array[i] < menor) {
        menor = array[i];
      }
    }
    return menor;
  }

  public static int buscarNumeroMayor(int[] array) {
    int mayor = array[0];
    for (int i = 1; i < array.length; i++) {
      if (array[i] > mayor) {
        mayor = array[i];
      }
    }
    return mayor;
  }

  public static boolean buscarNumero(int[] array, int numero) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] == numero) {
        return true;
      }
    }
    return false;
  }

  public static int generarNumeroAleatorio(int min, int max) {
    return (int) (Math.random() * (max - min + 1) + min);
  }

  public static int[] generarArrayAleatorio(int min, int max) {
    int[] array = new int[50];
    for (int i = 0; i < array.length; i++) {
      array[i] = generarNumeroAleatorio(min, max);
    }
    return array;
  }
}
