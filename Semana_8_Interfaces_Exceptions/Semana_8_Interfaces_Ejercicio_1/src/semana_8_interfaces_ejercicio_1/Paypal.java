/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana_8_interfaces_ejercicio_1;

/**
 *
 * @author Avernal
 */
public class Paypal implements PagoConDescuento{
    

    @Override
    public double aplicarDescuento(double monto) {
        if (monto < 0 ) {
            throw new IllegalArgumentException("No puede ser el monto menor a 0");
        }
        double descuento = monto * 0.05;
        double montoTotal =  monto - descuento ;
        
        
        System.out.println("El monto total es de : $"+montoTotal+" Con el descuento incluido de: $"+descuento);
        return montoTotal;
    } 

   /* @Override
    public double procesarPago(double monto) {
        if (monto < 0) {
            throw new IllegalArgumentException("El monto debe ser superior a 0");
        }
       double montoConDescuento = aplicarDescuento(monto);
       return montoConDescuento;
    }*/
}
   