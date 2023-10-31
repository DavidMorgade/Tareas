// Implementa una clase Alumno que represente a los alumnos de una asignatura. De cada alumno interesa
// conocer su DNI, su edad y su nota de cada trimestre.
// Crea las variables de la clase del tipo que creas más conveniente.
// Para terminar, crea dos objetos de la clase Alumno.
// Para el desarrollo de esta actividad debéis de crear un proyecto en NetBeans para realizar el ejercicio.
// Recuerda que para crear una clase debes usar la palabra reservada class.
package Programacion.TEMA5;

public class Alumno {

  // Atributos
  private String dni;
  private int edad;
  private int[] notas = new int[3];

  // Constructor
  public Alumno(String dni, int edad, int[] notas) {
    this.dni = dni;
    this.edad = edad;
    this.notas = notas;
  }

  // Getters
  public String getDni() {
    return dni;
  }

  public int getEdad() {
    return edad;
  }

  public int getNotaTrimestre1() {
    return notas[0];
  }

  public int getNotaTrimestre2() {
    return notas[1];
  }

  public int getNotaTrimestre3() {
    return notas[2];
  }

  // Setters
  public void setDni(String dni) {
    this.dni = dni;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public void setNotaTrimestre1(int notaTrimestre1) {
    this.notas[0] = notaTrimestre1;
  }

  public void setNotaTrimestre2(int notaTrimestre2) {
    this.notas[1] = notaTrimestre2;
  }

  public void setNotaTrimestre3(int notaTrimestre3) {
    this.notas[2] = notaTrimestre3;
  }
}
