/*
Vamos a trabajar con barajas de cartas, desarrollando:
Parte A
Desarrolla una clase CartaGenerica que tenga dos atributos:
• palo, como cadena de texto, que será el palo de la carta.
• número, como entero, que será el número de la carta.
Además de esto la clase deberá tener los siguientes atributos:
• Un constructor por defecto y otro que reciba todos los atributos como argumento.
• Los métodos get y set de todos los atributos.
• Un método mostrarCarta que muestre por pantalla el siguiente mensaje:
La carta es el <número> de <palo>
*/


package programaciontareas.src.main.java.programacion.TEMA9;

public class CartaGenerica {
    
    private String palo;
    
    private int numero;
    
    public CartaGenerica() {
        this.palo = "";
        this.numero = 0;
    }
    public CartaGenerica(String palo, int numero) {
        this.palo = palo;
        this.numero = numero;
    }
    
    public String getPalo() {
        return this.palo;
    }
    public void setPalo(String palo) {
        this.palo = palo;
    }
    public int getNumero() {
        return this.numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }    
    public void mostrarCarta() {
        System.out.println("La carta es el " + this.numero + " de " + this.palo);
    }
} 
