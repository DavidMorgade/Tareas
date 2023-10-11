package Programacion;

// Complétalo para que:
// 1. La salida al ejecutar sea la siguiente:
// a es igual a 10.
// b es igual a 5.
// 2. No puedes utilizar ningún literal, es decir no puedes escribir las líneas:
// “a = 10” ni “b = 5”.
// 3. No puedes tocar las líneas que sacan por pantalla el mensaje.

public class TEMA_2_ACTIVDAD_1 {

  public static void main(String[] args) {
    int a = 5, b = 10;
    // creamos una tercera variable donde almanezaremos el valor de la anterior
    int c;
    c = a;
    a = b;
    b = c;

    System.out.println("a es igual a " + a);
    System.out.println("b es igual b " + b);
  }
}
