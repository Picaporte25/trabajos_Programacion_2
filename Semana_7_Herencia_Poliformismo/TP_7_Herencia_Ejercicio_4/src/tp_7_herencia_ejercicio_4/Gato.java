/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_7_herencia_ejercicio_4;

/**
 *
 * @author Avernal
 */
public class Gato extends Animal {

    public Gato(String tipoAnimal) {
        super(tipoAnimal);
    }

    @Override
    public void hacerSonido() {
        System.out.println(
                "MIAU MIAU MIAU !! , GERO, ACARICIAME Y DAME COMIDA, TAMBIEN DEJAME ABIERTA LA PUERTA, Y VUELVO EN 1 SEMANA, NO ME MOLESTES");
    }

    @Override
    public void describirAnimal() {
         System.out.println("soy un: " +super.getTipoAnimal());
    }
    
}
