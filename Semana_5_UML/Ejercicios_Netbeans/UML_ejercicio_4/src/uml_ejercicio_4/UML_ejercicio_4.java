/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uml_ejercicio_4;

/**
 *
 * @author Avernal
 */
public class UML_ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Banco banco = new Banco("Galicia","23545352");
       Cliente cliente= new Cliente("Horacio","40474243");
       Tarjeta_De_Credito tarjeta= new Tarjeta_De_Credito("9900","07/32",cliente,banco);
      
       cliente.setTarjeta(tarjeta);
       
        System.out.println(cliente.getTarjeta());
        
    }
    
}
