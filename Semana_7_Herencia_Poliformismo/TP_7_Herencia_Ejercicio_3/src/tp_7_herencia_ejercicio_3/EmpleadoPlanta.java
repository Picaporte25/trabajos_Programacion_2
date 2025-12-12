/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_7_herencia_ejercicio_3;

/**
 *
 * @author Avernal
 */
public class EmpleadoPlanta extends Empleado{
  private  final double  precioEmpleadoPlanta = 25;

    public EmpleadoPlanta(String nombre, int horasMensuales) {
        super(nombre, horasMensuales);
    }

    
 

   
    
    @Override
    public double calcularSueldo(){
        double sueldo = super.getHorasMensuales() * this.precioEmpleadoPlanta;
       
        return sueldo;
    }

}   
