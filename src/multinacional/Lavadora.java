package multinacional;

public class Lavadora extends Electrodomestico{
    private char carga;
   
    public Lavadora(String codigo, double precioBase, int stock, String marca, char carga) {
        super(codigo, precioBase, stock, marca);
        this.carga=carga;
    }

    public char getCarga() {
        return carga;
    }

    public void setCarga(char carga) {
        if (carga=='A' || carga=='C' || carga=='a' || carga=='c') {
        this.carga = carga;  
        }else{
            System.out.println("La carga debe ser A O C");
        }
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
        if (horario.equalsIgnoreCase("nocturno") && marca.equalsIgnoreCase("zoni") && (this.carga=='a' || this.carga=='A') ) {
        int precioBaseConDescuento=(int)(precioBase*0.11);
        descuento=precioBase-precioBaseConDescuento;
        }else{
            System.out.println("El horario debe ser nocturno o diurno");
        }  
        }

        return descuento;
    }




    
}
