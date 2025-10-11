/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml_ejercicio_3;

/**
 *
 * @author Avernal
 */
public class Libro {
   private String isbn;
   private String titulo;
   private Autor autor;
   private Editorial editorial;

    public Libro(String isbn, String titulo, Autor autor, Editorial editorial) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn es: " + isbn + ", el titulo es: " + getTitulo() + ",  el autor es: " + getAutor() + ", la editorial es: " + getEditorial() + '}';
    }
   
   
}
