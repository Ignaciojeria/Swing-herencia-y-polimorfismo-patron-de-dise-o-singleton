/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multinacional;

/**
 *
 * @author Sir Ignacio
 */
public class Main {
    public static void main(String[] args) {
    Producto producto1= new Lavadora("A23", 300, 30, "Fenza", 'A');
    Producto producto2= new Lavadora("A23", 300, 30, "Fenza", 'A');
    
        System.out.println(producto1.validarStock(1));
        
        RegistroProducto registro= RegistroProducto.getRegistra();
        
        registro.agregaProducto(producto1);
        registro.agregaProducto(producto2);
        registro.buscarProducto("A23");
        registro.mostrarProducto();
        System.out.println("----------------------");
        registro.eliminarProducto("A23");
        registro.mostrarProducto();
    }
    
}
