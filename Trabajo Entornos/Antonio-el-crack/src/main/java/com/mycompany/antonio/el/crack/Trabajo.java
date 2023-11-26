/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.antonio.el.crack;

import java.util.Scanner;

/**
 *
 * @author Antonio "el crack"
 */
public class Trabajo {
  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Instanciamos la clase Numeros
    Numeros numeros = new Numeros();
    // Declaramos el Scanner
    Scanner sc = new Scanner(System.in);
    // Introducimos los numeros
    numeros.introducirNumeros(sc);
    // Mostramos los numeros ordenados
    numeros.mostrarNumerosOrdenados();
    // Contamos los pares e impares
    numeros.contarParesImpares();
    // Mostramos el conteo de pares e impares
    numeros.mostrarConteoParesImpares();
  }
}
