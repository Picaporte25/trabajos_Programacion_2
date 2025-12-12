/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_7_herencia_ejercicio_1;

/**
 *
 * @author Avernal
 */
public class Auto extends Vehiculo {
    private  int cantidadPuertas;   // Atributo
    
    // Constructor
    public Auto(String marca, String modelo, int cantidadPuertas) {
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }
   
    // metodo que se extiende de la SUPER CLASE vehiculo, con su respectivo override
    @Override
    public void mostrarInfo() {
        System.out.println(
                "La marca del auto es: "+ super.getMarca() + 
                        ", el modelo del auto es: " + super.getModelo() + 
                        ", la cantidad de puertas de este auto es de: " + this.cantidadPuertas + " puertas.");
    }
    
}
