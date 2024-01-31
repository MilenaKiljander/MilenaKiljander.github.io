package kappale6;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Kilometrikorvaus {
    public static void main(String[] args) {
      
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna ajetut kilometrit (0 lopettaa): ");
        int kilometrit = lukija.nextInt();

        DecimalFormat ds = new DecimalFormat("0.00");

        int summa = 0;
        while (kilometrit != 0) {
            summa = summa + kilometrit;
            System.out.println("Anna ajetut kilometrit (0 lopettaa): ");
            kilometrit = lukija.nextInt();
        }
        System.out.println("Yhteensä " + summa + " kilometriä");

        double korvaus = summa * 0.46;
        System.out.println("Korvaus on " + ds.format(korvaus) + " euroa");

        lukija.close();
    }
}
