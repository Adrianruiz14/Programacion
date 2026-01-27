package matrices;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ej3 {

    /*
     * Realiza un programa que permita gestionar los asientos de un avión. El avión
     * tendrá 30 filas y 6 columnas.
     * Se debe permitir reservar un asiento ("R"), o liberarlo ("L"), según su
     * identificador (1A, 3B...), que es un String.
     * Las butacas se identifican mediante su fila (1,2,3,4,5...30) y su columna (A,
     * B, C, D, E, F). A la hora de imprimir el estado de los asientos
     * hay que seguir el siguiente esquema:
     * A B C D ...
     * 1 L R L L
     * 2 R R R L
     * 3 ....
     */

    public static void main(String[] args) {

        int[][] avion = new int[31][6];

        for (int i = 0; i < avion.length; i++) {
            for (int j = 0; j < avion[i].length; j++) {
                avion[i][j] = i;
                System.out.println(avion[i][j] + " ");

            }
            System.out.println("-----------------");
            System.out.println();
        }

        // MENÚ
         int eleccion = 0;
        do {

            

            String texto = """
                    Bienvenido al Menú de reservas del vuelo X:
                    ¿Qué desea hacer?
                    1.Reservar asiento
                    2.Anular asiento
                    3.Salir
                    """;
            String menu = JOptionPane.showInputDialog(null, texto);
            eleccion = Integer.parseInt(menu);

            if (menu == null) { break;}

            switch (eleccion) {
                case 1:

                    break;

                case 3:
                       
                    break;
                default:
                 
                   
                    break;
            }

        } while (eleccion != 3);

    }

    public static ArrayList<Avion> reservas() {

        return null;
    }
}
