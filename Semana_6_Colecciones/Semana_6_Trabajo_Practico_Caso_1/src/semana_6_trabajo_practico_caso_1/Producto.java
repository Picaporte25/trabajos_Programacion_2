/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana_6_trabajo_practico_caso_1;

/**
 *
 * @author Avernal
 */
public class Producto {
private String id  ; //Identificador único del producto.
private  String nombre; // Nombre del producto.
private  double precio; //Precio del producto.
private  int cantidad; //Cantidad en stock.
private  CategoriaProducto categoria; // Categoría del producto.

    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) { //constructor...
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }

 public int obtenerStock(){ //muestra la cantidad de stock que hay del producto
     return this.cantidad;
 }
public String getId(){ // muestra el id del producto
    return this.id;
}

public double obtenerPrecio(){
    return this.precio;
}
    public CategoriaProducto getCategoria() { //te muestra el Tipo de Categoria de producto que tiene 
        return categoria;
    }

 
public void reemplazarCantidad(int cantidad){ // sirve para reemplazar la cantidad de stock del producto 
    
   this.cantidad=cantidad;
}
public void mostrarInfo(){
    
    System.out.print("ID: "+ this.id+",");
    System.out.print(" Nombre del producto: "+ this.nombre+",");
    System.out.print(" Precio del producto: "+ this.precio+",");
    System.out.print(" Cantidad en stock: "+ this.cantidad+",");
    System.out.print(" Categoria del producto: "+ this.categoria.getDescripcion()+"/");
    System.out.print("\n");
    
    
}




}
