package com.mycompany.antonio.el.crack;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Clase Numeros
 *
 * Clase que contiene los metodos para introducir 10 numeros enteros, mostrarlos
 * ordenados de menor a mayor, contar los pares e impares y mostrar el conteo de
 * pares e impares.
 *
 * @version 1.0
 * @since 2023-11-06
 */
class Numeros {

  // Atributos de la clase
  private int[] numeros; // Array de numeros
  private int pares; // Contador de pares
  private int impares; // Contador de impares

  // Constructor
  public Numeros() {
    this.numeros = new int[10]; // Inicializamos el array con 10 posiciones
    this.pares = 0; // Inicializamos el contador de pares a 0
    this.impares = 0; // Inicializamos el contador de impares a 0
  }

  // Metodos de la clase
  public void introducirNumeros(Scanner sc) { // Metodo para introducir los numeros
    System.out.println("Introduce 10 numeros sin decimales:"); // Pedimos los numeros
    int i = 0; // Inicializamos el contador
    while (i < numeros.length) { // Mientras el contador sea menor que la longitud del array
      try { // Intentamos introducir un numero
        numeros[i] = sc.nextInt();
        i++;
      } catch (Exception e) { // Si no se introduce un numero entero mostramos un error y volvemos a pedir el numero
        System.out.println("Error: Ingresa un número entero válido.");
        sc.nextLine();
      }
    }
  }

  public void mostrarNumerosOrdenados() { // Metodo para mostrar los numeros ordenados
    int[] arrayClonado = numeros.clone(); // Clonamos el array para no modificar el original
    Arrays.sort(arrayClonado); // Ordenamos el array
    System.out.println("Los numeros ordenados de menor a mayor son:");
    for (int numero : arrayClonado) { // Recorremos el array ordenado y mostramos los numeros
      System.out.print(numero + " ");
    }
    System.out.println("");
  }

  public void contarParesImpares() { // Metodo para contar los pares e impares
    for (int numero : numeros) { // Recorremos el array
      if (numero % 2 == 0) {
        pares++; // Si el numero es par sumamos 1 al contador de pares
      } else {
        impares++; // Si el numero es impar sumamos 1 al contador de impares
      }
    }
  }

  public void mostrarConteoParesImpares() { // Metodo para mostrar el conteo de pares e impares
    System.out.println("Hay " + pares + " numeros pares"); // Mostramos el conteo de pares
    System.out.println("Hay " + impares + " numeros impares"); // Mostramos el conteo de impares
  }
}
