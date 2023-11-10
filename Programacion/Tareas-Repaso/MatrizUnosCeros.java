// Crea una matriz de tamaño introducido por pantalla y que se rellene de la siguiente form (unos y 0)

import java.util.Scanner;

public class MatrizUnosCeros {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce el numero de filas:");
    int numeroFilas = sc.nextInt();
    System.out.println("Introduce el numero de columnas:");
    int numeroColumnas = sc.nextInt();

    int[][] matriz = crearMatriz(numeroFilas, numeroColumnas);

    mostrarMatriz(matriz);
  }

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

  public static void mostrarMatriz(int[][] matriz) {
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        System.out.print(matriz[i][j] + " ");
      }
      System.out.println();
    }
  }
}
