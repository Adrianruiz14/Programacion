package biblioteca;

public enum Genero {
    NOVELA("Narrativa de ficción de gran extensión con trama compleja y personajes desarrollados"),
    FICCION("Obras literarias que cuentan historias imaginarias"),
    POESIA("Composiciones literarias que expresan sentimientos mediante el ritmo y la musicalidad"),
    RELATO("Narraciones breves con argumento simple y menos personajes que la novela");

    private final String descripcion;

    Genero(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
