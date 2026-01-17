/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana_8_interfaces_ejercicio_2_5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Avernal
 */
public class LectorTXT {
    
       public void mostrarTXT(String ruta) throws FileNotFoundException, IOException{
            File archivo = new File(ruta);  
           try(BufferedReader br = new BufferedReader(new FileReader(archivo));) {
            
               System.out.println(br.readLine());
               System.out.println(br.readLine());
           } catch (IOException ioe) {
               System.out.println("Error de Entrada o Salida: " +ioe.getMessage());
               throw new RuntimeException("Error inesperado  en el catch");
           }

       
        
        
}
}