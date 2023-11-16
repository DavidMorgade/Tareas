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
    // Parametros de una clase
    final int numero = 5; // Variable fija
    int numero = 5; // Variable modificable
  }

  // Chuleta de metodos
  public static void metodos() {
    // Llamada a un metodo
    metodo();
    // Llamada a un metodo con parametros
    metodoConParametros(5, 10);
    // Llamada a un metodo con retorno
    int numero = metodoConRetorno();
    // Llamada a un metodo con retorno y parametros
    int numero = metodoConRetornoYParametros(5, 10);
  }

  // Chuleta de variables
  public static void tiposDeDatos() {
    // Tipos de datos
    int numeroEntero = 5; // Numero entero
    double numeroDecimal = 5.5; // Numero decimal
    char caracter = 'a'; // Caracter
    String cadena = "Hola"; // Cadena de caracteres, no es un tipo de dato primitivo es un objeto
    boolean booleano = true; // Booleano
  }

  // Chuleta de declaraciones de variables
  public static void declaracionesDeVariables() {
    // Declaraciones de variables
    int numeroEntero; // Declaracion de una variable
    int numeroEntero = 5; // Declaracion de una variable con asignacion de valor
    int numeroEntero1, numeroEntero2; // Declaracion de varias variables
    int numeroEntero1 = 5, numeroEntero2 = 10; // Declaracion de varias variables con asignacion de valor
  }

  // Chuleta de operadores
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

  // Chuleta de arrays
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
    // Recorremos las posiciones del array
    for (int i = 0; i < arrayEnteros.length; i++) {
      // Recorremos las posiciones del array menos la ultima
      for (int j = 0; j < arrayEnteros.length - 1; j++) {
        // Si el valor de la posicion actual es mayor que el valor de la posicion siguiente
        if (arrayEnteros[j] > arrayEnteros[j + 1]) {
          // Intercambiamos los valores
          int aux = arrayEnteros[j];
          arrayEnteros[j] = arrayEnteros[j + 1];
          arrayEnteros[j + 1] = aux;
        }
      }
    }
  }

  // Chuleta de estructuras de control
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
    // Estructura de try catch finally
    try {
      // Codigo que puede lanzar una excepcion
    } catch (Exception e) {
      // Codigo que se ejecuta si se lanza una excepcion
    } finally {
      // Codigo que se ejecuta siempre
    }
  }

  // Tipos Excepciones
  public static void tiposExcepciones() {
    // Excepciones
    // ArithmeticException
    int numero = 5 / 0;
    // ArrayIndexOutOfBoundsException
    int[] arrayEnteros = new int[10];
    int numero = arrayEnteros[10];
    // NumberFormatException
    int numero = Integer.parseInt("a");
    // NullPointerException
    String cadena = null;
    int longitud = cadena.length();
    // IOException
    FileReader fr = new FileReader("archivo.txt");
    // ClassNotFoundException
    Class.forName("com.mysql.jdbc.Driver");
  }
}
// CLASES
// Clase abstracta
abstract class ClaseAbstracta {
  // Atributos
  private int numero;
  // Constructor
  public ClaseAbstracta(int numero) {
    this.numero = numero;
  }

  // Metodo abstracto
  public abstract void metodoAbstracto();
}
// Clase
class Clase extends ClaseAbstracta {
  // Atributos
  private int numero;
  // Constructor
  public Clase(int numero) {
    super(numero);
    this.numero = numero;
  }
  // Constructor
  public Clase() {
    this(5);
  }
  // Getters y setters
  public int getNumero() {
    return numero;
  }
  public void setNumero(int numero) {
    this.numero = numero;
  }

  // Metodo
  public void metodo() {
    // Codigo
  }

  // Metodo abstracto
  @Override
  public void metodoAbstracto() {
    // Codigo
  }
}
// Interfaz
interface Interfaz {
  // Atributos
  public static final int numero = 5;
  // Metodos
  public void metodo();
}
// Interfaz 2
interface Interfaz2 {
  // Metodos
  public void metodo2();
}

// Clase con interfaz
class ClaseConInterfaz implements Interfaz {
  // Metodo
  @Override
  public void metodo() {
    // Codigo
  }
}
// Clase con interfaz y herencia
class ClaseConInterfazYHerencia extends Clase implements Interfaz {
  // Constructor
  public ClaseConInterfazYHerencia(int numero) {
    super(numero);
  }

  // Metodo
  @Override
  public void metodo() {
    // Codigo
  }
}
// Clase con interfaz y herencia multiple
class ClaseConInterfazYHerenciaMultiple extends Clase implements Interfaz, Interfaz2 {
  // Constructor
  public ClaseConInterfazYHerenciaMultiple(int numero) {
    super(numero);
  }

  // Metodo
  @Override
  public void metodo() {
    // Codigo
  }

  // Metodo
  @Override
  public void metodo2() {
    // Codigo
  }
}
