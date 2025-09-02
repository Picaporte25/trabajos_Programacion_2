/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana_3_ejercicio_5;

/**
 *
 * @author Avernal
 */
public class NaveEspacial {
  private  String nombre; 
  private double combustible=50;

  public NaveEspacial(String nombre){
     this.nombre=nombre;
  }
       public void despegar(){
          if(combustible>=50){
             System.out.println("Podemos despegar!"); 
          }else{
              System.out.println("No podemos despegar porque no tenes suficiente combustible!");
          
          }
                  
            
        }

       public double avanzar(double distancia){
            if (combustible > distancia){
                combustible-=distancia;
                System.out.println("Avanzamos "+distancia+" Mil Kilometros estelares ! ");
 
            }else{
                System.out.println("No podes avanzar mas de lo que tenes de combustible ! ! !");
            }
        return combustible;
       }
                
        public double recargarCombustible(double cantidad)  {
            if (combustible>0 || combustible < 200) {
                combustible += cantidad;
                System.out.println("Hemos cargado "+cantidad+" Mil litros de combustible!");
            }else{
                System.out.println("No puedes cargar mas de 200 litros de combustible y tampoco podes cargar menos de 0 !");
            }
            return combustible;
        }      
        
        public void mostrarEstado(){
            System.out.println("cantidad de combustible: " + combustible +" nombre de la nave: " + nombre);
        }

}
