/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;

/**
 * En esta clase se inserta la fecha de nacimiento de la persona 
 * @author Jesús Alonso
 */
public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha() {
    }

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        /**
     * Metodo que asigna dia, mes y año a la estructura fNacimiento
     * @param dia  Parametro de tipo int
     * @param mes  Parametro de tipo int
     * @param anio Parametro de tipo int
     */

    }

    public int getDia() {
        return dia;
      /**
     * Metodo que muestra el dia de la estructura fNacimiento
     * @return un valor de tipo int
     */
    }

    public void setDia(int dia) {
        this.dia = dia;
      /**
     * Metodo que asigna el dia a la estructura fNacimiento
     * @param dia Parametro de tipo int
     */
    }

    public int getMes() {
        return mes;
       /**
     * Metodo que muestra el mes de la estructura fNacimiento
     * @return un valor de tipo int
     */
    }

    public void setMes(int mes) {
        this.mes = mes;
       /**
     * Metodo que asigna el mes a la estructura fNacimiento
     * @param mes Parametro de tipo int
     */
    }

    public int getAnio() {
        return anio;
      /**
     * Metodo que muestra el año de la estructura fNacimiento
     * @return un valor de tipo int
     */
    }

    public void setAnio(int anio) {
        this.anio = anio;
        /**
     * Metodo que asigna el año a la estructura fNacimiento
     * @param anio Parametro de tipo int
     */
    }

    @Override
    public String toString() {
        return "Fecha{" + "dia=" + dia + ", mes=" + mes + ", anio=" + anio + '}';
     /**
     * Metodo que realiza una sobrestructura de la estructura Persona
     */
    }
    
}
