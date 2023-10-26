public class TEMA_4_ACTIVIDAD_1 {

  public static void main(String[] args) {
    System.out.println(esPalindromo("Sometamos o matemos"));
  }

  //     Un palíndromo es una palabra o una frase que se lee de igual forma de izquierda a derecha que de derecha
  // a izquierda. Realiza una función en Java que reciba una palabra y calcule si es un palíndromo o no. Deberás
  // realizar el ejercicio realizando una función como la siguiente:
  public static boolean esPalindromo(String frase) {
    // Convertimos la frase en minusculas, eliminamos los espacios con el metodo replace
    frase = frase.toLowerCase().replace(" ", "");
    // Creamos un string llamado frase invertida donde iremos sumando cada caracter del otro string
    String fraseInvertida = "";
    // Conn este char evitamos crearlo dentro del bucle, lo asignaremos dentro de el en cada iteración
    char x;
    // Bucle encargado de recorrer la frase desde el final hasta la primera letra
    for (int i = frase.length() - 1; i >= 0; i--) {
      // Asignamos el char x a la letra correspondiente de la frase
      x = frase.charAt(i);
      // Vamos sumando todo al string frase invertida
      fraseInvertida += x;
    }
    // Devolvemos el boolean resultante del metodo equals, entre fraseInvertida y frase
    return fraseInvertida.equals(frase);
  }
}
