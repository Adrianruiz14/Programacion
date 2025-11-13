package memuero;

import java.util.Random;

import javax.swing.JOptionPane;

public class memuero {
    public static void main(String[] args) {

        String precio = "";
        double precioinicial = 0;

        String texto = """
                Bienvenido a Mercadona:
                Hoy tenemos una oferta especial, por la compra de cualquier producto
                introducirá la mano en esta caja de bolas y según el color de la bola que saque
                obtendrá un descuento en su compra:
                - Bola roja: 15% de descuento
                - Bola naranja: 25% de descuento
                - Bola azul: 50% de descuento
                """;

        JOptionPane.showMessageDialog(null, texto);
        JOptionPane.showMessageDialog(null, "Terminada la explicación, tome su recibo y saque una bola de la caja.");
        Random random = new Random();
        int bola = random.nextInt(1, 5); // 0 incluido
        String colorbola = "";

        if (bola == 1) {
            JOptionPane.showMessageDialog(null, "Ehnorabuena sacaste la bola roja y obtendrás un 15% de descuento");
            colorbola = "roja";

        }

        if (bola == 2) {
            JOptionPane.showMessageDialog(null, "Ehnorabuena sacaste la bola naranja y obtendrás un 25% de descuento");
            colorbola = "naranja";

        }

        if (bola == 3) {
            JOptionPane.showMessageDialog(null, "Ehnorabuena sacaste la bola azul y obtendrás un 50% de descuento");
            colorbola = "azul";

        }

        if (bola == 4) {
            JOptionPane.showMessageDialog(null, "Lo siento :C, sacaste la bola negra y no obtienes descuento");
            colorbola = "negra";

        }

        do {

            try {

                precio = JOptionPane
                        .showInputDialog("Tras sacar la bola " + colorbola + " . Introduzca el valor de su compra:");

                precioinicial = Double.parseDouble(precio);

            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "No válido, introduzca el valor de su compra");

            }

        } while (precioinicial <= 0);

        switch (bola) {
            case 1:

                double descuento = precioinicial * 15 / 100;
                double preciofinal = precioinicial - descuento;
                JOptionPane.showMessageDialog(null, "Con tu descuento del 15%  tu compra se queda en " + preciofinal);

                break;

            case 2:

                double descuento1 = precioinicial * 25 / 100;
                double preciofinal1 = precioinicial - descuento1;
                JOptionPane.showMessageDialog(null, "Con tu descuento del 25%  tu compra se queda en " + preciofinal1);

                break;

            case 3:

                double descuento2 = precioinicial * 50 / 100;
                double preciofinal2 = precioinicial - descuento2;
                JOptionPane.showMessageDialog(null, "Con tu descuento del 50%  tu compra se queda en " + preciofinal2);

                break;

            case 4:

                JOptionPane.showMessageDialog(null,
                        "Como te ha tocado la bola negra, tu compra se queda en " + precioinicial);

                break;

        }

    }
}