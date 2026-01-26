package biblioteca;

import java.util.ArrayList;
import java.util.Collections;
import java.time.LocalDate;

public class CatalogoPrestamos {

    private ArrayList<Prestamo> CatalagoPrestamos;

    public CatalogoPrestamos(ArrayList<Prestamo> catalagoPrestamos) {
        this.CatalagoPrestamos = catalagoPrestamos;
    }

    public CatalogoPrestamos() {
        this.CatalagoPrestamos = new ArrayList<Prestamo>(100);
    }

    public void añadir(Prestamo prestamo) {
        CatalagoPrestamos.add(prestamo);
    }

    public void cambiar(int pos, Prestamo prestamo) {
        CatalagoPrestamos.set(pos, prestamo);
    }

    public void eliminar(Prestamo prestamo) {
        CatalagoPrestamos.remove(prestamo);
    }

    public Prestamo buscarpos(int pos) {
        return CatalagoPrestamos.get(pos);
    }

    public void ordenar(ArrayList<Prestamo> listaPrestamos) {
        Collections.sort(listaPrestamos,
                (p1, p2) -> p1.getEstudiante().getNombre().compareTo(p2.getEstudiante().getNombre()));
    }

    // Modificar el libro de un préstamo por id
    public void modificarLibro(int idPrestamo, Libro nuevoLibro) {
        for (Prestamo p : CatalagoPrestamos) {
            if (p.getId() == idPrestamo) {
                p.setLibro(nuevoLibro);
                return;
            }
        }
    }

    // Modificar el estudiante de un préstamo por id
    public void modificarEstudiante(int idPrestamo, Estudiante nuevoEstudiante) {
        for (Prestamo p : CatalagoPrestamos) {
            if (p.getId() == idPrestamo) {
                p.setEstudiante(nuevoEstudiante);
                return;
            }
        }
    }

    // Buscar préstamo por id (búsqueda secuencial)
    public Prestamo buscarPorId(int id) {
        for (Prestamo p : CatalagoPrestamos) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    // Buscar todos los préstamos de un libro
    public ArrayList<Prestamo> buscarPorLibro(Libro libro) {
        ArrayList<Prestamo> resultado = new ArrayList<>();
        for (Prestamo p : CatalagoPrestamos) {
            if (p.getLibro().equals(libro)) {
                resultado.add(p);
            }
        }
        return resultado;
    }

    // Buscar todos los préstamos de un estudiante
    public ArrayList<Prestamo> buscarPorEstudiante(Estudiante estudiante) {
        ArrayList<Prestamo> resultado = new ArrayList<>();
        for (Prestamo p : CatalagoPrestamos) {
            if (p.getEstudiante().equals(estudiante)) {
                resultado.add(p);
            }
        }
        return resultado;
    }

    // Buscar todos los préstamos vencidos
    public ArrayList<Prestamo> buscarVencidos() {
        ArrayList<Prestamo> resultado = new ArrayList<>();
        LocalDate hoy = LocalDate.now();
        for (Prestamo p : CatalagoPrestamos) {
            if (p.getFechaDevolucion().isBefore(hoy)) {
                resultado.add(p);
            }
        }
        return resultado;
    }

    // Buscar préstamos que vencen en una fecha determinada
    public ArrayList<Prestamo> buscarPorFechaDevolucion(LocalDate fecha) {
        ArrayList<Prestamo> resultado = new ArrayList<>();
        for (Prestamo p : CatalagoPrestamos) {
            if (p.getFechaDevolucion().equals(fecha)) {
                resultado.add(p);
            }
        }
        return resultado;
    }

    // Ordenar préstamos por id
    public void ordenarPorId() {
        Collections.sort(CatalagoPrestamos,
                (p1, p2) -> Integer.compare(p1.getId(), p2.getId()));
    }

    // Búsqueda binaria de préstamos por id (requiere que esté ordenado por id)
    public Prestamo busquedaBinariaPorId(int id) {
        int izquierda = 0;
        int derecha = CatalagoPrestamos.size() - 1;

        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;
            Prestamo prestamo = CatalagoPrestamos.get(medio);

            if (prestamo.getId() == id) {
                return prestamo;
            } else if (prestamo.getId() < id) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }
        return null;
    }

    // Ordenar préstamos por fecha de inicio
    public void ordenarPorFechaInicial() {
        Collections.sort(CatalagoPrestamos,
                (p1, p2) -> p1.getFechaInicial().compareTo(p2.getFechaInicial()));
    }

    // Ordenar préstamos por fecha de devolución
    public void ordenarPorFechaDevolucion() {
        Collections.sort(CatalagoPrestamos,
                (p1, p2) -> p1.getFechaDevolucion().compareTo(p2.getFechaDevolucion()));
    }

    // Ordenar préstamos por título de libro
    public void ordenarPorTituloLibro() {
        Collections.sort(CatalagoPrestamos,
                (p1, p2) -> p1.getLibro().getTitulo().compareTo(p2.getLibro().getTitulo()));
    }

}
