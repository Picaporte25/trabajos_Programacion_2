/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana_6_trabajo_practico_caso_2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Avernal
 */
public class Biblioteca {
    private String nombre;
    private List<Libro> libros = new ArrayList<>(); 

    //creacion del constructor
    public Biblioteca(String nombre) {
        this.nombre = nombre;
    }
   


    public void agregarLibro (String isbn, String titulo,int anioPublicacion, Autor autor){ //agregamos los libros a la lista
        if (isbn!= null && titulo != null && anioPublicacion >0 && autor != null) {
           Libro nuevoLibro = new Libro(isbn,titulo,anioPublicacion,autor);
           libros.add(nuevoLibro);
        }
          
        }

    public List<Libro> listarLibros(){ //listar los libros de la lista libros
        System.out.println("Se mostraran los libros de la lista: ");
        for (Libro libro : libros) {
            libro.mostrarInfo();
            System.out.println("------------------------------------------");
        }
        return libros;
    }
   
    public List<Libro> buscarLibroPorIsbn(String isbn){ //Buscar libro por  ISBN STRING
       List<Libro> librito = new ArrayList<>();
        for (Libro libro : libros) {
           if (libro.obtenerISBN().equals(isbn)) { //si coincide isbn se agrega a la lista librito
             librito.add(libro);      
        }
        } 
            return librito;
        }
   public void eliminarLibro(String isbn){ //eliminar libros
       
       for (Libro libro : libros) {
           if (libro.obtenerISBN().equals(isbn)) {
              libros.remove(libro);
               
           }
  
       }
     
    
   }
    
   public int obtenerCantidadLibros(){  //Obtener la cantidad de libros
       int contador=0;
       while (contador < libros.size()) {           
           
           contador++;
       }
       System.out.println("La cantidad de libros que hay es: "+contador+" Libros");
       return contador;
   }

   public  List<Libro> filtrarLibrosPorAnio(int anio){ //metodo que recorre la lista de libros , y obtiene sus anios, los agrega a una lista vacia creada alli mismo
       List<Libro> filtrados = new ArrayList<>();
       for (Libro filtrado : libros) {
           if (filtrado.obtenerAnioPublicacion(anio) == anio) {
               filtrados.add(filtrado);
           }
       }
       
       return filtrados;
   }

public void mostrarAutoresDisponibles(){
    System.out.println("Autores disponibles: ");
    for (Libro libro : libros) {
        libro.mostrarAutoresDisponibles();
    }
}
}


