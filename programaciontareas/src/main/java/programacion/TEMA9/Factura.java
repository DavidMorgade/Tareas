// Parte B
// Desarrolla la clase Factura que herede de la clase Presupuesto. Esta clase tendrá un nuevo atributo, que se
// llamará fabricante, el cual será el nombre del fabricante cuyo valor no se podrá modificar. Este valdrá
// “Productos ACME S.L.”. La clase tendrá:
//  Un constructor por defecto y otro que reciba todos los atributos salvo el fabricante como parámetro.
//  Un método obtenerPrecioOficial. Este método calcula el precio oficial de una factura, que es el
// importe del presupuesto más el IVA.
//  Sobreescribe el método imprimirPresupuesto para que muestre la información de la factura de la
// siguiente forma (¿Se puede sobrescribir?, ¿por qué?, en caso negativo soluciónalo).

package programaciontareas.src.main.java.programacion.TEMA9;

public class Factura extends Presupuesto {

  private final String FABRICANTE = "Productos ACME S.L.";

  private final double IVA = 1.21;

  public Factura() {
    super();
  }

  public Factura(String cliente, String descripcion, double importe) {
    super(cliente, descripcion, importe);
  }

  public double obtenerPrecioOficial() {
    return this.getImporte() * this.IVA;
  }

  // No se puede sobrescribir porque el método imprimirPresupuesto() de la clase Presupuesto es final.
  @Override
  public void imprimirPresupuesto() {
    System.out.println("Cliente: " + this.getCliente());
    System.out.println("Descripción: " + this.getDescripcion());
    System.out.println("Importe: " + this.getImporte());
    System.out.println("Fabricante: " + this.FABRICANTE);
  }
}
