// Parte A
// Desarrolla una clase Presupuesto. Esta clase tendrá 3 atributos:
//  Cliente, que será una cadena de texto con el nombre del cliente al que se realiza el presupuesto.
//  Descripción, que será una cadena de texto con la descripción de los artículos que se han elegido para
// el presupuesto.
//  Importe, que contendrá el precio de los artículos presupuestados.
// Además, se implementarán los siguientes métodos:
//  Un constructor por defecto, y un constructor que reciba el valor de todos los atributos como
// argumento.
//  Los métodos get y set de todos los atributos.
//  Un método imprimirPresupuesto, que no pueda sobrescribirse

package programacion.TEMA9;

public class Presupuesto {

  private String cliente;
  private String descripcion;
  private double importe;

  public Presupuesto() {
    this.cliente = "";
    this.descripcion = "";
    this.importe = 0;
  }

  public Presupuesto(String cliente, String descripcion, double importe) {
    this.cliente = cliente;
    this.descripcion = descripcion;
    this.importe = importe;
  }

  public String getCliente() {
    return cliente;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public double getImporte() {
    return importe;
  }

  public void setCliente(String cliente) {
    this.cliente = cliente;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public void setImporte(double importe) {
    this.importe = importe;
  }

  public void imprimirPresupuesto() {
    System.out.println("Cliente: " + this.cliente);
    System.out.println("Descripción: " + this.descripcion);
    System.out.println("Importe: " + this.importe);
  }
}
