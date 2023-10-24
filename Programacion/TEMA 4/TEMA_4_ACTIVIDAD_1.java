public class TEMA_4_ACTIVIDAD_1 {

  public static void main(String[] args) {
    System.out.println(esPalindromo("Sometamos o matemos"));
  }

  //     Un palíndromo es una palabra o una frase que se lee de igual forma de izquierda a derecha que de derecha
  // a izquierda. Realiza una función en Java que reciba una palabra y calcule si es un palíndromo o no. Deberás
  // realizar el ejercicio realizando una función como la siguiente:
  public static boolean esPalindromo(String frase) {
    frase = frase.toLowerCase().replace(" ", "");
    String fraseInvertida = "";
    char x;
    for (int i = frase.length() - 1; i >= 0; i--) {
      x = frase.charAt(i);
      fraseInvertida += x;
    }
    return fraseInvertida.equals(frase);
  }
}
