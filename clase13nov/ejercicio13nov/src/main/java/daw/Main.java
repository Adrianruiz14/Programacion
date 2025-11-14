package daw;

import java.util.Random;
import java.util.Arrays; // Importar para usar Arrays.toString()

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        // Genera un tamaño aleatorio entre 1 y 30 (el 31 es exclusivo)
        int tamanio = random.nextInt(1, 31);
        System.out.println("--- 🔨 Creación de Array Principal ---");
        System.out.println("El tamaño generado para el array es: " + tamanio);

        // Llama a la función que crea el array de enteros aleatorios
        int[] arrayPrincipal = crearArrayAleatorio(tamanio);

        System.out.println("\n--- 📋 Array Original ---");
        // Muestra el array original
        System.out.println(Arrays.toString(arrayPrincipal));

        // Llama a la función que elimina duplicados. La función original se llamaba 'recibirArray' 
        // en el main pero la declaración era 'sinDuplicados'.
        int[] sinDuplicados = sinDuplicados(arrayPrincipal);

        System.out.println("\n--- ✨ Array sin Duplicados ---");
        // Muestra el array sin duplicados
        System.out.println(Arrays.toString(sinDuplicados));

    }

    /**
     * Crea y devuelve un array de enteros de un tamaño dado, 
     * con números aleatorios entre 1 y 30.
     * @param tamanio El tamaño deseado del array.
     * @return El array de enteros aleatorios.
     */
    public static int[] crearArrayAleatorio(int tamanio) {        
        int[] arrayInt = new int[tamanio];
        Random random = new Random();

        for (int i = 0; i < arrayInt.length; i++) {
            // Genera números aleatorios entre 1 (inclusivo) y 31 (exclusivo), es decir, de 1 a 30.
            arrayInt[i] = random.nextInt(1, 31);
            // El mensaje de impresión original se ha eliminado para que el output sea más limpio.
            // Si quieres verlo, descomenta la siguiente línea:
            // System.out.println("Posición [" + i + "]: " + arrayInt[i]);
        }

        return arrayInt;
    }

    /**
     * Recibe un array de números y devuelve un nuevo array sin duplicados.
     * @param array El array original que puede contener duplicados.
     * @return Un nuevo array con elementos únicos.
     */
    public static int[] sinDuplicados(int[] array) {
     
        // Se utiliza un array auxiliar y un contador para saber cuántos elementos únicos hay.
        
        int[] arrayDuplicado = new int[array.length]; // Array temporal con el tamaño máximo posible
        int contador = 0; // Contará los elementos únicos

        for (int i = 0; i < array.length; i++) {
            boolean esDuplicado = false; // Bandera para ver si el elemento ya está en 'arrayDuplicado'
            
            // Recorre solo la parte de 'arrayDuplicado' que ya tiene elementos únicos (hasta 'contador')
            for (int j = 0; j < contador; j++) {
                if (array[i] == arrayDuplicado[j]) {
                    esDuplicado = true;
                    break; // No es necesario seguir buscando
                }
            }

            if (!esDuplicado) {
                // Si no es duplicado, lo añade al array temporal y aumenta el contador
                arrayDuplicado[contador] = array[i];
                contador++;
            }
        }

        // 1. Crea el array final con el tamaño exacto de elementos únicos (usando 'contador')
        int[] arrayFinal = new int[contador];
        
        // 2. Copia los elementos únicos del array temporal al array final
        for (int i = 0; i < contador; i++) {
            arrayFinal[i] = arrayDuplicado[i];
        }
        
        // El bucle for-each de impresión se ha eliminado para que el main() imprima el resultado final de forma clara.
        // Si quieres verlo aquí, descomenta la siguiente línea:
        // System.out.println("\nElementos únicos encontrados: " + Arrays.toString(arrayFinal));

        return arrayFinal;
    }

}