package biblioteca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CatalagoLibros {

    private ArrayList<Libro> CatalagoLibros;
// Espacio-Memoria = 100
    public CatalagoLibros() {
        this.CatalagoLibros = new ArrayList<Libro>(100);
    }
// Cantidad
    public int cantidad() {
        return CatalagoLibros.size();
    }
// Vaciar
    public boolean estaVacia() {
        return CatalagoLibros.isEmpty();
    }
// Obtener
    public Libro obtener(int pos) {
        return CatalagoLibros.get(pos);
    }
// Cambiar por posición
    public void cambiar(int pos, Libro nuevo) {
        CatalagoLibros.set(pos, nuevo);
    }
// Añadir
  public void guardar(Libro libro) {
        CatalagoLibros.add(libro);
    }  
// Eliminar POR POSICIÓN
    public void eliminar(int pos) {
        CatalagoLibros.remove(pos);
    }
// Eliminar por ISBN
    public void eliminar(String isbn) {
        for (int i = 0; i < CatalagoLibros.size(); i++) {
            if (String.valueOf(CatalagoLibros.get(i).getIsbn()).equals(isbn)) {
                CatalagoLibros.remove(i);
                break;
            }
        }
    }
// Imprimir
    public void imprimir() {
        for (Libro libro : CatalagoLibros) {
            System.out.println(libro.toString());
        }
    }
// Buscar 
    public int buscar(Libro libro) {
        return CatalagoLibros.indexOf(libro);
    }
// Buscar por autor
    public ArrayList<Libro> buscarPorAutor(String autor) {
        ArrayList<Libro> librosAutor = new ArrayList<>();
        for (Libro libro : CatalagoLibros) {
            if (libro.getAutor().equalsIgnoreCase(autor)) {
                librosAutor.add(libro);
            }
        }
        return librosAutor;
    }
// Buscar por ISBN
    public Libro buscarPorIsbn(String isbn) {
        for (Libro libro : CatalagoLibros) {
            if (String.valueOf(libro.getIsbn()).equals(isbn)) {
                return libro;
            }
        }
        return null;
    }
    
    public void ordenarPorTitulo() {
        Collections.sort(CatalagoLibros, new Comparator<Libro>() {
            @Override
            public int compare(Libro l1, Libro l2) {
                return l1.getTitulo().compareTo(l2.getTitulo());
            }
        });
    }

    public void ordenarPorAutor() {
        Collections.sort(CatalagoLibros, new Comparator<Libro>() {
            @Override
            public int compare(Libro l1, Libro l2) {
                return l1.getAutor().compareTo(l2.getAutor());
            }
        });
    }

    public int buscarBinarioPorTitulo(String titulo) {
        this.ordenarPorTitulo();
        Libro libroABuscar = new Libro(titulo, "", 0, 9780000000000L, Genero.NOVELA);
        return Collections.binarySearch(CatalagoLibros, libroABuscar, new Comparator<Libro>() {
            @Override
            public int compare(Libro l1, Libro l2) {
                return l1.getTitulo().compareTo(l2.getTitulo());
            }
        });
    }

    public int buscarBinarioPorAutor(String autor) {
        this.ordenarPorAutor();
        Libro libroABuscar = new Libro("", autor, 0, 9780000000000L, Genero.NOVELA);
        return Collections.binarySearch(CatalagoLibros, libroABuscar, new Comparator<Libro>() {
            @Override
            public int compare(Libro l1, Libro l2) {
                return l1.getAutor().compareTo(l2.getAutor());
            }
        });
    }

}
