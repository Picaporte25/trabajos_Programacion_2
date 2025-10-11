/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uml_ejercicio_2;

/**
 *
 * @author Avernal
 */
public class UML_ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       Usuario usuario= new Usuario("Elisa","DNI:1234");
       Bateria bateria = new Bateria("Bateria xqw",4);
       Celular celular = new Celular ("Movistar","Samsung","A-35",bateria,usuario);
       
        usuario.setCelular(celular);
        System.out.println("El celular es de esta marca: "+celular.getMarca());
        System.out.println("el usuario completo es: "+usuario.toString());
       
               
               
        
        
        
        
    }
    
}
