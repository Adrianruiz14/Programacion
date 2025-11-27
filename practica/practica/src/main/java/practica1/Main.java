package practica1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 1.Escribe un programa en Java que pida al usuario introducir 10 números
        // enteros, los
        // almacene en un array y posteriormente solicite otro número entero para buscar
        // dentro de
        // dicho arra
        // El programa debe implementar al menos dos funciones además del main:
        // 1. leerEnteros
        // Recibe la cantidad de números a leer y devuelve un array con los enteros
        // introducidos por el usuario.
        // 2. buscarNumero
        // Recibe el array de enteros y un número a buscar, y devuelve true si el número
        // se
        // encuentra dentro del array o false en caso contrario.
        // Tras realizar la búsqueda, el programa mostrará uno de los siguientes
        // mensajes:
        // ● "El número X SI está en la colección"
        // ● "El número X NO está en la colección"
        // Esquema de la salida:
        // Introduce 10 números enteros: 4 25 -3 4 2 17 9 5 -7 8
        // Introduzca el número a buscar: 2
        // El numero 2 SI esta en el array

        int[] arrayMain = new int[10];
        System.out.println("Este es el Array: ");
        funciones.RellenarArrays(arrayMain);
        System.out.println("Introduzca un número para buscar");
        Scanner teclado = new Scanner(System.in);
        int buscador = teclado.nextInt();

        boolean encontrado = funciones.BuscarNumero(arrayMain, buscador);

        if (encontrado == true) {
            System.out.println("Tu numero se encuentra en el Array");
        }
        if (encontrado == false) {
            System.out.println("Tu numero no se encuentra en el Array");
        }

    }
}
