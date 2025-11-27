package practica1;

import java.util.Arrays;

public class Main2 {

    public static void main(String[] args) {

        int[] arrayMain = funciones2.RellenarArrays();
        System.out.println(Arrays.toString(arrayMain));

        int[] arrayMainInvertido = funciones2.InvertirArray(arrayMain);
        System.out.println(Arrays.toString(arrayMainInvertido));
    

    }


    
}
