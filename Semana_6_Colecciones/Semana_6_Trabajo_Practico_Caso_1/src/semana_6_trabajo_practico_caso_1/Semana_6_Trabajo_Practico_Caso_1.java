/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana_6_trabajo_practico_caso_1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Avernal
 */
public class Semana_6_Trabajo_Practico_Caso_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto prod_1 = new Producto("AB-1","Barra cereal",1000,10,CategoriaProducto.ALIMENTOS);
        Producto prod_2 = new Producto("AB-2","RX 6900 XT",15000,5,CategoriaProducto.ELECTRONICA);
        Producto prod_3 = new Producto("AB-3","Pasta de mani",1000,5,CategoriaProducto.ALIMENTOS);
        Producto prod_4 = new Producto("AB-4","Gomitas",800,50,CategoriaProducto.ALIMENTOS);
        Producto prod_5 = new Producto("AB-5","Velador",3000,2,CategoriaProducto.HOGAR);
        
        Inventario inventario = new Inventario();
         
        inventario.agregarProducto(prod_1);
        inventario.agregarProducto(prod_2);
        inventario.agregarProducto(prod_3);
        inventario.agregarProducto(prod_4);
        inventario.agregarProducto(prod_5);
        
        System.out.println("-   -    -    -    -    -    -");
        System.out.println("Lista de productos: ");
        inventario.listarProductos();
         
        System.out.println("-   -    -    -    -    -    -");
        System.out.println("Busqueda de un producto por ID: ");
        inventario.buscarProductoPorId("AB-2");
        System.out.println("-   -    -    -    -    -    -");
        
        ArrayList<Producto> listaFiltradaPorCategoria = inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS); //Una lista que va a almacenar los productos que se seleccionen
        
        System.out.println("Lista de productos filtrada por categoria: ");
        for (Producto producto : listaFiltradaPorCategoria) {
            producto.mostrarInfo();
           
            System.out.println("-   -    -    -    -    -    -"); 
      
//Creacion de variable para almacenar producto con mayor stock;
       Producto variableMayorStock = inventario.obtenerProductoConMayorStock();
            System.out.println("Alimento con mayor Stock: ");
       variableMayorStock.mostrarInfo();
       
            System.out.println("-   -    -    -    -    -    -");
         
      //Imprimir productos entre un precio y otro:
            System.out.println("Productos entre un precio y otro");
      ArrayList<Producto> productosEntrePrecioyPrecio = inventario.filtrarProductosPorPrecio(100, 900);
            for (Producto producto1 : productosEntrePrecioyPrecio) {
                producto1.mostrarInfo();
            }
            
            System.out.println("-   -    -    -    -    -    -");
            
            //imprimir las categorias disponibles
            System.out.println("Imprimir categorias disponibles: ");
            ArrayList <CategoriaProducto> categoria= inventario.mostrarCategoriasDisponibles();
            for (CategoriaProducto catego : categoria) {
                catego.mostrarInfo();
            }
            
}
    
}   
}