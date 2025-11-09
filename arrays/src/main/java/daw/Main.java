package daw;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Ejercicio 1: ");

        int valormaximo = funciones.devolverarray();
        System.out.println("El valor máximo es " + valormaximo);

        System.out.println("------------------------------------------");
        System.out.println("Ejercicio 2: ");

        int valorminimo = funciones.devolverarray2();
        System.out.println("El valor mínimo es " + valorminimo);

        System.out.println("------------------------------------------");
        System.out.println("Ejercicio 3: ");

        double resultado = funciones.devolverarrays();
        System.out.println("El resultado es " + resultado);

        System.out.println("------------------------------------------");
        System.out.println("Ejercicio 4: ");

        Scanner teclado = new Scanner(System.in);
        System.err.println("Introduce el tamaño del Array");
        int tamaño = teclado.nextInt();
        double[] arrayInt = funciones.tamañoarray(tamaño);
        System.out.println("El tamaño es " + tamaño);
        //¿Cómo se manda varios datos de una funcion a otra?
        //¿Cómo se manda dato de una funcion a otra y luego volverla a mandar? 

    }

    
}