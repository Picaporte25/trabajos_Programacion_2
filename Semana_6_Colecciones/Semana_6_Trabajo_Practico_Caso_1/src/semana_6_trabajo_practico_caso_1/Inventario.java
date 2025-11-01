/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana_6_trabajo_practico_caso_1;

import java.util.ArrayList;

/**
 *
 * @author Avernal
 */
public class Inventario {

    private ArrayList<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto p) { // agregar productos 
        if (p != null) {
            productos.add(p);
        }
        System.out.println("Se agrego:" + p.getCategoria() + " A la lista de productos");
    }

    public void listarProductos() { // muestra los productos de la lista productos por medio de un for each 
            for (Producto producto : productos) {
                producto.mostrarInfo();
        }
        }

    public Producto buscarProductoPorId(String id) { // busca productos por medio de un ciclo for each y retorna el que coincida  de no encontrar nada retorna null
        for (Producto producto : productos) {
            if (producto.getId().equals(id)) {
                producto.mostrarInfo();
                return producto;
        }
        }
        return null;
        }

    public Producto eliminarProductoPorId(String id) { //Eliminar producto por id
        Producto productoEliminado = null;         // asignamos una variable de tipo Producto llamada producto eliminado como NULL       
        for (Producto producto : productos) {    //recorreromos la lista productos para ver si hay algun producto.getid que coincida con ID 
            if (producto.getId().equals(id)) {   // si encuentra un parentezco se se asigna productoEliminado = producto
                productoEliminado = producto;
                break;       // se rompe el for
        }
        }
        if (productoEliminado != null) { //si productoEliminado no es null se remueve ese producto de la lista productos
            productos.remove(productoEliminado);
        }
        return productoEliminado;    //retorna el producto que se elimino
        }

    public void actualizarStock(String id, int nuevaCantidad) { //actualiza el stock, segun el id, va a actualizar ese id con la cantidad que se le pase
        for (Producto producto : productos) {
            if (producto.getId().equals(id)) {
                producto.reemplazarCantidad(nuevaCantidad);
        }
        }
        }

    public ArrayList<Producto> filtrarPorCategoria(CategoriaProducto categoria) { // filtrar por categoria de la lista
        ArrayList<Producto> listaDeProductosFiltrados = new ArrayList<>(); //creamos una nueva lista momentanea que va a almacenar los valores que coincidan
        for (Producto producto : productos) {
            if (producto.getCategoria().equals(categoria)) {
                listaDeProductosFiltrados.add(producto);
        }
        }
          return listaDeProductosFiltrados;  
        }
   
    public int obtenerTotalStock() {
        int total = 0;
        for (Producto producto : productos) {
            total += producto.obtenerStock();
        }

        return total;

       }

    public Producto obtenerProductoConMayorStock() {  // metodo para obtener el producto con mayor stock
        Producto conMayorStock = null;
        for (Producto producto : productos) {
            if (conMayorStock == null || producto.obtenerStock() > conMayorStock.obtenerStock()) {
                conMayorStock = producto;
        }
        }
        
        return conMayorStock;
        }

   public  ArrayList<Producto> filtrarProductosPorPrecio(double min, double max){
       ArrayList<Producto> listaDeProductosFiltradosPorPrecio = new ArrayList<>();
       for (Producto producto : productos) {
            if (producto.obtenerPrecio()>=min && producto.obtenerPrecio()<= max ) {
               listaDeProductosFiltradosPorPrecio.add(producto);
           }
  
       }
       return listaDeProductosFiltradosPorPrecio;
   }
    
    @Override
    public String toString() {
        return "Inventario{" + "productos=" + productos + '}';
    }

    public ArrayList<CategoriaProducto>mostrarCategoriasDisponibles(){
        ArrayList<CategoriaProducto> categoria=new ArrayList<>();
        for (Producto producto : productos) {
           categoria.add(producto.getCategoria());
        }
         
        
        return categoria;
    }
    
}
