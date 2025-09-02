/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana_3_ejercicio_3;

/**
 *
 * @author Avernal
 */
public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;
    
    
 public String setTitulo(String titulo){
        if (titulo != null) {
         this.titulo = titulo;
     }
        return titulo;
 } 
     
 public void getTitulo(){
     System.out.println("Titulo: "+titulo);
 }
 
 public String setAutor(String autor){
     if (autor!=null) {
         this.autor= autor;
     }
 return autor;
 }

 public void getAutor(){
     System.out.println("Autor: "+autor);

}


public int setAnioPublicacion(int anio){
        if (anio >0) {
        this.anioPublicacion =anio;
     }
        return anioPublicacion;
 } 


public void getAnioPublicacion(){
     System.out.println("Anio publicacion: "+anioPublicacion);

}


}