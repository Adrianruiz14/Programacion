package biblioteca;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class main2 {

    public static void main(String[] args) {

        int opcion;
        ArrayList<Prestamo> prestamos = new ArrayList<>();
        ArrayList<Libro> libros = new ArrayList<>();
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        CarteraEstudiantes cartera = new CarteraEstudiantes(new ArrayList<>());
        CatalagoLibros catalogo = new CatalagoLibros();              

        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967, 9788437604313L, Genero.FICCION);
        Libro libro2 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 1605, 9788499891508L, Genero.NOVELA);
        Libro libro3 = new Libro("La sombra del viento", "Carlos Ruiz Zafón", 2001, 9788408051234L, Genero.RELATO);
        Libro libro4 = new Libro("El amor en los tiempos del cólera", "Gabriel García Márquez", 1985, 9780307389732L, Genero.FICCION);

        catalogo.guardar(libro1);
        catalogo.guardar(libro2);
        catalogo.guardar(libro3);
        catalogo.guardar(libro4);

        Estudiante estudiante1 = new Estudiante("Ana", "Colorado", "094567890b");
        Estudiante estudiante2 = new Estudiante("Luis", "Vaquero", "749123456s");
        Estudiante estudiante3 = new Estudiante("María", "Garcia", "456123789s");
        Estudiante estudiante4 = new Estudiante("Carlos", "Marquez", "123123456a");

        cartera.añadir(estudiante1);
        cartera.añadir(estudiante2);
        cartera.añadir(estudiante3);
        cartera.añadir(estudiante4);

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
                        "10. Búsuqeda binaria de préstamos por ID\n" +
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
                    // NECESITO ESTUDIANTES-CATALOGOLIBROS Y LOCALDATE PARA HACER UN PRESTAMO Y DEVOLUCIÓN
                    // ns hacerlo vico, socorro
                    // METODO

                    break;


                      case   2:
                      prestamos.remove(prestamos);
                        break;
         
                       case  3:
            

                        case 4:
                     

                         case 5:
              

                        case 6:
                   

                         case 7:
                      

                         case 8:
                       

                        case 9:
                      

                         case 10:
                       

                         case 11:
                      

                         case 12:
                       

                         case 13:
                       

                         case 14:
                       

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
        
    } }




