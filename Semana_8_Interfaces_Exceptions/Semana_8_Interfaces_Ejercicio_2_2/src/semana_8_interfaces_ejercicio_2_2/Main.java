/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana_8_interfaces_ejercicio_2_2;

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
             System.out.println("Ingrese un numero : "); //El texto deberia ser enteros, ahi esta el chiste
             int texto = Integer.parseInt(input.nextLine()); // se gurda en la variable texto lo que el usuario escriba
             System.out.println(texto);
        } catch (NumberFormatException nf) {    // si hay algun error... entra en el catch y lanza el mensaje
             System.out.println("Debes escribir numeros ");
        }finally{
             System.out.println("Programa finalizado, chau !");
         }
    }
    
}
