package Programacion;

/**
 * ChuletaProgramacion todo lo que necesitas sobre java para la asignatura de programacion
 */
public class ChuletaProgramacion {

  // Metodo main, aqui es donde se comenzara a ejecutar el código de arriba a abajo
  public static void main(String[] args) {
    System.out.println("Comienzo del programa");
    // Comentario de una linea
    /*
     * Comentario de varias lineas
     */

  }

  // Explicando los tipos de datos
  public static void tiposDeDatos() {
    // Tipos de datos
    int numeroEntero = 5; // Numero entero
    double numeroDecimal = 5.5; // Numero decimal
    char caracter = 'a'; // Caracter
    String cadena = "Hola"; // Cadena de caracteres, no es un tipo de dato primitivo es un objeto
    boolean booleano = true; // Booleano
  }

  public static void operadores() {
    // Operadores
    int numero1 = 5;
    int numero2 = 10;
    int resultado = numero1 + numero2; // Suma
    resultado = numero1 - numero2; // Resta
    resultado = numero1 * numero2; // Multiplicacion
    resultado = numero1 / numero2; // Division
    resultado = numero1 % numero2; // Modulo
    resultado = numero1++; // Incremento
    resultado = numero1--; // Decremento
    resultado = numero1 += numero2; // Suma y asignacion
    resultado = numero1 -= numero2; // Resta y asignacion
    resultado = numero1 *= numero2; // Multiplicacion y asignacion
    resultado = numero1 /= numero2; // Division y asignacion
    resultado = numero1 %= numero2; // Modulo y asignacion
    booleano = numero1 == numero2; // Igualdad
    booleano = numero1 != numero2; // Desigualdad
    booleano = numero1 > numero2; // Mayor que
    booleano = numero1 < numero2; // Menor que
    booleano = numero1 >= numero2; // Mayor o igual que
    booleano = numero1 <= numero2; // Menor o igual que
    booleano = numero1 && numero2; // And
    booleano = numero1 || numero2; // Or
    booleano = !numero1; // Not
  }

  public static void arrays() {
    // Arrays
    int[] arrayEnteros = new int[10]; // Array de enteros de 10 posiciones
    int[] arrayEnteros2 = { 1, 2, 3, 4, 5 }; // Array de enteros de 5 posiciones con valores
    int numero = arrayEnteros[0]; // Acceder a un valor del array
    arrayEnteros[0] = 5; // Modificar un valor del array
    int longitud = arrayEnteros.length; // Longitud del array
    // Como recorrer un array
    for (int i = 0; i < arrayEnteros.length; i++) {
      System.out.println(arrayEnteros[i]);
    }
    // Como recorrer un array con un for each (sintaxis mas corta)
    for (int numero : arrayEnteros) {
      System.out.println(numero);
    }
    // Arrays multidimensionales
    int[][] arrayEnterosMultidimensional = new int[10][10]; // Array multidimensional de enteros de 10x10
    int[][] arrayEnterosMultidimensional2 = { { 1, 2, 3 }, { 4, 5, 6 } }; // Array multidimensional de enteros de 2x3
    int numero = arrayEnterosMultidimensional[0][0]; // Acceder a un valor del array
    arrayEnterosMultidimensional[0][0] = 5; // Modificar un valor del array
    int longitud = arrayEnterosMultidimensional.length; // Longitud del array
    // Como recorrer un array multidimensional
    for (int i = 0; i < arrayEnterosMultidimensional.length; i++) {
      for (int j = 0; j < arrayEnterosMultidimensional[i].length; j++) {
        System.out.println(arrayEnterosMultidimensional[i][j]);
      }
    }
    // Como recorrer un array multidimensional con un for each (sintaxis mas corta)
    for (int[] array : arrayEnterosMultidimensional) {
      for (int numero : array) {
        System.out.println(numero);
      }
    }
    // Algoritmo de ordenacion metodo de la burbuja
    int[] arrayEnteros = { 5, 4, 3, 2, 1 };
    for (int i = 0; i < arrayEnteros.length; i++) {
      for (int j = 0; j < arrayEnteros.length - 1; j++) {
        if (arrayEnteros[j] > arrayEnteros[j + 1]) {
          int aux = arrayEnteros[j];
          arrayEnteros[j] = arrayEnteros[j + 1];
          arrayEnteros[j + 1] = aux;
        }
      }
    }
  }

  public static void estructurasDeControl() {
    // Estructuras de control
    // Podriamos usar un if else en caso de que sea necesario para varias condiciones
    if (true) {
      // Si se cumple la condicion
    } else {
      // Si no se cumple la condicion
    }
    switch (1) {
      case 1:
        // Si se cumple el caso 1
        break;
      case 2:
        // Si se cumple el caso 2
        break;
      default:
        // Si no se cumple ningun caso
        break;
    }

    // Bucles, se ejecutan mientras se cumpla la condicion
    for (int i = 0; i < 10; i++) {
      // Bucle for
    }

    // El while y el do while son iguales, la unica diferencia es que el do while se ejecuta al menos una vez
    while (true) {
      // Bucle while
    }
    do {
      // Bucle do while
    } while (true);
  }
}
