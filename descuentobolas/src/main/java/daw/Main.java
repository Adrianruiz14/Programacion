package daw;

import java.util.Random;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

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
        int bola = random.nextInt(5);
        String colorbola = "";

        if (bola == 1) { JOptionPane.showMessageDialog(null, "Ehnorabuena sacaste la bola roja y obtendrás un 15% de descuento"); colorbola = "roja";
            
        }

         if (bola == 2) { JOptionPane.showMessageDialog(null, "Ehnorabuena sacaste la bola naranja y obtendrás un 25% de descuento"); colorbola = "naranja";
            
        }

         if (bola == 3) { JOptionPane.showMessageDialog(null, "Ehnorabuena sacaste la bola azul y obtendrás un 50% de descuento"); colorbola = "azul";
            
        }

        if (bola == 4) { JOptionPane.showMessageDialog(null, "Lo siento :C, sacaste la bola negra y no obtienes descuento"); colorbola = "negra";
            
        }
    
        JOptionPane.showInputDialog("Tras sacar la bola " + colorbola + " . Introduzca el valor de su compra:");
    }
}