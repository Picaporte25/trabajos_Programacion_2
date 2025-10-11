/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml_ejercicio_4;

/**
 *
 * @author Avernal
 */
public class Tarjeta_De_Credito {
    private String numero;
    private String fecha_vencimiento;
    private Cliente cliente;
    private Banco banco;

    public Tarjeta_De_Credito(String numero, String fecha_vencimiento, Cliente cliente, Banco banco) {
        this.numero = numero;
        this.fecha_vencimiento = fecha_vencimiento;
        this.cliente = cliente;
        this.banco = banco;
        
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(String fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    @Override
    public String toString() {
        return "Tarjeta_De_Credito{" + "numero=" + getNumero() + 
                ", fecha_vencimiento=" + getFecha_vencimiento() + 
                ", cliente=" + cliente.getNombre()+ 
                ", banco=" + getBanco() + " DNI CLIENTE: "+cliente.getDNI()+'}';
    }
    
    
}
        