package kappale11;

import java.util.Scanner;

public class Kellonaika {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Anna kellonaika muodossa tt:mm: ");
        String kellonaika = kysyKellonaika();

        if (tarkastaKellonaika(kellonaika)) {
            System.out.println("Kellonaika on oikein");
        } else {
            System.out.println("Kellonaika on väärin");
        }

        lukija.close();

    }

    public static String kysyKellonaika() {
        try (Scanner lukija = new Scanner(System.in)) {
            return lukija.nextLine();
        }
    }
    public static boolean tarkastaKellonaika(String kellonaika) {
        return kellonaika.matches("^([01]?[0-9]|2[0-3]):[0-5][0-9]$");
    }
}
