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
public interface ProductoDescontable {
    double PORCENTAJEDESCUENTO=0.13;
    
    int calcularDescuento(String horario, String marca);
}
