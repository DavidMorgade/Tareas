// Crea un programa en Java en el que se declaren variables de tipo Persona, las cuales tendrán un nombre,
// apellidos, si es alumno o profesor, pudiendo mostrar esos datos por pantalla mediante el método toString.
// Ten en cuenta que la clase Persona es una clase abstracta, así que tendrás que crear otras dos llamadas
// Alumno y Profesor.
// Para el desarrollo de esta actividad debéis de crear un proyecto en NetBeans para realizar el ejercicio.
// Recuerda que las clases abstractas no podrán instanciar objetos

package programacion.TEMA10;

public abstract class Persona {

  private String nombre;

  private String apellido1;

  private String apellido2;

  public Persona(String nombre, String apellido1, String apellido2) {
    this.nombre = nombre;
    this.apellido1 = apellido1;
    this.apellido2 = apellido2;
  }

  public String getNombre() {
    return this.nombre;
  }

  public String getApellido1() {
    return this.apellido1;
  }

  public String getApellido2() {
    return this.apellido2;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setApellido1(String apellido1) {
    this.apellido1 = apellido1;
  }

  public void setApellido2(String apellido2) {
    this.apellido2 = apellido2;
  }

  @Override
  public String toString() {
    return (
      "Mi nombre es " +
      this.nombre +
      " y mis apellidos " +
      this.apellido1 +
      " " +
      this.apellido2
    );
  }
}
