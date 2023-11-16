package Programacion;

public class AlgoritmosUtiles {

  public static void main(String[] args) {}

  // Generar un numero aleatorio entre dos numeros
  public static int generarNumeroAleatorio(int numeroMinimo, int numeroMaximo) {
    return (int) (
      Math.random() * (numeroMaximo - numeroMinimo + 1) + numeroMinimo
    );
  }

  // Generar array aleatorio
  public static int[] generarArrayAleatorio(
    int numeroMinimo,
    int numeroMaximo
  ) {
    int[] array = new int[generarNumeroAleatorio(numeroMinimo, numeroMaximo)];
    for (int i = 0; i < array.length; i++) {
      array[i] = generarNumeroAleatorio(numeroMinimo, numeroMaximo);
    }
    return array;
  }

  // Mostrar array
  public static void mostrarArray(int[] array) {
    for (int numero : array) {
      System.out.println(numero);
    }
  }

  // Mostrar array al reves
  public static void mostrarArrayInverso(int[] array) {
    for (int i = array.length - 1; i >= 0; i--) {
      System.out.println(array[i]);
    }
  }

  // Ordenar array de menor a mayor
  public static void ordenarArrayMenorMayor(int[] array) {
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array.length - 1; j++) {
        if (array[j] > array[j + 1]) {
          int aux = array[j];
          array[j] = array[j + 1];
          array[j + 1] = aux;
        }
      }
    }
  }

  //////////////////////////MATRICES//////////////////////////////
  // Mostrar matriz
  public static void mostrarMatriz(int[][] matriz) {
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        System.out.print(matriz[i][j] + " ");
      }
      System.out.println();
    }
  }

  // Crear matriz por parametros
  public static int[][] crearMatriz(int numeroFilas, int numeroColumnas) {
    int[][] matriz = new int[numeroFilas][numeroColumnas];
    for (int i = 0; i < numeroFilas; i++) {
      for (int j = 0; j < numeroColumnas; j++) {
        if (
          i == 0 || j == 0 || i == numeroFilas - 1 || j == numeroColumnas - 1
        ) {
          matriz[i][j] = 1;
        } else {
          matriz[i][j] = 0;
        }
      }
    }

    return matriz;
  }

  // Crear matriz de 3
  public static int[][][] crearMatriz3d(
    int numeroFilas,
    int numeroColumnas,
    int numeroAlto
  ) {
    int[][][] matriz = new int[numeroFilas][numeroColumnas][numeroAlto];
    for (int i = 0; i < numeroFilas; i++) {
      for (int j = 0; j < numeroColumnas; j++) {
        for (int k = 0; k < numeroAlto; k++) {
          matriz[i][j][k] = 0;
        }
      }
    }

    return matriz;
  }

  // Comprobar si un numero existe dentro de un array
  public static boolean buscarNumero(int[] array, int numero) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] == numero) {
        return true;
      }
    }
    return false;
  }

  // Buscar numero menor dentro de un array
  public static int buscarNumeroMenor(int[] array) {
    int menor = array[0];
    for (int i = 1; i < array.length; i++) {
      if (array[i] < menor) {
        menor = array[i];
      }
    }
    return menor;
  }

  // Buscar numero mayor dentro de un array
  public static int buscarNumeroMayor(int[] array) {
    int mayor = array[0];
    for (int i = 1; i < array.length; i++) {
      if (array[i] > mayor) {
        mayor = array[i];
      }
    }
    return mayor;
  }

  // Ver si es palindromo
  public static boolean esPalindromo(String palabra) {
    String palabraInvertida = "";
    for (int i = palabra.length() - 1; i >= 0; i--) {
      palabraInvertida += palabra.charAt(i);
    }
    return palabra.equals(palabraInvertida);
  }

  // Ver si es numero primo
  public static boolean esNumeroPrimo(int numero) {
    for (int i = 2; i < numero; i++) {
      if (numero % i == 0) {
        return false;
      }
    }
    return true;
  }
}
