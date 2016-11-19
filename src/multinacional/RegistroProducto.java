/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multinacional;

import java.util.ArrayList;

public final class RegistroProducto {
    
    private final static RegistroProducto registra= new RegistroProducto();
    private static ArrayList<Producto> productos;
   
    
    private RegistroProducto() {
    productos= new ArrayList<Producto>();
    }
    
//Llama a la instancia del constructor y crea el ArrayList
    public static RegistroProducto getRegistra() {
        return registra;
    }
    
 // agregamos y valida si el producto que vamos agregar ya existe.
    public static void agregaProducto(Producto producto){
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).equals(producto)) {
                System.out.println("Este Producto ya existe");
                return;
            }
        }
    productos.add(producto);
        System.out.println("Producto agregado");
    }
    
    //Busca si hay un producto en stock.
   public static boolean buscarProducto(String codigo){
        boolean valida= false;  
       for (int i = 0; i < productos.size(); i++) {
             if (codigo.equals(productos.get(i).getCodigo())) {
                 valida=true;
                 System.out.println("El Producto se encuentra en coleccion");
                 return valida;
             }
             }
       if (valida==false) {
           System.out.println("El producto no se encuentra en colección");
       }
         return valida;
       }
  public static void mostrarProducto(){
      for (Producto producto : productos) {
          System.out.println(producto.toString());
      }
  }

  public static void eliminarProducto(String codigo){
      for (Producto producto : productos) {
          if (producto.getCodigo().equals(codigo)) {
            productos.remove(producto);
              System.out.println("1 producto ha sido removido");
            return;
          }
      }
  }
   
}
