/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uml_ejercicio_11;

/**
 *
 * @author Avernal
 */
public class UML_ejercicio_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Artista artista= new Artista("PHIL ANSELMO","Metal");
        Cancion cancion= new Cancion("5 Minutes Alone - PANTERA",artista);
        Reproductor repro = new Reproductor();
    
        repro.reproducir(cancion);
        System.out.println("Se esta reproduciendo la cancion: "+cancion.getTitulo()+" Cantada por: "+artista.getNombre()+ " Es una cancion de: "+artista.getGenero());
    }
    
}
