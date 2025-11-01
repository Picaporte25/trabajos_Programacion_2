/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana_6_trabajo_practico_caso_2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Avernal
 */
public class Semana_6_Trabajo_Practico_caso_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Autor autor1= new Autor("ID:123","Iniaki","Argentino");
      Autor autor2= new Autor("ID:456","Jhon","EEUU");
      Libro libro1 = new Libro("ISBN-1","Eternauta",1997,autor1);
      Libro libro2 = new Libro("ISBN-2","Narnia",2004,autor2);
      Biblioteca biblioteca = new Biblioteca("El hogar del saber y la calidez de la madera");
      
      biblioteca.agregarLibro("ISBN-1", "Eternauta", 1997, autor1);
      biblioteca.agregarLibro("ISBN-2","Narnia",2004,autor2);
      
      System.out.println("Obtener la cantidad de libros: ");
      biblioteca.obtenerCantidadLibros();
       System.out.println("");
      
       List<Libro> variable=biblioteca.listarLibros(); //Creacion de una lista llamada variable, que va a acumular los datos del metodo .listarLibros ( que a su vez tiene otra lista en el metodo)
        for (Libro libro : variable) { //ciclo for buscando recorrer la lista variable 
            libro.mostrarInfo();
        }
     
        System.out.println("");
        System.out.println("Vamos a buscar un libro por su ISBN");
        List<Libro> variableISBN= biblioteca.buscarLibroPorIsbn("ISBN-1");
        for (Libro libro : variableISBN) {
            libro.mostrarInfo();
            
        }
        System.out.println("Vamos a eliminar un libro : ");
       
        biblioteca.eliminarLibro("ISBN-1");
        
       System.out.println("Se elimino el libro ");
        biblioteca.listarLibros();
        System.out.println("");
        System.out.println("Obtener la cantidad de libros: ");
        biblioteca.obtenerCantidadLibros();
        
        System.out.println("");
        
        System.out.println("Mostrar la lista de libros filtrados por anio: ");
        List<Libro> resultadosFiltradosPorAnio = biblioteca.filtrarLibrosPorAnio(2004);
        if (!resultadosFiltradosPorAnio.isEmpty()) {
               for (Libro libro : resultadosFiltradosPorAnio) {
                   libro.mostrarInfo();
            
                }
            }else{  
                System.out.println("La lista de libros esta vacia  ");
            }
       
        System.out.println("");
        
      
        biblioteca.mostrarAutoresDisponibles(); // metodo que devuelve los autores disponibles
    }
    }
    

