/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml_ejercicio_4;

/**
 *
 * @author Avernal
 */
public class Cliente {
    private String nombre;
    private String DNI;
    private Tarjeta_De_Credito tarjeta;

    public Cliente(String nombre, String DNI, Tarjeta_De_Credito tarjeta) {
        this.nombre = nombre;
        this.DNI = DNI;
        
        if (tarjeta != null) {
            this.tarjeta = tarjeta;
        }
    }

    public Cliente(String nombre, String DNI) {
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

    public Tarjeta_De_Credito getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta_De_Credito tarjeta) {
        this.tarjeta = tarjeta;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + getNombre() + ", DNI=" + getDNI() + ", tarjeta=" + tarjeta.getNumero()+ '}';
    }
    
    
}
