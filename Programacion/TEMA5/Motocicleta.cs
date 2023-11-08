// Implementa una clase ‘Motocicleta’ que represente a una motocicleta.
// De una motocicleta interesa conocer los caballos de potencia (cv), la velocidad punta en km/h, las tres letras
// de su matrícula, y el número de la matrícula.
// Crea las variables de la clase del tipo que creas más conveniente.
// Para terminar, crea dos objetos de la clase Motocicleta.
// Para el desarrollo de esta actividad debéis crear un proyecto en NetBeans para realizar el ejercicio

using System;
					
public class Program
{
	public static void Main()
	{
		Motocicleta vespa = new Motocicleta(25, 25, "ASD");
		Motocicleta yamaha = new Motocicleta(100, 100, "ASD");
		Console.WriteLine(vespa.caballos);
		Console.WriteLine(yamaha.matricula);
	}
}

public class Motocicleta
{
	// Parametros de la clase iniciados con sus getters y setters
	public int caballos {get; set;}
	public int velocidadPunta {get; set;}
	public string matricula {get; set;}
	// Constructor completo
	public Motocicleta(int caballos, int velocidadPunta, string matricula) 
	{
		this.caballos = caballos;
		this.velocidadPunta = velocidadPunta;
		this.matricula = matricula;
	}
	// Constructor vacio 
	public Motocicleta()
	{
	
	}
}
