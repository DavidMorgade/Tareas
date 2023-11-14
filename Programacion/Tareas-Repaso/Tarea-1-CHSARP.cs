using System;
					
public class Program
{
	public static void Main()
	{
		Console.WriteLine("Introduce un numero:");
		int numero = Convert.ToInt32(Console.ReadLine());
		
		NegativoPositivo(numero);
	}
	public static void NegativoPositivo(int numero) 
	{
		if(numero < 0)
		{
			Console.WriteLine("El numero es negativo");
		} else
		{
			Console.WriteLine("El numero es positivo");
		}
	}
}
