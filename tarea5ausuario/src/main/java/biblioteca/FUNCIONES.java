package biblioteca;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class FUNCIONES {

    public Scanner teclado = new Scanner(System.in);

    public ArrayList<Prestamo> añadirPrestamos(ArrayList<Estudiante> estudiantes, CatalagoLibros catalogo) {

        ArrayList<Prestamo> prestamos = new ArrayList<>();
        ArrayList<Estudiante> listaestudiantes = new ArrayList<>();
        ArrayList<CatalagoLibros> catalogo = new ArrayList<>();

        JOptionPane.showInputDialog("Digame su nombre");
        String nombre = teclado.nextLine();
        JOptionPane.showInputDialog("Digame su apellido");
        String apellido = teclado.nextLine();   
        JOptionPane.showInputDialog("Digame su DNI");
        String dni = teclado.nextLine();   
        catalogo2.imprimir();
        System.out.println("Digame el libro que desee");
        String libroelegido = teclado.nextLine();
        catalogo2.add(libroelegido);
        Estudiante estudiante = new Estudiante (nombre, apellido, dni);
        listaestudiantes.add(estudiante);


     
        return prestamos;

    }

}
