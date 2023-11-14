/* Se quiere desarrollar un programa que determine si dos numeros son amigos.
 * Dos numeros enteros positivos se consideran amigos si la suma de los divisores de uno es igual al otro numero y vicevers.
 * Ejemplo: 220 y 284 son numeros amigos, ya que los divisores de 220 son 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 y 110, y la suma de ellos es 284.
 * Los divisores de 284 son 1, 2, 4, 71 y 142, y la suma de ellos es 220.
 *
 */

using System;
					
public class Program
{
	public static void Main()
	{
		Console.WriteLine("Introduce dos numeros para saber si son amigos:");
		int numero1 = Convert.ToInt32(Console.ReadLine());
		int numero2 = Convert.ToInt32(Console.ReadLine());
		bool sonAmigos = SonAmigos(numero1, numero2);
		if(sonAmigos)
		{
			Console.WriteLine("Los numeros son amigos");
		} else
		{
			Console.WriteLine("Los numeros no son amigos");
		}
		
	}
	public static bool SonAmigos(int numero1, int numero2)
	{
		return SumaDivisores(numero1) == numero2 && SumaDivisores(numero2) == numero1;
	}
	public static int SumaDivisores(int numero)
	{
		int resultado = 0;
		for(int i = 1; i < numero; i++)
		{
			if(numero % i == 0)
			{
				resultado += i;
			}
		}
		return resultado;
	}
}
