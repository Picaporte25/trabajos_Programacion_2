/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana_8_interfaces_ejercicio_2_1;

import java.util.Scanner;

/**
 *
 * @author Avernal
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
       
       
        try {
        System.out.println("Elija un numero entero: ");
        int num1 = input.nextInt();
        
        System.out.println("Elija un segundo entero: ");
        int num2 = input.nextInt();
         int cuenta = num1 / num2;
            System.out.println("El resultado de la cuenta es: "+cuenta);
            
        } catch (ArithmeticException ae) {
            System.out.println("No se puede dividir por '0' ");
        }catch(Exception e){
            System.out.println("Debe ingresar valores numericos");
        }finally{
            System.out.println("Programa finalizado");
        }
        
        
    }
    
}
    