/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana_8_interfaces_ejercicio_1;

import java.util.ArrayList;

/**
 *
 * @author Avernal
 */
    public class Pedido implements Pagable{
    private double billetera;    
    private Cliente cliente;
    private Pago metodoDePago;
    private String estado;
    private ArrayList<Producto> lista;



   //pago con TARJETA CREDITO
    public Pedido(Cliente cliente, Pago metodoDePago,double billetera) {
    this.cliente = cliente;
    this.metodoDePago = metodoDePago;
    this.billetera = billetera;
    this.estado = "PENDIENTE";
    this.lista = new ArrayList<>();
}
    // confirma el pago 
        public void confirmarPago(){
        // se almacena el total de la lista en una variable llamada total, para que asi se evalue en el if else se sepa que pasara luego...
        double total =  calcularTotal();
        if ( billetera >= total ) {
            metodoDePago.procesarPago(total);
            cambiarEstado("PAGADO");
        
        }else{
            throw new IllegalArgumentException("No se puede completar la transaccion, saldo insuficiente");
        }
       
        
    }
    
    // cambia de estado
    private void cambiarEstado(String nuevoEstado){
        String estadoAnterior= this.estado;
        this.estado = nuevoEstado;
        cliente.notificar("Tu pedido ha cambiado de: "+estadoAnterior+" a el estado de: "+ nuevoEstado);
    }
    
   public void agregarProducto(Producto producto){
       lista.add(producto);
       System.out.println("Producto: "+producto.getNombre() +", agregado "+" $"+producto.calcularTotal());
   }
    
    @Override
    public double calcularTotal() {
        double total=0;
        for (Producto producto : lista) {
            total += producto.calcularTotal();
        }
        
        return total; 
    }

    public String getEstado() {
        return estado;
    }

    public ArrayList<Producto> getLista() {
        return lista;
    }

   
    
        
    
}
