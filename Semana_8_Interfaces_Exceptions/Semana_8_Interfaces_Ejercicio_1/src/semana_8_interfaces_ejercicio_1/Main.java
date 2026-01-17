/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana_8_interfaces_ejercicio_1;

import java.util.ArrayList;

/**
 *
 * @author Avernal
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    ArrayList<Producto> listaDeProducto = new ArrayList<>();
    
    Cliente cliente1 = new Cliente("Horacio");
    
    Pago metodoPago = new TarjetaDeCredito();

    Producto p1 = new Producto("BANANA", 10.0);
    Producto p2 = new Producto("MANZANA", 8.0);
    //crear la lista que va a almacenar los productos
    Pedido lista = new Pedido(cliente1,metodoPago,100); // el double aca presenta la billetera del cliente
     
    //agregar productos
    lista.agregarProducto(p1);
    lista.agregarProducto(p2);
        
    //Bucle para imprimir lo que tenga la lista:
    System.out.print("Lista de productos: ");
    for (Producto c : lista.getLista()) {
     listaDeProducto.add(c);
      
     System.out.print(c.getNombre()+", ");
         
    }  
     // Salto de linea
     System.out.println("\n");
     
     // calcula el total del valor de la lista:
     System.out.println("Total monto a pagar: $"+ lista.calcularTotal());
     
     // confirmar el pago o no, dependiendo del saldo de la billetera
     lista.confirmarPago();
     
     
        
     
    }


        
}
