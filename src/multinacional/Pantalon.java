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
public class Pantalon extends Producto{
    private String tipo;
    private char sexo;
    
    public Pantalon(String codigo, double precioBase, int stock, String tipo, char sexo) {
        super(codigo, precioBase, stock);
        this.setTipo(tipo);
        this.setSexo(sexo);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo.equalsIgnoreCase("jeans") || tipo.equalsIgnoreCase("cotele") || tipo.equalsIgnoreCase("tela")) {
            this.tipo = tipo;
        }else{
            System.out.println("El tipo debe ser: jeans, cotele o tela");
        }
        
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        if (sexo!='H' || sexo!='M' || sexo!='h' || sexo!='m') {
            System.out.println("El sexo debe ser H o M");
        }else{
        this.sexo = sexo;   
        }
        
    }

    @Override
    public int calcularTotal(int cantidadComprada, String horario) {
        int total=0;
        if (this.validarStock(cantidadComprada)) {
            total= (int)(total*this.getPrecioBase());
        }
        
        return total;
    }
    
    
}
