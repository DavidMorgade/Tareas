// Implementa una clase ‘Motocicleta’ que represente a una motocicleta.
// De una motocicleta interesa conocer los caballos de potencia (cv), la velocidad punta en km/h, las tres letras
// de su matrícula, y el número de la matrícula.
// Crea las variables de la clase del tipo que creas más conveniente.
// Para terminar, crea dos objetos de la clase Motocicleta.
// Para el desarrollo de esta actividad debéis crear un proyecto en NetBeans para realizar el ejercicio

public class Motocicleta {

  // Atributos
  private int caballosPotencia;
  private int velocidadPunta;
  private String matricula;
  private int numeroMatricula;

  // Constructor
  public Motocicleta(
    int caballosPotencia,
    int velocidadPunta,
    String matricula,
    int numeroMatricula
  ) {
    this.caballosPotencia = caballosPotencia;
    this.velocidadPunta = velocidadPunta;
    this.matricula = matricula;
    this.numeroMatricula = numeroMatricula;
  }

  // Getters
  public int getCaballosPotencia() {
    return caballosPotencia;
  }

  public int getVelocidadPunta() {
    return velocidadPunta;
  }

  public String getMatricula() {
    return matricula;
  }

  public int getNumeroMatricula() {
    return numeroMatricula;
  }

  // Setters
  public void setCaballosPotencia(int caballosPotencia) {
    this.caballosPotencia = caballosPotencia;
  }

  public void setVelocidadPunta(int velocidadPunta) {
    this.velocidadPunta = velocidadPunta;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  public void setNumeroMatricula(int numeroMatricula) {
    this.numeroMatricula = numeroMatricula;
  }

  // Metodos
  public void acelerar() {
    System.out.println("Acelerando...");
  }

  public void frenar() {
    System.out.println("Frenando...");
  }

  public void girar() {
    System.out.println("Girando...");
  }

  public void imprimir() {
    System.out.println("Caballos de potencia: " + caballosPotencia);
    System.out.println("Velocidad punta: " + velocidadPunta);
    System.out.println("Matricula: " + matricula);
    System.out.println("Numero de matricula: " + numeroMatricula);
  }
}
