package matrices;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static Random random = new Random();

    public static void main(String[] args) {
        /*
         * Crea una matriz de números aleatorios entre 1 y 9, de tamaño NxM e imprime el
         * resultado por consola.
         * Pide al usuario un número entre 1 y 9 y comprueba si está o no en la matriz,
         * indicando su fila y columna,
         * para ello crea un método que devuelva la fila y columna donde está o -1 -1 si
         * no está en la matriz.
         * Puedes devolver un array de dos posicione o bien crea una clase Coordenada
         * para guardar las posiciones i, j.
         */

        int[][] matriz1 = new int[5][5];

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matriz1[i][j] = random.nextInt(1, 10);
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println();
        }

        int[] nopuedomas = buscarPos(matriz1);
        System.out.println(nopuedomas[0]+ ", " + nopuedomas[1]);


    }

    public static Scanner teclado = new Scanner(System.in);

    public static int[] buscarPos(int[][] matriz1) {

        System.out.println("Dime el numero que quieres buscar: ");
        int numero = teclado.nextInt();
        int i, j;
        for (i = 0; i < matriz1.length; i++) {
            for (j = 0; j < matriz1[i].length; j++) {
                if (matriz1[i][j] == numero) {
                    return new int[]{i, j};
                }  

            }

        }
        throw new IllegalArgumentException("No se encuentra el número solicitado");

    }
}