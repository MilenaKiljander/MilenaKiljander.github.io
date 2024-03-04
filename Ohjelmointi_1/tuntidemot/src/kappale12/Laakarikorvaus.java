package kappale12;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Laakarikorvaus {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Anna käynnin kesto: ");
        int kesto = lukija.nextInt();

        double korvaus = laskeKorvaus(kesto);

        DecimalFormat df = new DecimalFormat("#,##0.00");
        String formattedKorvaus = df.format(korvaus);

        System.out.println("Kestoltaan " + kesto + " minuutin yleislääkärikäynnistä kelakorvaus on " + formattedKorvaus
                + " euroa");

        lukija.close();
    }

    public static double laskeKorvaus(int kesto) {
        if (kesto <= 10) {
            return 8.00;
        } else if (kesto <= 20) {
            return 11.00;
        } else if (kesto <= 30) {
            return 13.50;
        } else {
            return 0.00;
        }
    }
}
