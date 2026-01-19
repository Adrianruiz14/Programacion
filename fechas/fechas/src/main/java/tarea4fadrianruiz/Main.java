package tarea4fadrianruiz;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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
        System.out.println("La copia de la fecha de hoy es " + copiahoy);

        // Días del Mes

        int diasMain = UtilidadesFecha.diasMes(copiahoy);
        System.out.println("El mes tiene " + diasMain);

        // Día de la Semana:

        DayOfWeek diasSemanaMain = UtilidadesFecha.diasSemana(copiahoy);
        System.out.println("Hoy es " + diasSemanaMain);

        // Mostrar fecha completa

        String fechacompletaMain = UtilidadesFecha.fechacompleta(copiahoy);
        System.out.println("La fecha completa es " + fechacompletaMain);

        // Sumar fechas

        LocalDate fechaSumadaMain = UtilidadesFecha.fechaSumada(diasMain, copiahoy);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d 'de' MMMM 'de' yyyy");

        String fechaSumadaMainCompleta = fechaSumadaMain.format(formatter);

        System.out.println("Sumando la fecha actual con los dias da: " + fechaSumadaMainCompleta);

        // Días transcurridos

        long diasTranscurridos = UtilidadesFecha.diasTranscurridos(fechaSumadaMain, copiahoy);
        System.out.println("Han pasado entre las 2 fechas: " + diasTranscurridos);

        // Saber el Día antes-despues

        System.out.println("Mañana será: " + UtilidadesFecha.fechaMasUno(copiahoy));
        System.out.println("Ayer fue: " + UtilidadesFecha.fechaMenosUno(copiahoy));

        // Probar los minutos entre distintos tiempos 
        LocalDateTime ahora = LocalDateTime.now();
        LocalDateTime luego = ahora.plusHours(2).plusMinutes(30);
        System.out.println("Minutos entre fechas: " + UtilidadesFecha.minutosEntre(ahora, luego) + "minutos");

        // Probar sumar segundos
        LocalDateTime masSegundos = UtilidadesFecha.sumarSegundos(120, ahora);
        System.out.println("Dentro de 120 segundos será: " + masSegundos);
        

    }

}
