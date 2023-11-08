/*
 * Escribe un programa en Csharp que pida al usuario el día y el mes de su nacimiento y le diga su signo del
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

using System;
					
public class Program
{
	public static void Main()
	{
		int diaNacimiento = 0;
		int mesNacimiento = 0;
		
		do 
		{
			try 
			{
				Console.WriteLine("Bienvenido a tu signo del Zodiaco, sigue las instrucciones del programa.");
				Console.WriteLine("Introduce tu mes de nacimiento: \n 0 - Salir del programa \n 1 - Enero \n 2 - Febrero \n 3 - Marzo \n 4 - Abril \n 5 - Mayo \n 6 - Junio \n 7 - Julio \n 8 - Agosto \n 9 - Septiembre \n 10 - Octubre \n 11 - Noviembre \n 12 - Diciembre");
				// Guardamos el dato introducido por el usuario
				mesNacimiento = int.Parse(Console.ReadLine());
				if(mesNacimiento == 0) 
				{
					Console.WriteLine("Saliendo del programa...");
					return;
				}
			} catch(Exception ex) 
			{
				Console.WriteLine(ex.Message);
				mesNacimiento = -1;
			}
		} while(mesNacimiento < 0 || mesNacimiento > 12);
		do 
		{
			try 
			{
				Console.WriteLine("Introduce tu dia de nacimiento: \n 0 - Salir del programa \n Día del mes (1-31))");
				// Guardamos el dato introducido por el usuario
				diaNacimiento = int.Parse(Console.ReadLine());
				if(diaNacimiento == 0) 
				{
					Console.WriteLine("Saliendo del programa...");
					return;
				}
			} 
			catch(Exception ex) 
			{
				Console.WriteLine("Error: Debes ingresar un numero entero.");
				diaNacimiento = -1;
			}
		} while(diaNacimiento <= 0 || diaNacimiento > 31);
		
		Console.WriteLine("Tu signo del zodiaco es: " + signoZodiaco(diaNacimiento, mesNacimiento));
	}
	public static string signoZodiaco(int diaNacimiento, int mesNacimiento)
	{
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
