package OOP;


public class Main {
    public static void main(String[] args){
        Inventario inventario = new Inventario();

        Comida manzana = new Comida("Manzana", 20, "Verde", 30, 2);
        Arma espada = new Arma("Espada", 1, "Ropera", 20, 30);

        inventario.añadirElementos(manzana);
        inventario.añadirElementos(espada);

        inventario.mostrarInventario();

    }
}
