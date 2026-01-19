package OOP;

public class Comida extends Item {
    private final int recuperacion;
    private int usos;

    public Comida(String nombre, int cantidad, String tipo, int recuperacion, int usos){
        super(nombre, cantidad, tipo);
        this.recuperacion = recuperacion;
        this.usos = usos;
    }

    public void setUsos(int usos){
        if (usos <= 0){
            System.out.println("El numero de usos no es valido");
        } else {
            this.usos = usos;
        }
    }

    public int getUsos(){
        return this.usos;
    }

    public int getRecuperacion(){
        return this.recuperacion;
    }


    @Override
    public String devolverDetalles() {
        return String.format("Nombre: %s, Cantidad: %d, Tipo: %s, Usos: %d, Recuperacion: %d", getNombre(), getCantidad(), getTipo(), getUsos(), getRecuperacion());
    }
}
