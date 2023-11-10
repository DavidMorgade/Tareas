/* Calcular la potencia de un numero sin usar Math
 */

public class PotenciaSinMath {

  public static void main(String[] args) {
    if (calcularPotencia(25, 2) == (int) Math.pow(25, 2)) { // 5^2 = 5 * 5 = 25
      System.out.println("El metodo funciona correctamente");
    } else {
      System.out.println("El metodo no funciona correctamente");
    }
  }

  public static int calcularPotencia(int base, int exponente) {
    // Cuando multiplicamos empezamos por 1, ya que si empezamos por 0, el resultado siempre sera 0
    int resultado = 1;
    // Multiplicamos la base tantas veces como sea el exponente
    for (int i = 0; i < exponente; i++) {
      resultado *= base;
    }
    // Devolvemos el resultado
    return resultado;
  }
}
