/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml_ejercicio_2;

/**
 *
 * @author Avernal
 */
public class Usuario {
    private String nombre;
    private String DNI;
    private Celular celular;

   

    public Usuario(String nombre, String DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
        
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

    public Celular getCelular() {
        return celular;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", DNI=" + DNI +" Celular: " + celular.getModelo();
    }

  
    





}
