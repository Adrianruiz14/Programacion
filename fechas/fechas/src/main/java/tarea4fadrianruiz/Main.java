package tarea4fadrianruiz;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        // Fecha de hoy 
        System.out.println("Hoy es " + UtilidadesFecha.hoy());

        // ¿Es bisiesto?
        boolean algo = UtilidadesFecha.añoBisiesto(UtilidadesFecha.hoy());
        if (algo == true) {
            System.out.println("Es bisiesto");
        } else {
            System.out.println("No es bisiesto");
        }
        // Copia
        LocalDate copiahoy = UtilidadesFecha.hoyCopia(UtilidadesFecha.hoy());
        System.out.println("La copia de la fecha de hoy es " + copiahoy );

        // Días del Mes

        int diasMain = UtilidadesFecha.diasMes(copiahoy);
       System.out.println("El mes tiene " + diasMain);

        



    }

}
