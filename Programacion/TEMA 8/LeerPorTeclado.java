// Crea la clase llamada LeerPorTeclado. Esta clase no contendrá atributos e implementará los siguientes
// métodos estáticos:
//  leerString: Este método pedirá por teclado un String. Este método recibirá como parámetro un String
// que será el mensaje donde se pida que se introduzca un String y devolverá dicho String.
//  leerChar: Este método pedirá por teclado un char. Este método recibirá como parámetro un String
// que será el mensaje donde se pida que se introduzca un char y devolverá dicho char.
//  leerInt: Este método pedirá por teclado un int. Este método recibirá como parámetro un String que
// será el mensaje donde se pida que se introduzca un int y devolverá dicho int.
//  leerDouble: Este método pedirá por teclado un double. Este método recibirá como parámetro un
// String donde se pida que se introduzca un double y devolverá dicho double.
//  leerBoolean: Este método pedirá por teclado un boolean. Este método recibirá como parámetro un
// String que será el mensaje donde se pida que se introduzca un boolean y devolverá dicho boolean.
// Desarrolla una aplicación que muestre al usuario el siguiente menú hasta que se pulse la opción salir. Para
// cada una de las opciones el programa leerá el tipo de dato indicado y lo mostrará por pantalla:
// -------------
// Menú
// -------------
// 1. Leer una cadena de texto.
// 2. Leer un carácter.
// 3. Leer un entero.
// 4. Leer un double.
// 5. Leer un boolean.

import java.util.Scanner;

public class LeerPorTeclado {

  public static String leerString(String string) {
    System.out.println(string);
    Scanner sc = new Scanner(System.in);
    String respuesta = sc.next();
    return respuesta;
  }

  public static char leerChar(String string) {
    System.out.println(string);
    Scanner sc = new Scanner(System.in);
    char charLeido = sc.next().charAt(0);
    return charLeido;
  }

  public static int leerInt(String string) {
    System.out.println(string);
    Scanner sc = new Scanner(System.in);
    int intLeido = sc.nextInt();
    return intLeido;
  }

  public static double leerDouble(String string) {
    System.out.println(string);
    Scanner sc = new Scanner(System.in);
    double doubleLeido = sc.nextDouble();
    return doubleLeido;
  }

  public static boolean leerBoleean(String string) {
    System.out.println(string);
    Scanner sc = new Scanner(System.in);
    boolean booleanLeido = sc.nextBoolean();
    return booleanLeido;
  }
}

class Main {

  public static void main(String[] args) {
    boolean salir = false;
    String mensaje = "Introduce por teclado: ";

    Scanner sc = new Scanner(System.in);
    while (!salir) {
      System.out.println("------");
      System.out.println("Menu");
      System.out.println("------");
      System.out.println("1. Leer una cadena de texto.");
      System.out.println("2. Leer un carácter.");
      System.out.println("3. Leer un entero.");
      System.out.println("4. Leer un double.");
      System.out.println("5. Leer un boolean.");
      System.out.println("0. Salir.");

      int opcion = sc.nextInt();

      switch (opcion) {
        case 1:
          System.out.println(LeerPorTeclado.leerString(mensaje));
          break;
        case 2:
          System.out.println(LeerPorTeclado.leerChar(mensaje));
          break;
        case 3:
          System.out.println(LeerPorTeclado.leerInt(mensaje));
          break;
        case 4:
          System.out.println(LeerPorTeclado.leerDouble(mensaje));
          break;
        case 5:
          System.out.println(LeerPorTeclado.leerBoleean(mensaje));
          break;
        case 0:
          salir = true;
          break;
        default:
          System.out.println("Opción no válida.");
          break;
      }
    }
  }
}
