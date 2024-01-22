package kappale1;

import java.util.Scanner;

public class HeiEtunimi {
    public static void main(String[] args) {
        try (Scanner lukija = new Scanner(System.in)) {
            System.out.println("Syötä etunimi:");
            String etunimi = lukija.nextLine();
            System.out.println("Hei " + etunimi + "!");
        }

    }
}
