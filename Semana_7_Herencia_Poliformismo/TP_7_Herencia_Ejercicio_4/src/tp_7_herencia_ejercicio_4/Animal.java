/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_7_herencia_ejercicio_4;

/**
 *
 * @author Avernal
 */
public abstract class Animal {
    private String tipoAnimal;

    public Animal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }
    
    
    
    public abstract  void hacerSonido();
    public abstract void describirAnimal();
        
}
