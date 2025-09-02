/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana_3_ejercicio_4;

/**
 *
 * @author Avernal
 */
public class Semana_3_Ejercicio_4 {

  
    public static void main(String[] args) {
      
        Gallina gallina_1 = new Gallina("Gallina ponedora 1");
        Gallina gallina_2 = new Gallina("Gallina ponedora 2");
        
        gallina_1.envejecer();
        gallina_1.mostrarEstado();
        gallina_2.envejecer();
        gallina_2.envejecer();
        gallina_2.mostrarEstado();
        gallina_1.ponerHuevos();
        gallina_1.ponerHuevos();
        gallina_1.ponerHuevos();
        gallina_1.mostrarEstado();
        
    }
    
}
