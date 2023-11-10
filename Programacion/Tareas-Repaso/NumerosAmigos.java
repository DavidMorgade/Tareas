/* Se quiere desarrollar un programa que determine si dos numeros son amigos.
 * Dos numeros enteros positivos se consideran amigos si la suma de los divisores de uno es igual al otro numero y vicevers.
 * Ejemplo: 220 y 284 son numeros amigos, ya que los divisores de 220 son 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 y 110, y la suma de ellos es 284.
 * Los divisores de 284 son 1, 2, 4, 71 y 142, y la suma de ellos es 220.
 *
 */

import java.util.Scanner;

public class NumerosAmigos {

  public static void main(String[] args) {
    numerosAmigosConsola();
  }

  public static void numerosAmigosConsola() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce el primer numero:");
    int numero1 = sc.nextInt();
    System.out.println("Introduce el segundo numero:");
    int numero2 = sc.nextInt();
    if (sonAmigos(numero1, numero2)) {
      System.out.println("Son amigos");
    } else {
      System.out.println("No son amigos");
    }
  }

  public static boolean sonAmigos(int numero1, int numero2) {
    return (
      sumaDivisores(numero1) == numero2 && sumaDivisores(numero2) == numero1
    );
  }

  public static int sumaDivisores(int numero) {
    int sumaDivisores = 0;
    for (int i = 1; i < numero; i++) {
      if (numero % i == 0) {
        sumaDivisores += i;
      }
    }
    return sumaDivisores;
  }
}
