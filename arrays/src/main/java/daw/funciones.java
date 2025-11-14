package daw;

import java.util.Random;

public class funciones {

    public static int devolverarray() {
        int[] arrayInt;
        arrayInt = new int[5];

        Random random = new Random();

        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = random.nextInt(100);
            System.out.println("El valor es " + arrayInt[i]);

        }

        int valorMaximo = 0;
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] > valorMaximo) {
                valorMaximo = arrayInt[i];
            }
        }
        return valorMaximo;
    }

    public static int devolverarray2() {
        int[] arrayInt;
        arrayInt = new int[5];

        Random random = new Random();

        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = random.nextInt(100);
            System.out.println("El valor es " + arrayInt[i]);

        }

        int valorMinimo = arrayInt[0];
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] < valorMinimo) {
                valorMinimo = arrayInt[i];
            }
        }

        return valorMinimo;

    }

    public static double devolverarrays() {
        double[] arrayDouble;
        arrayDouble = new double[5];
        Random random = new Random();
        double resultado = 1.0;

        for (int i = 0; i < arrayDouble.length; i++) {
            arrayDouble[i] = random.nextDouble(8);
            System.out.println("El valor es " + arrayDouble[i]);
            resultado = resultado * arrayDouble[i];

        }
        return resultado;

    }



    }
}
