package kappale5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Kilometrikorvaus {
    public static void main(String[] args) {

        int summa = 0;
        System.out.println("Anna ajetut kilometrit (0 lopettaa): ");
        Scanner lukija = new Scanner(System.in);
        int kilometrit = lukija.nextInt();

        DecimalFormat ds = new DecimalFormat("0.00");

        while (kilometrit > 0) {
            summa = summa + kilometrit;
            System.out.println("Anna ajetut kilometrit (0 lopettaa): ");
            kilometrit = lukija.nextInt();
        }

        double korvaus = summa * 0.43;
        System.out.println("Yhteensä " + summa + " kilometriä");
        System.out.println("Korvaus on " + ds.format(korvaus) + " euroa");

        lukija.close();

    }
}
