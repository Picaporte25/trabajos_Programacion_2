/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana_6_trabajo_practico_caso_2;

/**
 *
 * @author Avernal
 */
public class Libro {
    private String isbn ;
    private String titulo ;
    private int anioPublicacion ;
    private Autor autor ;

    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }
    
    
    public String mostrarNombreDelLibro(){
        return this.titulo;
    }
    public void mostrarInfo(){
        System.out.println("Isbn: " +this.isbn+" Titulo: "+this.titulo+" Año Publicacion: "+this.anioPublicacion);
        System.out.print(""); 
        this.autor.mostrarInfo();
        System.out.println("--------------------------------------------------------");
               
    }
    public String obtenerISBN(){
        return this.isbn;
    }
public int obtenerAnioPublicacion(int anio){ // devuelve el anio del libro
    return this.anioPublicacion;
}
  public  void mostrarAutoresDisponibles()  {
      this.autor.mostrarInfo();
  }
}
