/*
Pedir numeros hasta que se introduzca uno negativo, y calcular la media.
*/

using System;
					
public class Program
{
	public static void Main()
	{
		double resultado = CalcularMedia();
		Console.WriteLine("El resultado es igual a " + resultado);
	}
	public static double CalcularMedia()
	{
		Console.WriteLine("Bienvenido al programa de calcular la media, introduce los numeros positivos que quiere calcular, para salir del programa, introduce un numero negativo.");
        double sumaNumeros = 0, contador = 0, numeroIntroducido;
        double resultado = 0;
		do
		{
			Console.WriteLine("Introduce un numero:");
			numeroIntroducido = Convert.ToInt32(Console.ReadLine());
			if(numeroIntroducido >= 0)
			{
				sumaNumeros += numeroIntroducido;
				contador++;
			}
		} while(numeroIntroducido >= 0);
		resultado = sumaNumeros / contador;
		return resultado;
	}
}
