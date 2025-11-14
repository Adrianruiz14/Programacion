package daw;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Crea una función que devuelva un array de tamaño especificado en el parámetro
        // con número aleatorios entre 1-30

        // Función que recibe un array de números  y devuelve
        // un nuevo array sin duplicados, IGNORA ESTO, solo los de arriba
        Random random = new Random();

        int tamanio = random.nextInt(0, 31);

        int[] ArrayMain;

        ArrayMain = funcion(tamanio);

        for (int i = 0; i < ArrayMain.length; i++) {

            System.out.println(ArrayMain[i]);

        }

        // Func

        int [] arraySinDuplicados = recibirArray(ArrayMain);

    }
         // VOZ DE DIEGO EN MI CABEZA: ADRIAN ESTO ES UN PUTO PARAMETRO (,......)
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

    public static int[] recibirArray(int[] array) {

        // Creas un array del tamaño de array

        // Recorres array

        // Si el numero de la posición x no está en el array nuevo lo incluyes en la misma posición x
        if (buscarNumero(arry[]i, array))

        int[] array1 = new int[];
        //Array de funcion j


        for (int i = 0; i < ArrayInt.length; i++, j++) { 
            if (ArrayInt[i] == ArrayInt[j]) {    Arraynuevo[i] =  ArrayInt[i];




            }

        }
        int loquesea = 0;

        return loquesea;
    }

    // Función buscar un número en un array
    public static boolean buscarNumero(int numero, int[] array){
        for ( int i = 0; i < array.length; i++) {
            if (numero == array[i]){
                return true;
            }
        }
        return false;
    }
}
