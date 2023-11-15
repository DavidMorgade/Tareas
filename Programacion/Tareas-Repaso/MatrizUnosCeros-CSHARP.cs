// Crea una matriz de tamaño introducido por pantalla y que se rellene de la siguiente form (unos y 0)

using System;
					
public class Program
{
	public static void Main()
	{
		int[,] matriz = CrearMatriz(8, 8);
		MostrarMatriz(matriz);
	}
	public static int[,] CrearMatriz(int numeroFilas, int numeroColumnas) 
	{
    int[,] matriz = new int[numeroFilas, numeroColumnas];
    for (int i = 0; i < numeroFilas; i++) 
	{
      for (int j = 0; j < numeroColumnas; j++) 
	  {
        if (
          i == 0 || j == 0 || i == numeroFilas - 1 || j == numeroColumnas - 1
        ) 
		{
          matriz[i,j] = 1;
        } else 
		{
          matriz[i,j] = 0;
        }
       }
      }
	  return matriz;
	}
	public static void MostrarMatriz(int[,] matriz)
	{
		int filas = matriz.GetLength(0);
        int columnas = matriz.GetLength(1);
		for(int i = 0; i < filas; i++)
		{
			for(int j = 0; j < columnas; j++)
			{
				Console.Write(matriz[i,j] + " ");
			}
			Console.WriteLine();
		}
	}
}
