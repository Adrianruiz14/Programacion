package practica1;

import java.util.Arrays;
import java.util.Random;

public class funciones {

    public static Random random = new Random();

    //Para rellenar un array:

    public static void RellenarArrays(int[] arrayInt) {

        for (int i = 0; i < arrayInt.length; i++) {

            arrayInt[i] = random.nextInt(10);
        }

        System.out.println(Arrays.toString(arrayInt));

    }
    public static boolean BuscarNumero (int[] arrayInt, int buscador) {

    for (int i= 0; i < arrayInt.length; i++) {
         if (arrayInt[i] == buscador) {
            return true;
        }
         }
         return false;   
}
    
}
