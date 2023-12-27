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
package programaciontareas.src.main.java.programacion.TEMA3;

import java.util.Scanner;

public class TEMA_3_ACTIVIDAD_1 {

  public static void main(String[] args) {
    // variables
    int diaNacimiento = 0;
    int mesNacimiento = 0;
    // Scanner para que el usuario pueda introducir datos
    Scanner sc = new Scanner(System.in);

    // Bucle para que el usuario introduzca el mes de nacimiento
    do {
      // Try catch para que el usuario introduzca un numero entero
      try {
        // Mostramos el mensaje de bienvenida y las instrucciones del programa
        System.out.println(
          "Bienvenido a tu signo del Zodiaco, sigue las instrucciones del programa."
        );
        System.out.println(
          "Introduce tu mes de nacimiento: \n 0 - Salir del programa \n 1 - Enero \n 2 - Febrero \n 3 - Marzo \n 4 - Abril \n 5 - Mayo \n 6 - Junio \n 7 - Julio \n 8 - Agosto \n 9 - Septiembre \n 10 - Octubre \n 11 - Noviembre \n 12 - Diciembre"
        );
        // Guardamos el dato introducido por el usuario
        mesNacimiento = sc.nextInt();
        if (mesNacimiento == 0) {
          // Si el usuario introduce 0, se saldra del programa
          System.out.println("Saliendo del programa...");
          return;
        }
      } catch (Exception e) { // Si el usuario no introduce un numero entero, se le mostrara un mensaje de error
        System.out.println("Error: Debes ingresar un numero entero.");
        mesNacimiento = -1;
      }
      // Para que el usuario pueda introducir otro dato
      sc.nextLine();
    } while (mesNacimiento < 0 || mesNacimiento > 12);

    // Bucle para que el usuario introduzca el dia de nacimiento
    do {
      // Try catch para que el usuario introduzca un numero entero
      try {
        System.out.println(
          "Introduce tu dia de nacimiento: \n 0 - Salir del programa \n Día del mes (1-31))"
        );
        // Guardamos el dato introducido por el usuario
        diaNacimiento = sc.nextInt();
        // Si el usuario introduce 0, se saldra del programa
        if (diaNacimiento == 0) {
          System.out.println("Saliendo del programa...");
          return;
        }
      } catch (Exception e) { // Si el usuario no introduce un numero entero, se le mostrara un mensaje de error
        System.out.println("Error: Debes ingresar un numero entero.");
      }
      // Para que el usuario pueda introducir otro dato
      sc.nextLine();
    } while (diaNacimiento <= 0 || diaNacimiento > 31);

    // Mostramos el signo del zodiaco
    System.out.println(
      "Tu signo del zodiaco es: " + signoZodiaco(diaNacimiento, mesNacimiento)
    );
  }

  // Metodo para calcular el signo del zodiaco
  public static String signoZodiaco(int diaNacimiento, int mesNacimiento) {
    // Esta funcion con el diaNaicimiento y mesNacimiento devolvera el signo del Zodiaco en forma de String
    String signo = "";

    switch (mesNacimiento) {
      case 1:
        if (diaNacimiento <= 20) {
          signo = "Capricornio";
        } else {
          signo = "Acuario";
        }
        break;
      case 2:
        if (diaNacimiento <= 19) {
          signo = "Acuario";
        } else {
          signo = "Piscis";
        }
        break;
      case 3:
        if (diaNacimiento <= 20) {
          signo = "Piscis";
        } else {
          signo = "Aries";
        }
        break;
      // Add more cases for the remaining months
      case 4:
        if (diaNacimiento <= 20) {
          signo = "Aries";
        } else {
          signo = "Tauro";
        }
        break;
      case 5:
        if (diaNacimiento <= 21) {
          signo = "Tauro";
        } else {
          signo = "Géminis";
        }
        break;
      case 6:
        if (diaNacimiento <= 21) {
          signo = "Géminis";
        } else {
          signo = "Cáncer";
        }
        break;
      case 7:
        if (diaNacimiento <= 23) {
          signo = "Cáncer";
        } else {
          signo = "Leo";
        }
        break;
      case 8:
        if (diaNacimiento <= 23) {
          signo = "Leo";
        } else {
          signo = "Virgo";
        }
        break;
      case 9:
        if (diaNacimiento <= 23) {
          signo = "Virgo";
        } else {
          signo = "Libra";
        }
        break;
      case 10:
        if (diaNacimiento <= 23) {
          signo = "Libra";
        } else {
          signo = "Escorpio";
        }
        break;
      case 11:
        if (diaNacimiento <= 22) {
          signo = "Escorpio";
        } else {
          signo = "Sagitario";
        }
        break;
      case 12:
        if (diaNacimiento <= 21) {
          signo = "Sagitario";
        } else {
          signo = "Capricornio";
        }
        break;
      default:
        signo = "Mes de nacimiento no válido";
        break;
    }

    return signo;
  }
}
