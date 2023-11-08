  //     Un palíndromo es una palabra o una frase que se lee de igual forma de izquierda a derecha que de derecha
  // a izquierda. Realiza una función en Java que reciba una palabra y calcule si es un palíndromo o no. Deberás
  // realizar el ejercicio realizando una función como la siguiente:

using System;
					
public class Program
{
	public static void Main()
	{
		Console.WriteLine(esPalindromo("Sometamos o matemos"));
	}
	public static bool esPalindromo(string frase) 
	{
		// Convertimos la frase en minusculas, eliminamos los espacios con el metodo replace
		frase = frase.ToLower().Replace(" ", "");
		// Creamos un string llamado frase invertida donde iremos sumando cada caracter del otro string
		string fraseInvertida = "";
		// Bucle encargado de recorrer la frase desde el final hasta la primera letra
		for(int i = frase.Length - 1; i>=0; i--)
		{
			// Vamos sumando todo al string frase invertida
			fraseInvertida+=frase[i];
		}
		// Devolvemos el boolean resultante del metodo equals, entre fraseInvertida y frase
		return fraseInvertida == frase;
	}
}
