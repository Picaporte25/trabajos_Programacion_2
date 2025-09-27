/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo_practico_poo;

/**
 *
 * @author Avernal
 */
public class Trabajo_Practico_Poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado em1 = new Empleado(1,"Inaki","Programador",10500.0);
        Empleado em2 = new Empleado("Jorge","Analista");
        Empleado em3 = new Empleado("Matias","Sistemas");
        Empleado em4 = new Empleado(4,"Carolina","Server",15500.0);
        
        System.out.println(em1.toString());
        System.out.println(em2.toString());
        System.out.println(em3.toString());
        System.out.println(em4.toString());
        System.out.println("Total de empleados: "+Empleado.mostrarTotalEmpleados());
        
        em1.actualizarSalario(0.10);
        System.out.println(em1.toString());
        System.out.println("");
        
        em3.setNombre("Toto");
        em3.setSalario(500.0);
        System.out.println("");
        
        System.out.println(em1.toString());
        System.out.println(em2.toString());
        System.out.println(em3.toString());
        System.out.println(em4.toString());
        System.out.println("Total de empleados: "+Empleado.mostrarTotalEmpleados());
        
    }
        
}
