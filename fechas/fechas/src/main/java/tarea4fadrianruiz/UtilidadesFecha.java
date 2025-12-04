package tarea4fadrianruiz;

import java.time.LocalDate;
import java.time.Month;

public class UtilidadesFecha {

    public static LocalDate hoy() {

        LocalDate hoy = LocalDate.now();

        return hoy;
    }

    public static boolean añoBisiesto(LocalDate fecha) {

        if (fecha.isLeapYear()) {
            System.out.println("Este año es bisiesto");
            return true;   
        }

         return false;

    }

    public static LocalDate hoyCopia (LocalDate fecha) {

        LocalDate hoyCopia = fecha;

        return hoyCopia;
    }

    public static int diasMes (LocalDate fecha) {

        Month mes = fecha.getMonth();

        int diasMes = mes.length(false);

        return diasMes;
    }
}
