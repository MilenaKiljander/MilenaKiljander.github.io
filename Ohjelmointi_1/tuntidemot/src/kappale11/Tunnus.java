package kappale11;

import java.util.Scanner;

public class Tunnus {
    public static void main(String[] args) {

        Scanner lukija = new Scanner(System.in);

        System.out.println("Anna sukunimi: ");
        String sukunimi = lukija.nextLine();

        System.out.println("Anna etunimi: ");
        String etunimi = lukija.nextLine();

        String tunnus = teeTunnus(etunimi, sukunimi);
        System.out.println("Tunnus on " + tunnus);

        lukija.close();
    }

    public static String teeTunnus(String etu, String suku) {
        String etuOsat = etu.substring(0, Math.min(etu.length(), 3)).toLowerCase();
        String sukuOsat = suku.substring(0, Math.min(suku.length(), 3)).toLowerCase();
        return sukuOsat + etuOsat;
    }
}
