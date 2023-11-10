// Crea un programa que diga si un elemento existe en un array, ampliar a una matriz

public class ExisteEnArray {

  public static void main(String[] args) {
    int[] array = { 1, 2, 3, 4, 5 };
    int[][] matriz = { { 1, 2, 3 }, { 4, 5, 6 } };
    System.out.println(ExisteEnArray(array, 3));
    System.out.println(ExisteEnMatriz(matriz, 12));
  }

  public static boolean ExisteEnArray(int[] array, int numero) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] == numero) {
        return true;
      }
    }
    return false;
  }

  public static boolean ExisteEnMatriz(int[][] matriz, int numero) {
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        if (matriz[i][j] == numero) {
          return true;
        }
      }
    }
    return false;
  }
}
