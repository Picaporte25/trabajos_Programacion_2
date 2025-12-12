/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_7_herencia_ejercicio_4;

/**
 *
 * @author Avernal
 */
public class Perro extends Animal {

    public Perro(String tipoAnimal) {
        super(tipoAnimal);
    }

    @Override
    public void hacerSonido() {
        System.out.println(
                "Guau GUAU GUAU!!! , TE VOY A MORDER GERO... 'DAME COMIDA O TE MUERDO, ESTOY FURIOSO");
    }

    @Override
    public void describirAnimal() {
        System.out.println("soy un: " +super.getTipoAnimal());
    }
    
}
