package kappale6;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Kassakone {
    public static void main(String[] args) {

        DecimalFormat ds = new DecimalFormat("0.00");

        double summa = 0;
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna ostoksen hinta (0 lopettaa): ");
        double hinta = lukija.nextDouble();

        while (hinta > 0) {
            summa = summa + hinta;
            System.out.println("Anna ostoksen hinta (0 lopettaa): ");
            hinta = lukija.nextDouble();
        }

        System.out.println("Ostosten verollinen hinta on " + ds.format(summa));

        double vero = summa * 24.0 / 124.0;
        System.out.println("ALV:n osuus on " + ds.format(vero));

        double veroton = summa - vero;
        System.out.println("Veroton hinta on " + ds.format(veroton));

        lukija.close();
    }
}
