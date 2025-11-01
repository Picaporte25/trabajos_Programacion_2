/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana_6_trabajo_practico_caso_2;

/**
 *
 * @author Avernal
 */
public class Autor {
   private String  id;
   private String nombre;
   private String nacionalidad;

    public Autor(String id, String nombre, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }
   
   
   
   public void mostrarInfo(){    // Muestra la información del autor en consola.
       System.out.println("ID: "+this.id +" nombre:  "+this.nombre+ " Nacionalidad: " +this.nacionalidad);
   }
   
   
}