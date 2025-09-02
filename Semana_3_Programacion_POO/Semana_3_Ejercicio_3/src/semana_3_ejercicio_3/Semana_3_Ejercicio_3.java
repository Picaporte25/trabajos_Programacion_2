/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana_3_ejercicio_3;

/**
 *
 * @author Avernal
 */
public class Semana_3_Ejercicio_3 {

    public static void main(String[] args) {
    
        Libro libro = new Libro();
       
        libro.setAnioPublicacion(-100);
        libro.setAutor("Inaki");
        libro.setTitulo("Eternauta");
        libro.getAnioPublicacion();
        libro.getAutor();
        libro.getTitulo();
        libro.setAnioPublicacion(1997);
        libro.getAnioPublicacion();
    }
    
}
