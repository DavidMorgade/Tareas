using System;
					
public class Program
{
	public static void Main()
	{
		if (CalcularPotencia(25, 2) == (int) Math.Pow(25, 2)) 
		{ // 5^2 = 5 * 5 = 25
		  Console.WriteLine("El metodo funciona correctamente");
		} else 
		{
		  Console.WriteLine("El metodo no funciona correctamente");
		}
	}
	public static int CalcularPotencia(int basePotencia, int exponente) 
	{
		// Cuando multiplicamos empezamos por 1, ya que si empezamos por 0, el resultado siempre sera 0
		int resultado = 1;
		// Multiplicamos la base tantas veces como sea el exponente
		for (int i = 0; i < exponente; i++) 
		{
		  resultado *= basePotencia;
		}
		// Devolvemos el resultado
		return resultado;
    }
}
