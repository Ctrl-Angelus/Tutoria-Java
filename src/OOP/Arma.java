package OOP;

public class Arma extends Item {
    private int daño;
    private int usos;

    public Arma(String nombre, int cantidad, String tipo, int daño, int usos){
        super(nombre, cantidad, tipo);
        this.daño = daño;
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

    public int getDaño(){
        return this.daño;
    }

    public void setDaño(int daño){
        if (daño <= 0){
            System.out.println("El numero de daño no es valido");
        } else {
            this.daño = daño;
        }
    }

    @Override
    public String devolverDetalles() {
        return String.format("Nombre: %s, Cantidad: %d, Tipo: %s, Usos: %d, Daño: %d", getNombre(), getCantidad(), getTipo(), getUsos(), getDaño());
    }
}
