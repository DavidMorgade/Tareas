// Realiza un método main en el que se creen 2 cartas, la primera con el constructor por defecto y se inicialice
// con los métodos set. La segunda se creará con el constructor con parámetros, habiendo leído por teclado
// todos los datos antes. Después se mostrarán ambas cartas con el método mostrarCarta() y se compararán
// con el método ‘comparar’. Después de esto se modificará la segunda con los métodos set y se volverán a
// mostrar y comparar.
// Para el desarrollo de esta actividad debéis de crear un proyecto en NetBeans para realizar el ejercicio.
// Recuerda que para crear una clase debes usar la palabra reservada class.

public class Main {

  public static void main(String[] args) {
    Carta carta1 = new Carta();
    carta1.setNumero(1);
    carta1.setPalo("C");
    Carta carta2 = new Carta(1, "C");
    carta1.mostrarCarta();
    carta2.mostrarCarta();
    System.out.println(carta1.compararCarta(carta2));
    carta2.setNumero(2);
    carta2.setPalo("P");
    carta1.mostrarCarta();
    carta2.mostrarCarta();
    System.out.println(carta1.compararCarta(carta2));
  }
}
