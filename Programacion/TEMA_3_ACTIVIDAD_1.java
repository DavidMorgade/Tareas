/*
 * Escribe un programa en Java que pida al usuario el día y el mes de su nacimiento y le diga su signo del
zodíaco.
 Aries: 21/03 – 20/04
 Tauro: 21/04 – 21/05
 Géminis: 22/05 – 21/06
 Cáncer: 21/06 – 23/07
 Leo: 24/07 – 23/08
 Virgo: 24/08 – 23/09
 Libra: 24/09 – 23/10
 Escorpio: 24/10 – 22/11
 Sagitario: 23/11 – 21/12
 Capricornio: 22/12 – 20/01
 Acuario: 21/01 – 19/02
 Piscis: 20/02 – 20/03
 */

import java.util.Scanner;

public class TEMA_3_ACTIVIDAD_1 {

  public static void main(String[] args) {
    // variables
    int diaNacimiento = 0;
    int mesNacimiento = 0;
    // Scanner para que el usuario pueda introducir datos
    Scanner sc = new Scanner(System.in);
    // variable que hace que el programa se siga ejecutando
    boolean salir = false;

    do {
      try {
        System.out.println(
          "Bienvenido a tu signo del Zodiaco, sigue las instrucciones del programa."
        );
        System.out.println(
          "Introduce tu mes de nacimiento: \n 0 - Salir del programa \n 1 - Enero \n 2 - Febrero \n 3 - Marzo \n 4 - Abril \n 5 - Mayo \n 6 - Junio \n 7 - Julio \n 8 - Agosto \n 9 - Septiembre \n 10 - Octubre \n 11 - Noviembre \n 12 - Diciembre"
        );
        mesNacimiento = sc.nextInt();
        if (mesNacimiento == 0) {
          System.out.println("Saliendo del programa...");
          return;
        }
      } catch (Exception e) {
        System.out.println("Error: Debes ingresar un numero entero.");
        sc.nextInt();
      }
      try {
        System.out.println(
          "Introduce tu dia de nacimiento: \n 0 - Salir del programa \n Día del mes (1-31))"
        );
        diaNacimiento = sc.nextInt();
        if (diaNacimiento == 0) {
          System.out.println("Saliendo del programa...");
          return;
        }
      } catch (Exception e) {
        System.out.println("Error: Debes ingresar un numero entero.");
        sc.nextInt();
      }
    } while (
      mesNacimiento < 0 ||
      mesNacimiento > 12 ||
      diaNacimiento < 0 ||
      diaNacimiento > 31
    );
  }

  public static String signoZodiaco(int diaNacimiento, int mesNacimiento) {
    return "";
  }
}
