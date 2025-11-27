package practica1;

import java.util.Random;

public class funciones2 {

    public static Random random = new Random();

    public static int[] RellenarArrays() {

        int[] arrayInt = new int[10];

        for (int i = 0; i < arrayInt.length; i++) {

            arrayInt[i] = random.nextInt(10);
        }

        return arrayInt;

    }

    public static int[] InvertirArray (int[] arrayInt) {
         // Copiamos los arrays 
          int[] ArrayInvertido = new int[arrayInt.length];
          int posicionderecha = arrayInt.length-1;

          for (int i = 0; i < ArrayInvertido.length; i++) {
                        ArrayInvertido[i] = arrayInt[posicionderecha];
            posicionderecha--;
          }
        
         // Bucle for para intercambiar posiciones
          return ArrayInvertido;
}
}
