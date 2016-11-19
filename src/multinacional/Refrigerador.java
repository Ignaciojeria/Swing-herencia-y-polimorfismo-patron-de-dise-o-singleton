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
public class Refrigerador extends Electrodomestico {
    private int cantidadPies;
    public Refrigerador(String codigo, double precioBase, int stock, String marca, int cantidadPies) {
        super(codigo, precioBase, stock, marca);
        this.cantidadPies=cantidadPies;
    }

    public int getCantidadPies() {
        return cantidadPies;
    }

    public void setCantidadPies(int cantidadPies) {
        this.cantidadPies = cantidadPies;
    }
    

    @Override
    public int calcularTotal(int cantidadComprada, String horario) {
        int total=0;
        int cantidad=0;
        if (this.validarStock(cantidadComprada)) {
        cantidad=cantidadComprada;
        total=(int)(cantidadComprada+this.getPrecioBase());
        int descuento=this.calcularDescuento(this.getMarca(), horario);
        total=total-descuento;
        //agregando iva
        total=(int)(total*1.19);
        }
        return total;
    }

    @Override
    public int calcularDescuento(String horario, String marca) {
    int descuento=0;
        if (horario.equalsIgnoreCase("diurno") || horario.equalsIgnoreCase("nocturno")) {
        int precioBase=(int)(getPrecioBase());
        if (horario.equalsIgnoreCase("nocturno") && marca.equalsIgnoreCase("acme") && this.cantidadPies==15 ) {
        int precioBaseConDescuento=(int)(precioBase*PORCENTAJEDESCUENTO);
        descuento=precioBase-precioBaseConDescuento;
        }else{
            System.out.println("El horario debe ser nocturno o diurno");
        }  
        }

        return descuento;
    }
    
}
