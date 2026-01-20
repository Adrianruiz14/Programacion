package biblioteca;

import java.time.LocalDate;

public class Prestamo {

    private LocalDate fechadeRecogida;
    private LocalDate fechadeEntrega;
    private Estudiante estudiante;
    private Libro libro;
    
    public Prestamo(LocalDate fechadeRecogida, LocalDate fechadeEntrega, Estudiante estudiante, Libro libro) {
        this.fechadeRecogida = fechadeRecogida;
        this.fechadeEntrega = fechadeRecogida.plusDays(15);
        this.estudiante = estudiante;
        this.libro = libro;
    } 

    




}
