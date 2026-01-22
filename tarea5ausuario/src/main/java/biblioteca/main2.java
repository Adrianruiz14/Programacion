package biblioteca;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class main2 {

    /* Guardar préstamo
    Borrar préstamo
    Modificar el libro de un préstamo de la lista, para ello se debe aportar el id del préstamo, y el nuevo libro a asignar.
    Modificar el estudiante de un préstamo de la lista, para ello se debe aportar el id del préstamo, y el nuevo estudiante a asignar.
    Buscar préstamo por id (usa búsqueda secuencial)
    Buscar todos los préstamos de un libro 
    Buscar todos los préstamos de un estudiante
    Buscar todos los prestamos vencidos
    Buscar los préstamos que vencen en una fecha determinada
    Ordenar préstamos por id
    Búsqueda binaria de préstamos por id
    Ordenar préstamos por fecha de inicio
    Ordenar por fecha de devolución
    Ordenar por título de libro
    Ordenar por nombre de alumno/a */

    public static void main(String[] args) {

        int opcion;
        ArrayList<Prestamo> prestamos = new ArrayList<>();

        do {
            try {
                String menu = "=== GESTOR DE CATÁLOGO DE LIBROS ===\n\n" +
                        "1. Guardar préstamo\n" +
                        "2. Borrar préstamo\n" +
                        "3. Modificar el libro de un préstamo\n" +
                        "4. Buscar préstamo por ID\n" +
                        "5. Buscar todos los préstamos de un ID\n" +
                        "6. Buscar todos los préstamos de un estudiante\n" +
                        "7. Buscar todos los prestamos vencidos\n" +
                        "8. Buscar los préstamos que vencen en una fecha determinada\n" +
                        "9. Ordenar préstamos por ID\n" +
                        "10. Búsuqeda binaria de préstamos por ID\n"+ 
                        "11. Ordenar préstamos por fecha de inicio\n" +
                        "12. Ordenar por fecha de devolución\n" +
                        "13. Ordenar por título de libro\n" +
                        "14. Ordenar por nombre de alumno/a\n" +
                        "0. Salir\n" +
                        "Seleccione una opción:";

                String input = JOptionPane.showInputDialog(menu);
                if (input == null) break;

                opcion = Integer.parseInt(input);

                switch (opcion) {
                    case 1:
                     
                        break;
                    case 2:
         
                        break;
                    case 3:
            
                        break;
                    case 4:
                     
                        break;
                    case 5:
              
                        break;
                    case 6:
                   
                        break;
                    case 7:
                      
                        break;
                    case 8:
                       
                        break;
                    case 9:
                      
                        break;
                    case 10:
                       
                        break;
                    case 11:
                      
                        break;
                    case 12:
                       
                        break;
                    case 13:
                       
                        break;
                    case 14:
                       
                        break;
                    case 0:
                        JOptionPane.showMessageDialog(null, "¡Hasta luego!");
                        System.exit(0);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción inválida", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingresa un número válido", "Error", JOptionPane.ERROR_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } while (true);
    }

    }


