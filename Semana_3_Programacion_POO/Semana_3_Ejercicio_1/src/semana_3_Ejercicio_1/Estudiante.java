/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana_3_utn;

/**
 *
 * @author Avernal
 */
public class Estudiante {
       private String nombre;
       private String apellido;
       private String curso;
       private double calificacion;
   
       public double setCalificacion(double nota){
           if(nota >0 && nota <11){
               calificacion = nota; 
           }
           return calificacion;
       }
       
       
       public void getInfo(){
      System.out.println("Nombre: "+ nombre + " Apellido: "+ apellido + " Curso: " + curso + " Calificacion: " +calificacion);
  
  }      
      
 public double subirCalificacion(double puntos){
        if(puntos<calificacion){
            calificacion += puntos;     
 }
        return calificacion;
 }
  
 
 public double bajarCalificacion(double puntos){
        if(calificacion > puntos){
            calificacion -= puntos;
        }
        return calificacion;
    
  
  
  }
 
    
}
  

