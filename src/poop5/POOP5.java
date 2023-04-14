/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop5;

/**
 * Este es el main donde se ejecuta a las demas clases
 * @author Jesús Alonso
 */
public class POOP5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona per1 = new Persona();
        per1.setNombre("Alonso");
        per1.setApellido("Martínez");
        Fecha f1 = new Fecha();
        f1.setDia(24);
        f1.setMes(12);
        f1.setAnio(2002);
        per1.setfNacimiento(f1);
        System.out.println(per1.getNombre());
        System.out.println(per1.getApellido());
        System.out.println(per1.getfNacimiento().getDia());
        System.out.println(per1.getfNacimiento().getMes());
        System.out.println(per1.getfNacimiento().getAnio());
        System.out.println(per1); //lama directamente al metodo toString()
        System.out.println(per1.toString());
        
        Persona per2 = new Persona("Jesús","Araujo",f1);
        System.out.println(per2.getNombre());
        System.out.println(per2);
        
        Persona per3 = new Persona("Jesús Alonso", "Martínez Araujo", 24,12,2002);
        System.out.println(per3);
        
        //String cadena = new String("Soy una cadena"); no es necesario ponerlo asÃ¬ porque ya esta incluido el mÃ¨todo
        String cadena = "Soy una cadena";
        System.out.println(cadena);
        Persona per4 = new Persona("Robert","Suarez",new Fecha(27,9,2003));
        System.out.println(per4);
    }
    
}
