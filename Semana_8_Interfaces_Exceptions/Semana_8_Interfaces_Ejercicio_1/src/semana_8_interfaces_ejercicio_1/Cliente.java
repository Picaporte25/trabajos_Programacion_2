/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana_8_interfaces_ejercicio_1;

/**
 *
 * @author Avernal
 */
public class Cliente implements Notificable {
    private String nombre;
    
    public Cliente(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }

    @Override
    public void notificar(String mensaje) {
        System.out.println(nombre+" Le informamos que: "+mensaje );
    }
    
    
    
}
