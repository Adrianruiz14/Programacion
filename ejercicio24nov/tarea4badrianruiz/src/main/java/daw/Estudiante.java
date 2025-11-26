package daw;

public class Estudiante {



    private String nombre;
    private int ID;
    private double notaMedia;
    private String curso;

    public Estudiante(String nombre, int iD, double notaMedia, String curso) { // ESTO ES LA CAJA
        this.nombre = nombre;
        ID = iD;
        this.notaMedia = notaMedia;
        this.curso = curso;
    }

       // CON GET PODEMOS VER LO QUE HAY DENTRO DE LA CAJA 
    // Y CON SET PODEMOS CAMBIARLO

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Estudiante [nombre=" + nombre + ", ID=" + ID + ", notaMedia=" + notaMedia + ", curso=" + curso + "]";
    }

    

}
