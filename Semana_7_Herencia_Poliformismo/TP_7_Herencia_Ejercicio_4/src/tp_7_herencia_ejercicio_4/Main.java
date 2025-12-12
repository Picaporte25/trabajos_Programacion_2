/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp_7_herencia_ejercicio_4;

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
        ArrayList<Animal> lista= new ArrayList<>(); // creacion de lista para animales   
        //creacion de objetos 
        lista.add(new Perro("Perro"));
        lista.add(new Gato("Gato"));
        lista.add(new Vaca("Vaca"));
        
        for (Animal animal : lista) { //for each que recorre la lista de animales y llama a sus metodos 
            animal.describirAnimal();
            animal.hacerSonido();
            System.out.println(""); // espacio en blanco para separar cada animal en cada vuelta
        }
    }
    
}
