/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana_8_interfaces_ejercicio_1;

/**
 *
 * @author Avernal
 */
public class Producto implements Pagable {
    private String nombre;
    private double precio;

    public Producto (String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    
    @Override
    public double calcularTotal() {
        
        return precio;   
    }

 

    
    
}
