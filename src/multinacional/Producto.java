/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multinacional;

public abstract class Producto {
    private String codigo;
    private double precioBase;
    private int stock;

    public Producto(String codigo, double precioBase, int stock) {
        this.codigo = codigo;
        this.setPrecioBase(precioBase);
        this.setStock(stock);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        if (precioBase<=0) {
            System.out.println("El precio base debe ser mayor a 0");
        }else{
        this.precioBase = precioBase;
        }
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock<0) {
            System.out.println("El stock debe ser mayor o igual a 0");
        }else{
        this.stock = stock;
        }
    }
    public boolean validarStock(int cantidadAcomprar){
        boolean valida=false;
        if (this.stock>0 && this.stock>=cantidadAcomprar) {
        valida=true;    
        }else{
            System.out.println("El stock disponible es: "+ this.stock);
        }
        return valida;
    }
   /* public int calcularTotal(int cantidadComprada, String horario){
        int cantidad=0;
        if (this.validarStock()) {
        cantidad=(int)(cantidadComprada*this.precioBase);  
        }
        return cantidad;
    }*/
    public abstract int calcularTotal(int cantidadComprada, String horario);
   
    public void imprimir(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "codigo=" + codigo + ", precioBase=" + precioBase + ", stock=" + stock + '}';
    }
    
}
