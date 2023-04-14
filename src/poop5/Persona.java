/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;

/**
 * En esta clase se le asigna nombre 
 * y fecha de nacimiento a la persona
 * @author alons
 */
public class Persona {
    private String nombre;
    private String apellido;
    private Fecha fNacimiento;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Fecha fNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fNacimiento = fNacimiento;
    }

    public Persona(String nombre, String apellido, int dia, int mes, int anio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fNacimiento = new Fecha(dia,mes,anio);
    }
    
    public String getNombre(){
        return nombre;
     /**
     * Metodo que muestra el nombre
     * @return un valor de tipo String
     */
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
      /**
     * Metodo que asigna el nombre
     * @param nombre  Parametro de tipo String
     */
    }

    public String getApellido() {
        return apellido;
      /**
     * Metodo que muestra el apellido
     * @return un valor de tipo String
     */
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
      /**
     * Metodo que asigna el apellido
     * @param apellido  Parametro de tipo String
     */
    }

    public Fecha getfNacimiento() {
        return fNacimiento;
       /**
     * Metodo que muestra la fecha de nacimiento
     * @return un valor de tipo estructura fNacimiento
     */
    }

    public void setfNacimiento(Fecha fNacimiento) {
        this.fNacimiento = fNacimiento;
      /**
     * Metodo que asigna la fecha de nacimiento
     * @param fNacimiento Parametro de tipo estructura fNacimiento
     */
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", fNacimiento=" + fNacimiento + '}';
    }
}
