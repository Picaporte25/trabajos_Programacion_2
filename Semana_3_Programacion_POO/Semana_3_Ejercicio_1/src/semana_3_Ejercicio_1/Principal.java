/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana_3_utn;

/**
 *
 * @author Avernal
 */
public class Principal {

    
    public static void main(String[] args) {
        Estudiante e = new Estudiante();
        e.setCalificacion(8);
        
        e.getInfo();
        
        e.bajarCalificacion(2);
        e.getInfo();
        e.subirCalificacion(3);
        e.getInfo();
    }   
    
    
}
