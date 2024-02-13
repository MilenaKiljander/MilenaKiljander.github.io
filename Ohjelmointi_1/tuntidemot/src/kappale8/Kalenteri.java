package kappale8;

import java.time.LocalDate;
import java.util.Scanner;

public class Kalenteri {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Syötä vuosi: ");
        int year = lukija.nextInt();

        System.out.println("Syötä kuukausi: ");
        int month = lukija.nextInt();

        LocalDate date = LocalDate.of(year, month, 1);

        System.out.println("Ma Ti Ke To Pe La Su");

        int offset = date.getDayOfWeek().getValue() - 1;

        for (int i = 0; i < offset; i++) {
            System.out.print("   ");
        }

        while (date.getMonthValue() == month) {
            System.out.printf("%2d ", date.getDayOfMonth());
            if (date.getDayOfWeek().getValue() == 7) {
                System.out.println();
            }
            date = date.plusDays(1);
        }

        if (date.getDayOfWeek().getValue() != 1) {
            System.out.println();
        }

        lukija.close();
    }
}
