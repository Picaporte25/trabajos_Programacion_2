/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo_practico_poo;

/**
 *
 * @author Avernal
 */
public class Empleado {
   private int id; //Identificador único del empleado
   private String nombre; //Nombre completo.
   private String puesto; // Cargo que desempeña.
   private double salario; // Salario actual
   private static int totalEmpleados = 0; //Contador global de empleados creados
   
   private int cantidadFija=5000; // salario fijo
   
    
    
   public Empleado(int id,String nombre,String puesto,double salario){ // metodo con todos los argumentos como parametros
       this.id=id;
       this.nombre=nombre;
       this.puesto=puesto;
       this.salario=salario;
       totalEmpleados++;
       
   }
   
   public Empleado(String nombre,String puesto){ // metodo con solo 2  argumentos como parametros y los demas de forma automatica
       this.id=++totalEmpleados; //Generador de id automatico reciclando el total de empleados
       this.nombre=nombre;
       this.puesto=puesto;
       this.salario=10500;
       
   }

    public void actualizarSalario(int salario) {//Metodo con cantidad fija
        this.salario = cantidadFija;
        
    }

    public void actualizarSalario(double porcentaje) { //metodo con cantidad porcentaje
        this.salario+=salario*porcentaje;
        
    }

    public static int mostrarTotalEmpleados(){ // Creacion del metodo Static mostrar empleados
        return totalEmpleados;
    }
    
   
    
    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario +  '}';
    }

    //Getters y setters
    
    
    public void setID(int id){ //Poner id
        this.id=id;
    }
    public int getID(){ //Obetener id
        return id;  
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }
     
    public void setPuesto(String puesto){
        this.puesto=puesto;
    }
    public String getPuesto(){
        return puesto;
    }
    
    public void setSalario(double salario){
        this.salario=salario;
    }
    public double getSalario(){
        return salario;
    }
}
