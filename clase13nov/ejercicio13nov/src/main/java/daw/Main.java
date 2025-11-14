package daw;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Crea una función que devuelva un array de tamaño especificado en el parámetro
        // con número aleatorios entre 1-30

        // Función que recibe un array de números y devuelve
        // un nuevo array sin duplicados, IGNORA ESTO, solo los de arriba
        Random random = new Random();

        int tamanio = random.nextInt(0, 31);

        int[] ArrayMain;

        ArrayMain = funcion(tamanio);

        for (int i = 0; i < ArrayMain.length; i++) {

            System.out.println(ArrayMain[i]);

        }

        int[] SinDuplicados = recibirArray(ArrayMain);

    }

    public static int[] funcion(int tamanio) {

        int[] ArrayInt;

        ArrayInt = new int[tamanio];

        Random random = new Random();

        for (int i = 0; i < ArrayInt.length; i++) {

            ArrayInt[i] = random.nextInt(1, 31);

            System.out.println("El tamaño del array es " + ArrayInt.length + " y su posición es " + ArrayInt[i]);

        }

        return ArrayInt;
    }

    public static int[] sinDuplicados(int[] array) {

        int[] arrayDuplicado = new int[array.length];
        int contador = 0;

        for (int i = 0; i < arrayDuplicado.length; i++) {
            boolean pepe = false;
            for (int j = 0; j < contador; j++) {
                if (array[i] == arrayDuplicado[j]) {
                    pepe = true;
                    break;
                }
            }

            if (!pepe) {
                arrayDuplicado[contador] = array[i];
                contador++;
            }
        }

        int[] arrayFinal = new int[contador];
        for (int i = 0; i < contador; i++) {
            arrayFinal[i] = arrayDuplicado[i];
        }
        for (int i : arrayFinal) {
            System.out.print(i + " ");

        }

        return arrayFinal;
    }

}
