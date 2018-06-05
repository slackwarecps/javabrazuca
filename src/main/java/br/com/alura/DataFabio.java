package br.com.alura;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

/**
 *
 * @author fabioalvaro
 */
public class DataFabio {

    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();

        System.out.println("Data de Hoje " + hoje);

        //Formatador que usa o padrao que eu escolher
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Data Formatada " + hoje.format(formatador));

        LocalDateTime agora = LocalDateTime.now();
        System.out.println("Agora: " + agora);

        //Formatador que usa o padrao que eu escolher
        DateTimeFormatter formatadorHora = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
        System.out.println("Data Formatada " + hoje.format(formatador));
        System.out.println("Data Formatada " + agora.format(formatadorHora));

        //Enum  (Constantes)
        //Criar um formatador Brazil
        DateTimeFormatter formatadorCurto = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(Locale.CHINA);
        System.out.println("Data com short China: " + agora.format(formatadorCurto));
        DateTimeFormatter formatadorCurto2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(new Locale("pt", "br"));

        System.out.println("Data com short Pt br: " + agora.format(formatadorCurto2));
        
        //colocar mais ou menos 5 horas
        agora.minusHours(5);
        System.out.println("menos 5 horas "+agora.minusHours(5));
        
        System.out.println("Mais  11 horas "+agora.plusHours(11));
        
        

    }

}
