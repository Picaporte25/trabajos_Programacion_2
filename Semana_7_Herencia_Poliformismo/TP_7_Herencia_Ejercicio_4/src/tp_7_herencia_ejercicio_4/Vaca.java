/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_7_herencia_ejercicio_4;

/**
 *
 * @author Avernal
 */
public class Vaca  extends Animal{

    public Vaca(String tipoAnimal) {
        super(tipoAnimal);
    }

    @Override
    public void hacerSonido() {
         System.out.println(
                "muuuu MUUUU MUUUUUUUUUU!!!!!!!!, tengo miedo gero!!!, pero necesito acercarme a vos para curiosearte, que mieedo que tengo ! ! ");
    }

    @Override
    public void describirAnimal() {
         System.out.println("soy un: " +super.getTipoAnimal());
    }
    
}
