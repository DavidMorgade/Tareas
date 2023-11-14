// Crea un programa que diga si un elemento existe en un array, ampliar a una matriz

using System;
					
public class Program
{
	public static void Main()
	{
		int[] arrayNumeros = {2, 3, 4, 5, 6};
		Console.WriteLine(ExisteEnArray(7, arrayNumeros));

	}
	public static bool ExisteEnArray(int numero, int[] array)
	{
		foreach(int n in array)
		{
			if(n == numero)
			{
				return true;
			}
		}
		return false;
	}
	public static bool ExisteEnMatriz(int numero, int[][] matriz)
	{
		for(int i = 0; i < matriz.Length; i++)
		{
			for(int j = 0; j < matriz[i].Length; j++)
			{
				if(matriz[i][j] == numero) return true;
			}
		}
		return false;
	}
}
