package kappale8;

import java.time.LocalDate;
import java.util.Scanner;

public class Erapaiva {
    public static void main(String[] args) {

        LocalDate pvm;
        String syöte;
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna laskun päivämäärä (vvvv-kk-pp): ");

        syöte = lukija.nextLine();
        pvm = LocalDate.parse(syöte);

        LocalDate returnvalue = pvm.plusDays(14);

        System.out.println("Eräpäivä on " + returnvalue);

        lukija.close();
    }
}
