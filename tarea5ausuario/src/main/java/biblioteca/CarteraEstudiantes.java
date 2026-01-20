package biblioteca;

import java.util.ArrayList;
import java.util.Collections;

public class CarteraEstudiantes {

    private ArrayList<Estudiante> listaestudiantes;
    // ESTE ES EL CONSTRUCTOR 
    public CarteraEstudiantes(ArrayList<Estudiante> listaestudiantes) {
        this.listaestudiantes = new ArrayList<>();
    }

    public void añadir(Estudiante estudiante) {
        listaestudiantes.add(estudiante);
    }

    public void eliminar (Estudiante estudiante) {
        listaestudiantes.remove(estudiante);
    }

    public Estudiante buscarpos (int pos) {
        return listaestudiantes.get(pos);

    }

public void ordenar(ArrayList<Estudiante> listaEstudiantes) {
    Collections.sort(listaEstudiantes,
        (e1, e2) -> e1.getNombre().compareTo(e2.getNombre())
    );
}


}

    


