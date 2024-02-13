package kappale7;

import java.util.Scanner;

public class Tuotteet {
    public static void main(String[] args) {

        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna tuotenumero:");
        String tuotenumero = lukija.nextLine();

        System.out.println("Anna tuotteen nimi:");
        String nimi = lukija.nextLine();
        nimi = nimi.trim();

        System.out.println("Anna tuotteen hinta:");
        String hinta = lukija.nextLine();

        System.out.println("Anna tuotteen kuvaus:");
        String kuvaus = lukija.nextLine();
        kuvaus = kuvaus.trim();
        

        System.out.println("Numero: "+ tuotenumero);
        System.out.println("Nimi: "+ nimi.toUpperCase());
        System.out.println("Hinta: " + hinta);

        if (kuvaus.length() > 0) {
            
            System.out.println("Kuvaus: " + kuvaus);
        }

        lukija.close();
    }
}
