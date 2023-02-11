package Principal;

import java.util.ArrayList;

public class Garaje {

    private ArrayList<Coche> listaCoches = new ArrayList<Coche>();

    public void agregarCoche(Coche coche) {
        listaCoches.add(coche);
    }

    public void mostrarCoches() {
        int i = 1;
        for (Coche coche : listaCoches) {
            System.out.println("Coche " + i + ": " + coche);
            i++;
        }
    }
}
