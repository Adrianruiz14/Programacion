package daw;

public class Main {
    public static void main(String[] args) {
        // En un nuevo proyecto, llamado tarea 4b+ tu nombre, dentro de un paquete
        // llamado tarea4, implementa una clase llamada Estudiante para gestionar la
        // información de un alumno.

        // ​Atributos (Privados): ​nombre (String), ​idEstudiante (int), ​notaMedia
        // (double, valor entre 0.0 y 10.0) y ​curso (String).
        // ​Encapsulamiento:
        // Proporciona métodos get para todos los atributos y métodos set para notaMedia
        // y curso.
        // ​Constructores: ​Un constructor que inicialice nombre, idEstudiante y curso.
        // La notaMedia debe inicializarse a 0.0.
        // Sobreescribe toString() para mostrar el nombre del estudiante, su ID, el
        // curso y su nota media actual. ​Ejemplo: "Estudiante: Ana Pérez (ID: 101),
        // Curso: 1ESO, Nota Media: 8.5."
        // Un método aprabado() que devuelva true si la notaMedia es mayor o igual a
        // 5.0, y false en caso contrario.

        // Añase una clase con el método main. Crea un par de objetos y prueba los
        // métodos de la clase Estudiante.
        Estudiante e1 = new Estudiante("Adrián", 456, 8.8 , "1.DAW");
        System.out.println(e1.toString());
  

    }
}