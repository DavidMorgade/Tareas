package programacion.TEMA10;

public class Alumno extends Persona {

  public Alumno(String nombre, String apellido1, String apellido2) {
    super(nombre, apellido1, apellido2);
  }
}

class Prueba {

  public static void main(String[] args) {
    Alumno alumno = new Alumno(null, null, null);

    System.out.println(alumno.toString());
  }
}
