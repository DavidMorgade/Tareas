/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//  Dada la clase CuentaCorriente.java (que la encontrarás en un archivo adjunto en el campus).
// Añade una excepción a los métodos retirar e ingresar dinero para no poder retirar o ingresar una cantidad
// negativa y que al utilizar las siguientes instrucciones se muestre dicha excepción:
//  miCuenta.retirarDinero(-2300).
//  miCuenta.ingresarDinero(-1965).

/**
 * Clase que representa una cuenta corriente de un banco
 */
public class CuentaCorriente {

  private String nombre;
  private String cuenta;
  private double saldo;
  private double tipoInteres;

  /**
   * Constructor por defecto
   */
  public CuentaCorriente() {
    this.nombre = "";
    this.cuenta = "";
    this.saldo = 0;
    this.tipoInteres = 0;
  }

  /**
   * Constructor con parámetros
   * @param nombre Nombre del titular de la cuenta
   * @param cuenta Número de cuenta
   * @param saldo Saldo de la cuenta
   * @param tipoInteres Tipo de interés de la cuenta
   */
  public CuentaCorriente(
    String nombre,
    String cuenta,
    double saldo,
    double tipoInteres
  ) {
    this.nombre = nombre;
    this.cuenta = cuenta;
    this.saldo = saldo;
    this.tipoInteres = tipoInteres;
  }

  /**
   * Obtiene el nombre del titular de la cuenta
   * @return Nombre del titular de la cuenta
   */
  public String getNombre() {
    return nombre;
  }

  /**
   * Modifica el nombre del titular de la cuenta
   * @param nombre Nombre del titular de la cuenta nuevo
   */
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  /**
   * Obtiene el número de cuenta
   * @return Número de cuenta
   */
  public String getCuenta() {
    return cuenta;
  }

  /**
   * Modifica el número de la cuenta
   * @param cuenta Nuevo número de cuenta
   */
  public void setCuenta(String cuenta) {
    this.cuenta = cuenta;
  }

  /**
   * Obtiene el saldo de la cuenta
   * @return Saldo de la cuenta
   */
  public double getSaldo() {
    return saldo;
  }

  /**
   * Modifica el saldo de la cuenta
   * @param saldo Nuevo saldo
   */
  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  /**
   * Obtiene el tipo de interés
   * @return Tipo de interés
   */
  public double getTipoInteres() {
    return tipoInteres;
  }

  /**
   * Modifica el tipo de interés de la cuenta
   * @param tipoInteres Nuevo tipo de interés
   */
  public void setTipoInteres(double tipoInteres) {
    this.tipoInteres = tipoInteres;
  }

  /**
   * Ingresa dinero en la cuenta corriente
   * @param cantidad Cantidad a ingresar en la cuenta
   */
  public void ingresarDinero(double cantidad) throws Exception {
    if (cantidad < 0) throw new Exception(
      "No se puede ingresar una cantidad negativa"
    );
    saldo = saldo + cantidad;
  }

  /**
   * Retira dinero de la cuenta corriente
   * @param cantidad Cantidad a retirar de la cuenta
   */
  public void retirarDinero(double cantidad) throws Exception {
    if (cantidad < 0) throw new Exception(
      "No se puede retirar una cantidad negativa"
    );
    saldo = saldo - cantidad;
  }
}
