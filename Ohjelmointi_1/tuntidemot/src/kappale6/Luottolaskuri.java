package kappale6;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Luottolaskuri {
    public static void main(String[] args) {

        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna luotollisen ostoksen hinta: ");
        double hinta = lukija.nextDouble();

        System.out.println("Anna kuukausierien lukumäärä: ");
        int kuukausierat = lukija.nextInt();

        DecimalFormat ds = new DecimalFormat("0.00");

        double kuukausittain = hinta / kuukausierat;
        double jäljellä = hinta - kuukausittain;

        for (int i = 1; i <= kuukausierat; i++) {
            System.out.println(i + ". erä " + ds.format(kuukausittain) + " euroa, luottoa jäljellä "
                    + ds.format(jäljellä) + " euroa");
            jäljellä -= kuukausittain;
        }

        lukija.close();
    }
}
