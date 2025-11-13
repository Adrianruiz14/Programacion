package daw;

import java.util.ArrayList;
import java.util.List;

public class ApuntesArray {
    public static void main(String[] args) {
        // Crear una lista (como una caja flexible)
        List<String> lista = new ArrayList<>();

        lista.add("Perro");
        lista.add("Gato");
        lista.add("Loro");

        System.out.println(lista); // [Perro, Gato, Loro]

        String[] array = lista.toArray(new String[0]);

        for (String animal : array) {
    System.out.println(animal);

    }
}
}