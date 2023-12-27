// Ejercicio
// Crear un ejemplo de uso con una lista ordenada de números y probar el algoritmo anterior
package programaciontareas.src.main.java.programacion.TEMA4;

public class TEMA_4_ANEXO {

  public static void main(String[] args) {
    // Creo un array a mano
    int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 }; // Array ordenado
    int numero = busquedaBinaria(array, 1); // Busco el numero 1
    if (numero != -1) { // Si el numero es distinto de -1, es que lo ha encontrado
      System.out.println("El numero se encuentra en la posicion: " + numero); // Imprimo la posicion
    } else { // Si el numero es -1, es que no lo ha encontrado
      System.out.println("El numero no se encuentra en el array"); // Imprimo que no lo ha encontrado
    }
  }

  // Algoritmo de busqueda binaria
  public static int busquedaBinaria(int[] array, int numero) {
    int inicio = 0; // Inicio del array
    int fin = array.length - 1; // Fin del array
    int medio; // Posicion media del array
    while (inicio <= fin) { // Mientras que el inicio sea menor o igual que el fin
      medio = (inicio + fin) / 2; /// Calculo la posicion media
      if (numero == array[medio]) { // Si el numero es igual al numero de la posicion media
        return medio; // Devuelvo la posicion media
      } else if (numero < array[medio]) { // Si el numero es menor que el numero de la posicion media
        fin = medio - 1; // El fin pasa a ser la posicion media - 1
      } else { // Si el numero es mayor que el numero de la posicion media
        inicio = medio + 1; // El inicio pasa a ser la posicion media + 1
      }
    }
    return -1; // Si no se encuentra el numero, devuelvo -1
  }
}
