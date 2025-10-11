/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uml_ejercicio_3;

/**
 *
 * @author Avernal
 */
public class UML_ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Editorial editorial = new Editorial("Rivadavoa","Laspertinas 666");
     Autor autor = new Autor("Elsa"," Argentina");
     Libro libro = new Libro("123432","Las cronicas de Narnia",autor,editorial);
    
        System.out.println("El libro :" + libro.getTitulo()+" Tiene a la editorial: "+editorial.getNombre()+" y su autos es de nacionalidad: "+autor.getNacionalidad());
        System.out.println("");
        System.out.println("");
        System.out.println(" El libro tiene toda esta informacion: "+libro.toString());
    }
    
}
