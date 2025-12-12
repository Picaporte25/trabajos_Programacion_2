/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp_7_herencia_ejercicio_3;

import java.awt.BorderLayout;
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
        ArrayList<Empleado> lista = new ArrayList<>(); // creacion de la lista de empelados
        
       // creacion de objetos, empleado planta cobran 20 la hora, y empleado temporal cobran 10 la hora.
lista.add(new EmpleadoPlanta("Gabriel",45));
lista.add(new EmpleadoTemporal("Lucia",20));
        //ciclo que recorre la lista de empleados
for (Empleado empleado : lista) {
        // utilizacion de instanceof para verificar que cada empleado sea de un tipo de dato esperado ( Empleado planta o EmpleadoTemporal)
            if (empleado instanceof EmpleadoPlanta) {
                System.out.println(
                        "El sueldo del empleado de planta llamado: " + empleado.getNombre()+
                        " es de: $"+empleado.calcularSueldo());
            }else if (empleado instanceof EmpleadoTemporal){
                 System.out.println(
                        "El sueldo del empleado temporal llamado: " + empleado.getNombre()+
                        " es de: $"+empleado.calcularSueldo());
            }
        }
       
        
      
        
    }
    
}
