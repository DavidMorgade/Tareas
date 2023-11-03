/* Realiza un programa en Java que simule la cafetería de una facultad.
El programa pedirá los siguientes datos al usuario:
1. Cantidad de cafés que se van a tomar.
2. Cantidad de tostadas que se van a tomar.
3. Cantidad de zumos de naranja natural que se van a tomar.
El usuario deberá introducir la cantidad de cada uno de estos productos, pudiendo ser 0 si no desea tomar
alguno de ellos.
El programa deberá calcular y mostrar cuánto deberá el pagar el usuario, siendo los precios los siguientes:
1. Precio de 1 café: 1.1€
2. Precio de 1 tostada: 1.5€
3. Precio de 1 zumo de naranja natural: 2€
Para el desarrollo de esta actividad debéis de crear un proyecto en NetBeans y comentarlo de forma que
se pueda entender a la perfección.
No te olvides de declarar un Scanner para cada tipo de datos
*/

using System;

public class ACTIVIDAD_1_CSHARP
{
public static void Main(string[] args) 
{
    // VARIABLES FIJAS DE PRECIOS
    const double PRECIO_CAFE = 1.1, PRECIO_TOSTADA = 1.5, PRECIO_ZUMO = 2; 
    // VARIABLES DE CANTIDADES QUE ASIGNAREMOS DESPUES
    int cantidadCafes = 0, cantidadTostadas = 0, cantidadZumo = 0;
    // DECLARAMOS EL TOTAL PARA CALCULARLO DESPUES
    double total;
    // BLOQUE TRY CATCH, EN CASO DE QUE NO SE PONGA UN INT SALDRÁ DEL PROGRAMA
    try
    {
        // PEDIMOS LOS DATOS AL USUARIO
        Console.WriteLine("Introduce la cantidad de cafés que vas a tomar:");
        cantidadCafes = int.Parse(Console.ReadLine());
        
        Console.WriteLine("Introduce la cantidad de tostadas que vas a querer:");
        cantidadTostadas = int.Parse(Console.ReadLine());
        
        Console.WriteLine("Introduce la cantidad de zumos que vas a tomar:");
        cantidadZumo = int.Parse(Console.ReadLine());
    }
    catch (FormatException e)
    {
        Console.WriteLine("Error: Debes ingresar un número entero.");
        return; // Finaliza el programa si se produce un error.
    }
    // Calculamos el total
    total = (cantidadCafes * PRECIO_CAFE) + (cantidadTostadas * PRECIO_TOSTADA) + (cantidadZumo * PRECIO_ZUMO);
    // Imprimimos el total
    Console.WriteLine($"El total que debes pagar es {total}");
    }
}
