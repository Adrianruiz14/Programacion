package daw;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static Random random = new Random();

    public static void main(String[] args) {
        // Solicitar por consola un array de 10 posciones con numeros del 1 al 5,
        // Luego en otra función, a partir de esto, tengo que obtener otro que tiene que
        // llevar
        // en cada una de las siguientes posiciones, el numero total de cada numero

        int[] ArrayMain = primerArray(); // NO HACE FALTA PONER NIGUN PARAMETRO PORQUE NO HAY NADA

        System.out.println(Arrays.toString(ArrayMain));

        int[] ArrayFinalMain = ordenarArray(ArrayMain); // ESTO ES PARA TRAERME EL RETURN Y LA VINCULACIÓN

        System.out.println(Arrays.toString(ArrayFinalMain));

    }

    public static int[] primerArray() { // NO HACE FALTA PONER NIGUN PARAMETRO PORQUE NO HAY NADA QUE RECIBIR, SOLO
                                        // MANDAR

        int[] arrayInt;
        arrayInt = new int[100];

        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = random.nextInt(1, 100);
        }

        return arrayInt;
    }

    public static int[] ordenarArray(int[] arrayMain) { // MOLDE, LO VINCULAS CON "LINEA 20"

        // Buscar el elemento máximo en arrayMain
        int tamanio = buscarMax(arrayMain);

        int[] arrayFinal = new int[tamanio];

        // Tengo que contar cuantos numeros iguales hay en cada posición
        for (int i = 0; i < arrayMain.length; i++) {

            arrayFinal[arrayMain[i] - 1]++;
        }

        return arrayFinal;
    }

    public static int buscarMax(int[] array) { //Buscar máximo de un Array
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        
        return max;
    }

}