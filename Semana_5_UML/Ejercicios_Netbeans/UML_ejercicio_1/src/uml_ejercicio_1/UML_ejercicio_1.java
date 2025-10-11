/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uml_ejercicio_1;

/**
 *
 * @author Avernal
 */
public class UML_ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Foto foto = new Foto("Foto 4x4","JPG");
        Titular tit = new Titular("Gustavo","4046");
        Pasaporte pas = new Pasaporte("123","15/06/25",foto,tit);
        
        
        System.out.println("El numero de pasaporte es: "+pas.getNumero());
       
        System.out.println("El pasaporte tiene a este titular a su nombre: "+pas.getTitular());
       
        System.out.println("La foto tiene  estos datos: "+foto);
    }
    
}   