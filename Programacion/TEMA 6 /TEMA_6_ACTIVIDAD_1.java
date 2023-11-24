
/*
Implementa una clase Carta que represente a una carta de una baraja de póker.
De una carta interesa conocer su número y su palo (almacenado como una única letra).
El número de la carta se deberá representar con un int y el palo con un String de una sola letra.
La clase Carta deberá tener los siguientes métodos:
 Un constructor por defecto y un constructor con parámetros, todos los de la clase.
 Los métodos get que permitan acceder a los atributos.
 Los métodos set que permitan modificar los atributos.
 Un método mostrarCarta() que muestre por pantalla de qué carta se trata con el siguiente formato
es el <numero> de <palo> donde el número y el palo corresponden a los atributos de la carta con
las siguientes particularidades:
o El palo del número deberá mostrarse al completo, es decir, se deberá sustituir la letra del palo
por el palo en cuestión (Corazones, Picas, Rombos o Tréboles).
o Si el número de la carta está entre 2 y 10 se mostrará normalmente. Para el resto de los
números 1, 11, 12, 13 se cambiará respectivamente por As, Jack, Reina, Rey.
 Un método compararCarta que reciba una carta como argumento y la compare con la actual,
devolviendo cuál de ellas es la ganadora. Para esto se comprobará en primer lugar el número de
las cartas, si son distintos ganará la mayor y si son iguales se compararán los palos. El orden de
victoria de los palos es Trébol, Rombos, Picas, Corazones. Este método devolverá un int que tendrá
tres posibles valores:
o 1 Si gana la carta del this.
o 0 Si las dos cartas son iguales.
o -1 Si gana la carta que llega como parámetro.
Realiza un método main en el que se creen 2 cartas, la primera con el constructor por defecto y se inicialice
con los métodos set. La segunda se creará con el constructor con parámetros, habiendo leído por teclado
todos los datos antes. Después se mostrarán ambas cartas con el método mostrarCarta() y se compararán
con el método ‘comparar’. Después de esto se modificará la segunda con los métodos set y se volverán a
mostrar y comparar.
Para el desarrollo de esta actividad debéis de crear un proyecto en NetBeans para realizar el ejercicio.
Recuerda que para crear una clase debes usar la palabra reservada class
*/

public class Main
{
    public static void main(String[] args) {
        System.out.println("Welcome to Online IDE!! Happy Coding :)");
    }
}
class Carta {
    private int numero;
    private String palo;
    
    public Carta() {
        
    }
    public Carta(int numero, String palo){
        this.numero = numero;
        this.palo = palo;
    }
    public int getNumero() {
        return this.numero;
    }
    public String getPalo() {
        return this.palo;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setPalo(String palo) {
        this.palo = palo;
    }
    public void mostrarCarta() {
        String paloCompleto = this.paloCompleto(this.palo);
        String numeroCompleto = this.numeroCompleto(this.numero);
        System.out.println("Es el " + numeroCompleto + " de " + paloCompleto);
    }
    public int compararCarta(Carta cartaAComparar) {
        int numeroCarta = cartaAComparar.getNumero();
        String paloCarta = cartaAComparar.getPalo();
        if(numeroCarta > this.numero) return -1;
        if(numeroCarta < this.numero) return 1;
        // TODO CONTINUAR METODO
    }
    private String paloCompleto(String palo) {
        if(palo == "c") return "Corazones";
        if(palo == "p") return "Picas";
        if(palo == "t") return "Treboles";
        if(palo == "r") return "Rombos";
        return "";
    }
    private String numeroCompleto(int numero) {
        if(numero == 1) return "As";
        if(numero == 11) return "Jack";
        if(numero == 12) return "Reina";
        if(numero == 13) return "Rey";
        return String.valueOf(numero);
    }
}
