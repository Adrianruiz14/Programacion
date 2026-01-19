package tarea4fadrianruiz;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

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

    public static LocalDate hoyCopia(LocalDate fecha) {

        LocalDate hoyCopia = fecha;

        return hoyCopia;
    }

    public static int diasMes(LocalDate fecha) {

        Month mes = fecha.getMonth();

        int diasMes = mes.length(false);

        return diasMes;
    }

    public static DayOfWeek diasSemana(LocalDate fecha) {

        DayOfWeek diasSemana = fecha.getDayOfWeek();
        return diasSemana;

    }

    public static String fechacompleta(LocalDate fecha) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d 'de' MMMM 'de' yyyy"); //ESTO NO LO ENCONTRÉ EN LOS APUNTES 

        String fechacompleta= fecha.format(formatter);

        return fechacompleta;
    }

    public static LocalDate fechaSumada (long numeroDias, LocalDate fecha) {

        LocalDate fechaSumada = fecha.plusDays(numeroDias);

        return fechaSumada;
    }

    public static long diasTranscurridos (LocalDate fechaSumada, LocalDate fecha) {

        long diferenciaDias = ChronoUnit.DAYS.between(fecha, fechaSumada);

        return diferenciaDias;
    }

    public static LocalDate fechaMasUno(LocalDate fecha) {
        return fecha.plusDays(1); 
    }

    public static LocalDate fechaMenosUno(LocalDate fecha) {
        return fecha.minusDays(1);
    }

    public static long minutosEntre (LocalDateTime fecha1, LocalDateTime fecha2) {
        return ChronoUnit.MINUTES.between(fecha1, fecha2);
    }

    public static LocalDateTime sumarSegundos(long numeroSegundos, LocalDateTime fecha) {
        return fecha.plusSeconds(numeroSegundos);
    }



}
