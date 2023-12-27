// Parte C
// Crea un programa que cree una factura y un presupuesto pidiendo sus datos por teclado. Una vez creados
// los mostrará por pantalla utilizando el método imprimirPresupuesto.
// Para el desarrollo de esta actividad debéis de crear un proyecto en NetBeans para realizar el ejercicio.
// Recuerda que la herencia se hace mediante extends, y solo se podrá heredar de una clase.

package programaciontareas.src.main.java.programacion.TEMA9;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce el cliente de la factura:");
    String cliente = sc.nextLine();
    System.out.println("Introduce la descripción de la factura:");
    String descripcion = sc.nextLine();
    System.out.println("Introduce el importe de la factura:");
    double importe = sc.nextDouble();

    Factura factura = new Factura(cliente, descripcion, importe);
    Presupuesto presupuesto = new Presupuesto(cliente, descripcion, importe);

    factura.imprimirPresupuesto();
    System.out.println();
    presupuesto.imprimirPresupuesto();
  }
}
