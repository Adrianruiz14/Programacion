package biblioteca;

import javax.swing.JOptionPane;

public class Principal {
    private static CatalagoLibros catalogo = new CatalagoLibros();

    public static void main(String[] args) {
        // Pruebas iniciales
        pruebasIniciales();

        // Menú principal
        menuPrincipal();
    }

    private static void pruebasIniciales() {
        System.out.println("=== PRUEBAS INICIALES DEL CATÁLOGO ===\n");

        // Crear algunos libros
        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", 1605, 9788499891508L, Genero.NOVELA);
        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967, 9788437604313L, Genero.FICCION);
        Libro libro3 = new Libro("La Casa de Bernarda Alba", "Federico García Lorca", 1936, 9788466309127L, Genero.POESIA);
        Libro libro4 = new Libro("Don Juan Tenorio", "José Zorrilla", 1844, 9788491059134L, Genero.FICCION);

        // Agregar libros al catálogo
        catalogo.guardar(libro1);
        catalogo.guardar(libro2);
        catalogo.guardar(libro3);
        catalogo.guardar(libro4);

        System.out.println("✓ Cantidad de libros en el catálogo: " + catalogo.cantidad());
        System.out.println("✓ ¿Está vacío?: " + catalogo.estaVacia());
        System.out.println("\n--- Libros en el catálogo (orden de inserción) ---");
        catalogo.imprimir();

        System.out.println("\n--- Libros ordenados por título ---");
        catalogo.ordenarPorTitulo();
        catalogo.imprimir();

        System.out.println("\n--- Libros ordenados por autor ---");
        catalogo.ordenarPorAutor();
        catalogo.imprimir();

        System.out.println("\n--- Búsqueda binaria por título 'Cien años de soledad' ---");
        int posicion = catalogo.buscarBinarioPorTitulo("Cien años de soledad");
        if (posicion >= 0) {
            System.out.println("✓ Libro encontrado en posición: " + posicion);
        } else {
            System.out.println("✗ Libro no encontrado");
        }

        System.out.println("\n--- Búsqueda por autor 'Miguel de Cervantes' ---");
        var librosAutor = catalogo.buscarPorAutor("Miguel de Cervantes");
        System.out.println("Libros encontrados: " + librosAutor.size());
        for (Libro l : librosAutor) {
            System.out.println("  - " + l.getTitulo());
        }

        System.out.println("\n=== FIN DE PRUEBAS ===\n");
    }

    private static void menuPrincipal() {
        int opcion;
        do {
            String menu = "=== GESTOR DE CATÁLOGO DE LIBROS ===\n\n" +
                    "1. Ver cantidad de libros\n" +
                    "2. Agregar nuevo libro\n" +
                    "3. Mostrar todos los libros\n" +
                    "4. Buscar libro por ISBN\n" +
                    "5. Buscar libros por autor\n" +
                    "6. Cambiar libro por posición\n" +
                    "7. Eliminar libro por posición\n" +
                    "8. Eliminar libro por ISBN\n" +
                    "9. Ordenar por título\n" +
                    "10. Ordenar por autor\n" +
                    "11. Buscar binario por título\n" +
                    "12. Buscar binario por autor\n" +
                    "0. Salir\n\n" +
                    "Seleccione una opción:";

            String input = JOptionPane.showInputDialog(menu);
            if (input == null) break;

            opcion = Integer.parseInt(input);

            switch (opcion) {
                case 1:
                    mostrarCantidad();
                    break;
                case 2:
                    agregarLibro();
                    break;
                case 3:
                    mostrarLibros();
                    break;
                case 4:
                    buscarPorIsbn();
                    break;
                case 5:
                    buscarPorAutor();
                    break;
                case 6:
                    cambiarLibro();
                    break;
                case 7:
                    eliminarPorPosicion();
                    break;
                case 8:
                    eliminarPorIsbn();
                    break;
                case 9:
                    ordenarTitulo();
                    break;
                case 10:
                    ordenarAutor();
                    break;
                case 11:
                    buscarBinarioTitulo();
                    break;
                case 12:
                    buscarBinarioAutor();
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "¡Hasta luego!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } while (true);
    }

    private static void mostrarCantidad() {
        JOptionPane.showMessageDialog(null, "Total de libros: " + catalogo.cantidad());
    }

    private static void agregarLibro() {
        try {
            String titulo = JOptionPane.showInputDialog("Ingrese el título del libro:");
            if (titulo == null) return;

            String autor = JOptionPane.showInputDialog("Ingrese el autor:");
            if (autor == null) return;

            String anioStr = JOptionPane.showInputDialog("Ingrese el año de publicación:");
            if (anioStr == null) return;
            int anio = Integer.parseInt(anioStr);

            String isbnStr = JOptionPane.showInputDialog("Ingrese el ISBN (13 dígitos):");
            if (isbnStr == null) return;
            long isbn = Long.parseLong(isbnStr);

            String[] generos = {"NOVELA", "FICCION", "POESIA", "RELATO"};
            int generoIndex = mostrarComboDialog("Seleccione el género:", generos);
            Genero genero = Genero.values()[generoIndex];

            Libro libro = new Libro(titulo, autor, anio, isbn, genero);
            catalogo.guardar(libro);
            JOptionPane.showMessageDialog(null, "✓ Libro agregado exitosamente");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Ingrese datos válidos", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void mostrarLibros() {
        if (catalogo.estaVacia()) {
            JOptionPane.showMessageDialog(null, "El catálogo está vacío");
            return;
        }
        StringBuilder sb = new StringBuilder("=== LIBROS EN EL CATÁLOGO ===\n\n");
        for (int i = 0; i < catalogo.cantidad(); i++) {
            sb.append((i + 1)).append(". ").append(catalogo.obtener(i).getTitulo())
                    .append(" - ").append(catalogo.obtener(i).getAutor()).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }

    private static void buscarPorIsbn() {
        String isbn = JOptionPane.showInputDialog("Ingrese el ISBN a buscar:");
        if (isbn == null) return;

        Libro libro = catalogo.buscarPorIsbn(isbn);
        if (libro != null) {
            JOptionPane.showMessageDialog(null, "Libro encontrado:\n" + libro.getTitulo() + 
                    " por " + libro.getAutor());
        } else {
            JOptionPane.showMessageDialog(null, "Libro no encontrado", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void buscarPorAutor() {
        String autor = JOptionPane.showInputDialog("Ingrese el autor a buscar:");
        if (autor == null) return;

        var libros = catalogo.buscarPorAutor(autor);
        if (libros.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay libros de ese autor");
        } else {
            StringBuilder sb = new StringBuilder("Libros de " + autor + ":\n\n");
            for (Libro libro : libros) {
                sb.append("- ").append(libro.getTitulo()).append(" (").append(libro.getAnioPublicacion()).append(")\n");
            }
            JOptionPane.showMessageDialog(null, sb.toString());
        }
    }

    private static void cambiarLibro() {
        try {
            String posStr = JOptionPane.showInputDialog("Ingrese la posición del libro a cambiar (1-" + catalogo.cantidad() + "):");
            if (posStr == null) return;
            int pos = Integer.parseInt(posStr) - 1;

            if (pos < 0 || pos >= catalogo.cantidad()) {
                JOptionPane.showMessageDialog(null, "Posición inválida", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String titulo = JOptionPane.showInputDialog("Ingrese el nuevo título:");
            if (titulo == null) return;

            String autor = JOptionPane.showInputDialog("Ingrese el nuevo autor:");
            if (autor == null) return;

            String anioStr = JOptionPane.showInputDialog("Ingrese el nuevo año:");
            int anio = Integer.parseInt(anioStr);

            String isbnStr = JOptionPane.showInputDialog("Ingrese el nuevo ISBN:");
            long isbn = Long.parseLong(isbnStr);

            String[] generos = {"NOVELA", "FICCION", "POESIA", "RELATO"};
            int generoIndex = mostrarComboDialog("Seleccione el género:", generos);
            Genero genero = Genero.values()[generoIndex];

            Libro nuevoLibro = new Libro(titulo, autor, anio, isbn, genero);
            catalogo.cambiar(pos, nuevoLibro);
            JOptionPane.showMessageDialog(null, "✓ Libro actualizado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void eliminarPorPosicion() {
        try {
            String posStr = JOptionPane.showInputDialog("Ingrese la posición del libro a eliminar (1-" + catalogo.cantidad() + "):");
            if (posStr == null) return;
            int pos = Integer.parseInt(posStr) - 1;

            if (pos < 0 || pos >= catalogo.cantidad()) {
                JOptionPane.showMessageDialog(null, "Posición inválida", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            catalogo.eliminar(pos);
            JOptionPane.showMessageDialog(null, "✓ Libro eliminado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void eliminarPorIsbn() {
        String isbn = JOptionPane.showInputDialog("Ingrese el ISBN del libro a eliminar:");
        if (isbn == null) return;

        catalogo.eliminar(isbn);
        JOptionPane.showMessageDialog(null, "✓ Libro eliminado (si existía)");
    }

    private static void ordenarTitulo() {
        catalogo.ordenarPorTitulo();
        JOptionPane.showMessageDialog(null, "✓ Catálogo ordenado por título");
        mostrarLibros();
    }

    private static void ordenarAutor() {
        catalogo.ordenarPorAutor();
        JOptionPane.showMessageDialog(null, "✓ Catálogo ordenado por autor");
        mostrarLibros();
    }

    private static void buscarBinarioTitulo() {
        catalogo.ordenarPorTitulo();
        String titulo = JOptionPane.showInputDialog("Ingrese el título a buscar:");
        if (titulo == null) return;

        int pos = catalogo.buscarBinarioPorTitulo(titulo);
        if (pos >= 0) {
            JOptionPane.showMessageDialog(null, "Libro encontrado en posición: " + (pos + 1));
        } else {
            JOptionPane.showMessageDialog(null, "Libro no encontrado", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void buscarBinarioAutor() {
        catalogo.ordenarPorAutor();
        String autor = JOptionPane.showInputDialog("Ingrese el autor a buscar:");
        if (autor == null) return;

        int pos = catalogo.buscarBinarioPorAutor(autor);
        if (pos >= 0) {
            JOptionPane.showMessageDialog(null, "Autor encontrado en posición: " + (pos + 1));
        } else {
            JOptionPane.showMessageDialog(null, "Autor no encontrado", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static int mostrarComboDialog(String mensaje, String[] opciones) {
        return JOptionPane.showOptionDialog(null, mensaje, "Seleccionar",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
    }
}
