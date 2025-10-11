/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml_ejercicio_1;

/**
 *
 * @author Avernal
 */
public class Titular {
  private  String nombre;
  private String DNI;
  private Pasaporte pasaporte;

    public Titular(String nombre, String DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
       
    }

    public Titular(String nombre, String DNI, Pasaporte pasaporte) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.pasaporte = pasaporte;
    }

  

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public Pasaporte getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
    }

    @Override
    public String toString() {
        return "Titular{" + "nombre=" + nombre + ", DNI=" + DNI + '}';
    }
  

   
          
}
