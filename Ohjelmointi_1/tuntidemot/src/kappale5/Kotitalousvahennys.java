package kappale5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Kotitalousvahennys {
    public static void main(String[] args) {

        double summa = 0;
        System.out.println("Anna työkorvauksen määrä (0 lopettaa): ");
        Scanner lukija = new Scanner(System.in);
        double korvaus = lukija.nextDouble();
        DecimalFormat ds = new DecimalFormat("0.00");

        while (korvaus > 0) {
            summa = summa + (korvaus * 0.5);
            System.out.println("Anna työkorvauksen määrä (0 lopettaa): ");
            korvaus = lukija.nextDouble();
        }

        summa = summa - 100;
        if (summa < 0) {
            summa = 0;
        }
        if (summa > 2400) {
            summa = 2400;
        }
        System.out.println("Kotitalousvähennyksen määrä on " + ds.format(summa) + " euroa");
        lukija.close();
    }
}
