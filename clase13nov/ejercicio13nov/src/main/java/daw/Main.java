package daw;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Crea una función que devuelva un array de tamaño especificado en el parámetro
        // con número aleatorios entre 1-30
        // Función que recibe un array de números (array del paso 7) y devuelve
        // un nuevo array sin duplicados, IGNORA ESTO, solo los de arriba
        Random random = new Random();

        int juanito = random.nextInt(0, 31);

        for (int i = 0; i < juanito; i++) {

            System.out.println(mamahuevo(juanito));

        }

    }

    public static int[] mamahuevo(int juanito) {

        int[] ArrayInt;

        ArrayInt = new int[juanito];

        Random random = new Random();

        for (int i = 0; i < ArrayInt.length; i++) {

            ArrayInt[i] = random.nextInt(0, 31);

            System.out.println("El tamaño del array es " + ArrayInt.length + " y su posición es " + ArrayInt[i]);

        }

        return ArrayInt;
    }
}