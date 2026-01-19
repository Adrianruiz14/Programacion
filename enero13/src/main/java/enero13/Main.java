package enero13;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static Random random = new Random();
    public static Scanner teclado = new Scanner(System.in);

    /*
     * Escribir un programa que lea del teclado el tamaño de dos arraylist de
     * enteros (el mismo tamaño para los dos listas).
     * El programa inicializará los arraylist con números aleatorios entre 1 y 100.
     * Existirá un método llamado multiplicar que recibirá los dos arraylist e
     * irá multiplicando los elementos dos a dos, empezando por los elementos que
     * ocupan la posición cero, luego la uno, etc, guardando el resultado en otro
     * arraylist, que será devuelto por el método.
     * Además existirá un método para imprimir por pantalla los valores de las
     * listas. Los métodos puedes estar en la misma clase del main.
     */

    public static void main(String[] args) {

        int tamanio;

        try {
            System.out.println("¿De qué tamaño son tus listas");
            tamanio = teclado.nextInt();

        } catch (InputMismatchException ime) {
            System.out.println("Introduzca un valor numérico");
            return;

        }

        ArrayList<Integer> lista1 = new ArrayList<>(tamanio);
        ArrayList<Integer> lista2 = new ArrayList<>(tamanio);

        for (int i = 0; i < tamanio; i++) {
            lista1.add(random.nextInt(1, 100));
        }

        for (int i = 0; i < tamanio; i++) {
            lista2.add(random.nextInt(1, 100));
        }

        System.out.println(lista1);
        System.out.println(lista2);
        ArrayList<Integer> arraymultiplicado = multiplicar(lista1, lista2, tamanio);
        System.out.println(arraymultiplicado);
        ArrayList<Object> arrayfinal = mostrar(lista1, lista2, arraymultiplicado);
        System.out.println(arrayfinal);
        
       

    }

    public static ArrayList<Integer> multiplicar(ArrayList<Integer> lista1, ArrayList<Integer> lista2, int tamanio) {

        ArrayList<Integer> arraymultiplicado = new ArrayList<>(tamanio);

        for (int i = 0; i < lista1.size(); i++) {

            arraymultiplicado.add(lista1.get(i) * lista2.get(i));

        }

        return arraymultiplicado;
    }
    public static ArrayList<Object> mostrar(ArrayList<Integer> lista1, ArrayList<Integer> lista2, ArrayList<Integer> arraymultiplicado) {

        ArrayList<Object> datoslistas = new ArrayList<>();
        datoslistas.add(lista1);
        datoslistas.add(lista2);
        datoslistas.add(arraymultiplicado);

        return datoslistas;
    }
}