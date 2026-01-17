/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana_8_interfaces_ejercicio_1;

/**
 *
 * @author Avernal
 */
public class TarjetaDeCredito implements Pago{

    @Override
    public double procesarPago(double monto) {
        if (monto < 0) {
            throw new IllegalArgumentException("El monto debe ser superior a 0");
        }
        double cargo = monto* 0.10;
        double montoTotal = monto + cargo;
        
        System.out.println("Monto total: $"+montoTotal+" con la recarga de: $" +cargo);
        return montoTotal;
    }
    
}
