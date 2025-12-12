/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_7_herencia_ejercicio_3;

import com.sun.source.tree.InstanceOfTree;

/**
 *
 * @author Avernal
 */
public abstract class Empleado {
    private String nombre;
    private double horasMensuales ;
   

    public Empleado(String nombre, int horasMensuales) {
        this.nombre = nombre;
        this.horasMensuales = horasMensuales;
        
    }

    public String getNombre() {
        return nombre;
    }

    public double getHorasMensuales() {
        return horasMensuales;
    }

   

  
   

    
    
    public abstract double calcularSueldo();
        
    
}
