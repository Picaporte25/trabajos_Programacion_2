/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_7_herencia_ejercicio_2;

/**
 *
 * @author Avernal
 */
public class Circulo  extends Figura{
    private double radio;
    
    
    
    public Circulo(String nombre,double radio) {
        super(nombre);
        this.radio = radio;
    }

    
    @Override
    public double calcularArea() {
      double resultado = Math.PI * this.radio * this.radio;
        return  resultado;
    }

   
    }
    
    
    

