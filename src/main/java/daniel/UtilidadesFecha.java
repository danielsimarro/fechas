/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daniel;


import java.time.temporal.ChronoUnit;
// Clase para tratar fechas (sÃ³lo dÃ­a, mes y aÃ±o)

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

// Enumerado para los meses del aÃ±o (Enero, ...)

/**
 *
 * @author NitroPc
 */
public class UtilidadesFecha {
    
    //Metodo para comprobar sis son bsisiestos
    public static boolean bisiesto(LocalDate fecha) {
        return fecha.isLeapYear();
    }
    
    public LocalDate copia (LocalDate fecha){
        return LocalDate.of(fecha.getYear(), fecha.getMonth(), fecha.getDayOfMonth());
    }
    
    //Metodo para comprobar el dia del mes
    public int diaMes(LocalDate fecha){
        return fecha.lengthOfMonth();
        
    }
    
    public long diaSemana(LocalDate fecha){
        return fecha.getDayOfWeek().ordinal();
    }
    
    public static void mostrarFormato(LocalDate Fecha){
        DateTimeFormatter fechaHora = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(fechaHora.format(Fecha));
    }
    
    public static void mostrarFechaLarga(LocalDate fecha){
        Locale configSistema = Locale.getDefault();
        System.out.println(fecha.getDayOfWeek().getDisplayName(TextStyle.FULL, configSistema)
        + " " + fecha.getDayOfMonth()
        + " de " + fecha.getMonth().getDisplayName(TextStyle.FULL, configSistema)
        + " de " + fecha.getYear());
    }
    
    
    public LocalDate sumarDias(long numeroDias, LocalDate fecha){
        fecha = fecha.plusDays(numeroDias);
        return fecha;
    }
    
    public long diasTranscurridos(LocalDate fechaInicial, LocalDate fechaFinal){
        long diasTranscurridos = ChronoUnit.DAYS.between(fechaInicial,fechaFinal);
        return diasTranscurridos;
    }
    
    public LocalDate siguienteDia(LocalDate fecha){
        
        LocalDate nuevo = fecha.plus(1, ChronoUnit.DAYS);
        return nuevo;
    }
    
    public static LocalDate anteriorDia(LocalDate fecha){
        return fecha.minus(1,ChronoUnit.DAYS);
    }
    
    public long minutosEntre (LocalDateTime fecha1, LocalDateTime fecha2){
        long minutosEntreObjetos = ChronoUnit.MINUTES.between(fecha1, fecha2);
        return minutosEntreObjetos;
    }
    
    public static LocalDateTime sumarSegundos (long numeroSegundos, LocalDateTime fecha){
        
        return fecha.plusSeconds(numeroSegundos);
    }
    
    
}
