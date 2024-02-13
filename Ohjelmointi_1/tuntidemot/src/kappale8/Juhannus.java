package kappale8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Juhannus {
    public static void main(String[] args) {

        Scanner lukija = new Scanner(System.in);
        System.out.println("Syötä vuosi: ");
        int vuosi = lukija.nextInt();

        LocalDate juhannus = LocalDate.of(vuosi, 6, 20);

        while(juhannus.getDayOfWeek() !=DayOfWeek.SATURDAY){
            juhannus = juhannus.plusDays(1);
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.M.yyyy");
        String formattedDate = juhannus.format(formatter);

        System.out.println("Juhannus on " + formattedDate + ".");

        lukija.close();

    }

}
