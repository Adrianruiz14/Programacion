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

        int[] ArrayMain = primerArray();

        System.out.println(Arrays.toString(ArrayMain));

        int[] ArrayOut = ordenarArray(ArrayMain); //ESTO ES LA VINCULACIÓN

        int[] ArrayFinalMain = ordenarArray(ArrayOut);

        System.out.println(Arrays.toString(ArrayFinalMain));

    }

    public static int[] primerArray() {

        int[] arrayInt;
        arrayInt = new int[10];

        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = random.nextInt(1, 6);
        }

        return arrayInt;

    }

    public static int[] ordenarArray (int[] arrayMain) {

        int[] arrayOrdenado = arrayMain ;

            int[] arrayFinal;
        arrayFinal = new int[5];
        arrayFinal[0] = 0;
        arrayFinal[1] = 0;
        arrayFinal[2] = 0;
        arrayFinal[3] = 0;
        arrayFinal[4] = 0;

        // Tengo que contar cuantos numeros iguales hay en cada posición
        for (int i = 1; i < arrayOrdenado.length; i++) {

            if (arrayOrdenado[i] == 1) { arrayFinal[0]++;
            }
            if (arrayOrdenado[i] == 2) { arrayFinal[1]++;
            }
            if (arrayOrdenado[i] == 3) { arrayFinal[2]++;
            }
            if (arrayOrdenado[i] == 4) { arrayFinal[3]++;
            }
            if (arrayOrdenado[i] == 5) { arrayFinal[4]++;
            }
        }

        return arrayFinal;
    }

}