package biblioteca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CatalagoLibros {

    private ArrayList<Libro> CatalagoLibros;

    public CatalagoLibros() {
        this.CatalagoLibros = new ArrayList<Libro>(100);
    }

    public CatalagoLibros(ArrayList<Libro> catalagoLibros) {
        CatalagoLibros = catalagoLibros;
    }

    public ArrayList<Libro> getCatalagoLibros() {
        return CatalagoLibros;
    }

    public void setCatalagoLibros(ArrayList<Libro> catalagoLibros) {
        CatalagoLibros = catalagoLibros;
    }

    public int cantidad() {
        return CatalagoLibros.size();
    }

    public boolean estaVacia() {
        return CatalagoLibros.isEmpty();
    }

    public Libro obtener(int pos) {
        return CatalagoLibros.get(pos);
    }

    public void cambiar(int pos, Libro nuevo) {
        CatalagoLibros.set(pos, nuevo);
    }

    public void guardar(Libro libro) {
        CatalagoLibros.add(libro);
    }

    public void eliminar(int pos) {
        CatalagoLibros.remove(pos);
    }

    public void eliminar(String isbn) {
        for (int i = 0; i < CatalagoLibros.size(); i++) {
            if (String.valueOf(CatalagoLibros.get(i).getIsbn()).equals(isbn)) {
                CatalagoLibros.remove(i);
                break;
            }
        }
    }

    public void imprimir() {
        for (Libro libro : CatalagoLibros) {
            System.out.println(libro.toString());
        }
    }

    public int buscar(Libro libro) {
        return CatalagoLibros.indexOf(libro);
    }

    public ArrayList<Libro> buscarPorAutor(String autor) {
        ArrayList<Libro> librosAutor = new ArrayList<>();
        for (Libro libro : CatalagoLibros) {
            if (libro.getAutor().equalsIgnoreCase(autor)) {
                librosAutor.add(libro);
            }
        }
        return librosAutor;
    }

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
