/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana_8_interfaces_ejercicio_2_3;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Avernal
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    LectorDeTXT  visor = new LectorDeTXT();
        try {
            visor.mostrarTXT("C:\\Users\\Avernal\\Documents\\NetBeansProjects\\Semana_8_Interfaces_Ejercicio_2_3\\src\\semana_8_interfaces_ejercicio_2_3\\datos.txt");
        } catch (FileNotFoundException fe) {
            System.out.println("No existe este archivo...");
        }
        catch (IOException ex) {
            System.getLogger("Error de entrada o salida");
            System.out.println(ex.getMessage());
        }
    
    }
    
}
