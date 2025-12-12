/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp_7_herencia_ejercicio_2;

import java.util.ArrayList;

/**
 *
 * @author Avernal
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    ArrayList<Figura> lista = new ArrayList<>(); //creacion del array 
    
    lista.add(new Circulo("Circulo",4));
    lista.add(new Rectangulo("Cuadrado",4,5));
    
        for (Figura figura : lista) {
            System.out.println(" El area de: "+ figura.getNombre() + " es de: "+ figura.calcularArea());
            
        }
    
    }
    
}
