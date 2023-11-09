
/*
Pedir numeros hasta que se introduzca uno negativo, y calcular la media.
*/
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        double resultado = calcularMedia();
        System.out.print("El resultado de la media es " + resultado);
    }
    public static double calcularMedia() {
        System.out.println("Bienvenido al programa de calcular la media, introduce los numeros positivos que quiere calcular, para salir del programa, introduce un numero negativo.");
        int sumaNumeros = 0, contador = 0, numeroIntroducido;
        double resultado = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Introduce el número:");
            numeroIntroducido = sc.nextInt();
            if(numeroIntroducido >= 0) {
                sumaNumeros += numeroIntroducido;
                contador++;
            }
        } while(numeroIntroducido >= 0);
        resultado = sumaNumeros / contador;
        return resultado;
    }
}
