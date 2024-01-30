package programacion.TEMA10;

public class Profesor extends Persona {

  public Profesor(String nombre, String apellido1, String apellido2) {
    super(nombre, apellido1, apellido2);
  }
}

class Prueba2 {

  public static void main(String[] args) {
    Profesor javier = new Profesor("javier", "1", "2");

    System.out.println(javier.toString());
  }
}
