package kappale7;

import java.util.Scanner;

public class Lumi {
    public static void main(String[] args) {

        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna nimi: ");
        String nimi = lukija.nextLine();

        int laskuri = 0;
        int lkmLumi = 0;

        while (true) {

            if (nimi.equalsIgnoreCase("lumi")) {
                System.out.println("Anna nimi: ");
                nimi = lukija.nextLine();
                laskuri = laskuri + 1;
                lkmLumi = lkmLumi + 1;
                continue;
            }

            if (nimi.equalsIgnoreCase("loppu")) {
                break;
            } else {
                System.out.println("Anna nimi: ");
                nimi = lukija.nextLine();
                laskuri = laskuri + 1;
                continue;
            }

        }

        System.out.println("Nimiä oli " + laskuri + " kappaletta.");
        System.out.println("Nimi Lumi esiintyi " + lkmLumi + " kertaa.");

        lukija.close();

    }

}
