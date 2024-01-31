package kappale6;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Kotitalousvahennys {
    public static void main(String[] args) {

        DecimalFormat ds = new DecimalFormat("0.00");
        
        double summa = 0;
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna työkorvauksen määrä (0 lopettaa): ");
        double korvaus = lukija.nextDouble();

        while (korvaus > 0) {
            summa = summa + (korvaus * 0.4);
            System.out.println("Anna työkorvauksen määrä (0 lopettaa): ");
            korvaus = lukija.nextDouble();
        }

        summa = summa - 100;
        if (summa < 0) {
            summa = 0;
        }
        if (summa > 2250) {
            summa = 2250;
        }
        System.out.println("Kotitalousvähennyksen määrä on " + ds.format(summa) + " euroa");
        lukija.close();

    }

}
