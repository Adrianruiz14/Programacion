package matrices;

public class Avion {

    private String asiento;

    public Avion(String asiento) {
        this.asiento = asiento;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    @Override
    public String toString() {
        return "Avion [asiento=" + asiento + "]";
    }

    
    
}
