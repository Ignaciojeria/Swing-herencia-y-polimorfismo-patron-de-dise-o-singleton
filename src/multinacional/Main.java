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
    Producto producto= new Lavadora("A23", 300, 0, "Fenza", 'A');
    
        System.out.println(producto.validarStock(1));
    }
    
}
