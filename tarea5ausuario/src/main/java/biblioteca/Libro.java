package biblioteca;

public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;
    public final long isbn;
    private Genero genero;
    private boolean disponible;

    // Constructor parametrizado
    public Libro(String titulo, String autor, int anioPublicacion, long isbn, Genero genero) {
        if (String.valueOf(Math.abs(isbn)).length() != 13) {
            throw new IllegalArgumentException("El ISBN debe tener exactamente 13 dígitos");
        }
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.isbn = isbn;
        this.genero = genero;
        this.disponible = true; // Por defecto está disponible
    }

    // Constructor por defecto
    public Libro() {
        this.titulo = "Sin título";
        this.autor = "Autor desconocido";
        this.anioPublicacion = 2026;
        this.isbn = 9780000000000L;
        this.genero = Genero.NOVELA;
        this.disponible = true;
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public long getIsbn() {
        return isbn;
    }

    public Genero getGenero() {
        return genero;
    }

    public boolean isDisponible() {
        return disponible;
    }

    // Setters (excepto para isbn y disponible)
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    // Método prestar
    public void prestar() {
        if (disponible) {
            disponible = false;
            System.out.println("✓ El libro \"" + titulo + "\" ha sido prestado correctamente.");
        } else {
            System.out.println("✗ No se puede prestar el libro \"" + titulo + "\" porque no está disponible.");
        }
    }

    // Método devolver
    public void devolver() {
        if (!disponible) {
            disponible = true;
            System.out.println("✓ El libro \"" + titulo + "\" ha sido devuelto correctamente.");
        } else {
            System.out.println("✗ El libro \"" + titulo + "\" ya estaba disponible.");
        }
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anioPublicacion=" + anioPublicacion +
                ", isbn=" + isbn +
                ", genero=" + genero +
                ", disponible=" + disponible +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return isbn == libro.isbn;
    }

    @Override
    public int hashCode() {
        return Long.hashCode(isbn);
    }
}
