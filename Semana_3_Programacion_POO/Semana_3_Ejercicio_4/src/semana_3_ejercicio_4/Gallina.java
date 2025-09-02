/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana_3_ejercicio_4;

/**
 *
 * @author Avernal
 */
public class Gallina {
   private String idGallina="Gallina ponedora";
   private int edad=0  ;
  private  int huevosPuestos=0;

  
   public Gallina(String idGallina){
      this.idGallina = idGallina;
   }
       
  public int envejecer(){
      edad++;
      return edad;
  }

   public int ponerHuevos(){
      huevosPuestos++;
      return huevosPuestos;
  }
  
  public void mostrarEstado(){
      System.out.println("Tipo de gallina: " +idGallina + " Edad: " + edad+ " Cantidad de huevos puestos: "+huevosPuestos);
  }
}


