/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana_3_ejercicio_.pkg2;

/**
 *
 * @author Avernal
 */
public class Mascota {
    String nombre;
    String especie;
    int edad;
   
    
    public void mostrarInfo(){
        System.out.println(" Nombre: "+nombre+ " Especie: " +especie+ " Edad: " + edad+" Anios");
    }

    public int cumplirAnios(){
        edad++;
        return edad;
    }
}
