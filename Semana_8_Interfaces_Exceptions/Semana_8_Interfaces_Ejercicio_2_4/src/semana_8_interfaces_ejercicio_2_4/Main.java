/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana_8_interfaces_ejercicio_2_4;

import java.util.Scanner;

/**
 *
 * @author Avernal
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
      
        
            try {
            System.out.println("Escribe tu edad: ");
             int edad= Integer.parseInt(input.nextLine());
             if (edad < 0 || edad > 120 ) {
            throw new EdadInvalidaException("tu edad debe ser mayor a 0 o menor a 120");
                                                                                        }
             System.out.println("Tu edad es de: "+edad);
        
            } catch (EdadInvalidaException e) {
                System.out.println(e.getMessage());
        }
            
             
             
              
       

       
        
       
    }
    
}
