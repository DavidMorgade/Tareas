// Crea la clase llamada Agenda. Esta clase contendrá 5 atributos, de lunes a viernes de tipo String donde se
// introducirán las tareas diarias
//  Crea los 3 constructores, por defecto incializando a 0, por parámetros y por copia.
//  Crea getters y setters
//  Crea el método mostrarDia que acepte un entero del 1 al 5 y muestre por pantalla la información
// de ese día.
// Ahora crea un programa, inicializa una Agenda como tu quieras.
// Crea dos agendas más iguales a la primera Agenda, para hacer la segunda de estas utiliza el constructor
// por copia.
// Muestra todos los días de las Agendas para ver que son iguales
package programaciontareas.src.main.java.programacion.TEMA7;

public class Agenda {

  private String lunes;
  private String martes;
  private String miercoles;
  private String jueves;
  private String viernes;

  public Agenda() {
    this.lunes = "";
    this.martes = "";
    this.miercoles = "";
    this.jueves = "";
    this.viernes = "";
  }

  public Agenda(
    String lunes,
    String martes,
    String miercoles,
    String jueves,
    String viernes
  ) {
    this.lunes = lunes;
    this.martes = martes;
    this.miercoles = miercoles;
    this.jueves = jueves;
    this.viernes = viernes;
  }

  public Agenda(Agenda agenda) {
    this.lunes = agenda.lunes;
    this.martes = agenda.martes;
    this.miercoles = agenda.miercoles;
    this.jueves = agenda.jueves;
    this.viernes = agenda.viernes;
  }

  public String getLunes() {
    return lunes;
  }

  public String getMartes() {
    return martes;
  }

  public String getMiercoles() {
    return miercoles;
  }

  public String getJueves() {
    return jueves;
  }

  public String getViernes() {
    return viernes;
  }

  public void setLunes(String lunes) {
    this.lunes = lunes;
  }

  public void setMartes(String martes) {
    this.martes = martes;
  }

  public void setMiercoles(String miercoles) {
    this.miercoles = miercoles;
  }

  public void setJueves(String jueves) {
    this.jueves = jueves;
  }

  public void setViernes(String viernes) {
    this.viernes = viernes;
  }

  public void mostrarDia(int dia) {
    switch (dia) {
      case 1:
        System.out.println("Lunes: " + this.lunes);
        break;
      case 2:
        System.out.println("Martes: " + this.martes);
        break;
      case 3:
        System.out.println("Miercoles: " + this.miercoles);
        break;
      case 4:
        System.out.println("Jueves: " + this.jueves);
        break;
      case 5:
        System.out.println("Viernes: " + this.viernes);
        break;
      default:
        System.out.println("Día no válido");
        break;
    }
  }
}
