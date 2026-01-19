package OOP;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private final List<Item> listaElementos = new ArrayList<>();

    public void mostrarInventario(){
        for (Item item : listaElementos){
            System.out.println(item.devolverDetalles());
        }
    }

    public void añadirElementos(Item itemAñadir){
        listaElementos.add(itemAñadir);
    }
}
