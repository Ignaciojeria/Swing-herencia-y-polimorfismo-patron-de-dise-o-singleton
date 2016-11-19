package multinacional;


public abstract class Electrodomestico extends Producto implements ProductoDescontable {
    
    private String marca;
    
    public Electrodomestico(String codigo, double precioBase, int stock, String marca) {
        super(codigo, precioBase, stock);
        this.setMarca(marca);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca.length()<2) {
            System.out.println("El nombre de marca debe contener al menos 2 caracteres");
        }else{
         this.marca = marca; 
        }
        
    }
    

    
}
