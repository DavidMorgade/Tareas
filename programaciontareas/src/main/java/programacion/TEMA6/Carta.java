// Implementa una clase Carta que represente a una carta de una baraja de póker.
// De una carta interesa conocer su número y su palo (almacenado como una única letra).
// El número de la carta se deberá representar con un int y el palo con un String de una sola letra.
// La clase Carta deberá tener los siguientes métodos:
//  Un constructor por defecto y un constructor con parámetros, todos los de la clase.
//  Los métodos get que permitan acceder a los atributos.
//  Los métodos set que permitan modificar los atributos.
//  Un método mostrarCarta() que muestre por pantalla de qué carta se trata con el siguiente formato
// es el <numero> de <palo> donde el número y el palo corresponden a los atributos de la carta con
// las siguientes particularidades:
// o El palo del número deberá mostrarse al completo, es decir, se deberá sustituir la letra del palo
// por el palo en cuestión (Corazones, Picas, Rombos o Tréboles).
// o Si el número de la carta está entre 2 y 10 se mostrará normalmente. Para el resto de los
// números 1, 11, 12, 13 se cambiará respectivamente por As, Jack, Reina, Rey.
//  Un método compararCarta que reciba una carta como argumento y la compare con la actual,
// devolviendo cuál de ellas es la ganadora. Para esto se comprobará en primer lugar el número de
// las cartas, si son distintos ganará la mayor y si son iguales se compararán los palos. El orden de
// victoria de los palos es Trébol, Rombos, Picas, Corazones. Este método devolverá un int que tendrá
// tres posibles valores:
// o 1 Si gana la carta del this.
// o 0 Si las dos cartas son iguales.
// o -1 Si gana la carta que llega como parámetro.

package programaciontareas.src.main.java.programacion.TEMA6;

public class Carta {

  private int numero;
  private String palo;

  public Carta() {
    this.numero = 1;
    this.palo = "C";
  }

  public Carta(int numero, String palo) {
    this.numero = numero;
    this.palo = palo;
  }

  public int getNumero() {
    return numero;
  }

  public String getPalo() {
    return palo;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public void setPalo(String palo) {
    this.palo = palo;
  }

  public void mostrarCarta() {
    String paloCompleto = "";
    switch (this.palo) {
      case "C":
        paloCompleto = "Corazones";
        break;
      case "P":
        paloCompleto = "Picas";
        break;
      case "R":
        paloCompleto = "Rombos";
        break;
      case "T":
        paloCompleto = "Tréboles";
        break;
    }
    String numeroCompleto = "";
    switch (this.numero) {
      case 1:
        numeroCompleto = "As";
        break;
      case 11:
        numeroCompleto = "Jack";
        break;
      case 12:
        numeroCompleto = "Reina";
        break;
      case 13:
        numeroCompleto = "Rey";
        break;
      default:
        numeroCompleto = String.valueOf(this.numero);
        break;
    }
    System.out.println("Es el " + numeroCompleto + " de " + paloCompleto);
  }

  public int compararCarta(Carta carta) {
    int resultado = 0;
    if (this.numero > carta.getNumero()) {
      resultado = 1;
    } else if (this.numero < carta.getNumero()) {
      resultado = -1;
    } else {
      switch (this.palo) {
        case "T":
          resultado = 1;
          break;
        case "R":
          if (carta.getPalo().equals("T")) {
            resultado = -1;
          } else {
            resultado = 1;
          }
          break;
        case "P":
          if (carta.getPalo().equals("T") || carta.getPalo().equals("R")) {
            resultado = -1;
          } else {
            resultado = 1;
          }
          break;
        case "C":
          if (
            carta.getPalo().equals("T") ||
            carta.getPalo().equals("R") ||
            carta.getPalo().equals("P")
          ) {
            resultado = -1;
          } else {
            resultado = 1;
          }
          break;
      }
    }
    return resultado;
  }
}
