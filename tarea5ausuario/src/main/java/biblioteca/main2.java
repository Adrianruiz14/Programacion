package biblioteca;

import java.util.ArrayList;

public class main2 {

    public static void main(String[] args) {

        ArrayList<Estudiante> estudiante = new ArrayList<>();

        Estudiante f1 = new Estudiante("Manolo", "TOnto", "09017394Z");

        CarteraEstudiantes mCarteraEstudiantes = new CarteraEstudiantes(estudiante);

        mCarteraEstudiantes.añadir(f1);

        Estudiante estudiantebuscado = mCarteraEstudiantes.buscarpos(0);

        System.out.println(estudiantebuscado);

    }

}
