package enero13;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main2 {

    public static Random random = new Random();
    public static Scanner teclado = new Scanner(System.in);

    /*
     * Implementa un programa que genere una lista de 50 números pin aleatorios
     * diferentes. Los pines tienen tamaño 4 y puedes usar String.
     * En un método de clase, que recibe una lista de pines y un pin se debe
     * devolver la posición en la que está ese pin o -1 si no está.
     * En el programa principal, genera una lista de pines.
     * muéstrala y pide un pin al usuario. Usando la función anterior se debe saber
     * si ese pin está en la lista inicial y en qué posición.
     */

    public static void main(String[] args) {

        ArrayList<Integer> listapin = generarpin();
        System.out.println("Introduzca un pin");
        System.out.println(listapin);

        for (int i = 0; i < 50; i++) {

            int pin;
            boolean repetido;

            do {
                pin = teclado.nextInt();
                repetido = false;

                for (int j = 0; j < listapin.size(); j++) {
                    if (listapin.get(j) == pin) {
                        System.out.println("Número repetido/no válido, introduzca otro");
                        repetido = true;

                    } else if (pin < 1000) {
                        System.out.println("Número repetido/no válido, introduzca otro");
                        return;

                    }
                }

            } while (repetido == true);
            System.out.println("Número válido");
        }

    }

    public static ArrayList<Integer> generarpin() {

        ArrayList<Integer> listapin = new ArrayList<>(50);
        for (int i = 0; i < 50; i++) {

            int pin;
            boolean repetido;

            do {
                pin = random.nextInt(8999) + 1000;
                repetido = false;

                for (int j = 0; j < listapin.size(); j++) {
                    if (listapin.get(j) == pin) {
                        repetido = true;
                    }
                }

            } while (repetido == true);

            listapin.add(pin);
        }

        return listapin;
    }

}
