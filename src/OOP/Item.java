package OOP;

public abstract class Item {
    private String nombre = "general";
    private int cantidad = 1;
    private String tipo = "normal";

    public Item(String nombre, int cantidad, String tipo){
        setNombre(nombre);
        setCantidad(cantidad);
        setTipo(tipo);
    }

    public void setNombre(String nombre){
        this.nombre = nombre.toLowerCase();
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setCantidad(int cantidad){
        if (cantidad >= 0){
            this.cantidad = cantidad;
        } else {
            System.out.println("No puede haber menos de cero elementos");
        }
    }

    public int getCantidad(){
        return this.cantidad;
    }

    public void setTipo(String tipo){
        this.tipo = tipo.toLowerCase();
    }

    public String getTipo(){
        return this.tipo;
    }

    public abstract String devolverDetalles();
}
