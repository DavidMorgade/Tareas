
/*
PIDE UN NUMERO E INDICA SI ES NEGATIVO O POSITIVO
*/
import java.util.Scanner;  

public class PositivoNegativo
{
    public static void main(String[] args) {
        // Pedimos el numero
        System.out.println("Introduce un número:");
        // Declaramos el scanner
        Scanner sc = new Scanner(System.in);
        // Asignamos el numero al scanner
        int numero = sc.nextInt();
        // Usamos el método que hemos creado
        NegativoOPositivo(numero);
    }
    public static void NegativoOPositivo(int numero) {
        // Si es menor que 0, imprimimos negativo
        if(numero < 0) {
            System.out.println("El numero " + numero + " es negativo");
        // Si es mayor que 0, imprimimos positivo
        } else {
            System.out.println("El numero " + numero + " es positivo");
        }
    }
}
