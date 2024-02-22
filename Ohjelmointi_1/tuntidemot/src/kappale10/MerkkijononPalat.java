package kappale10;

import java.util.Scanner;

public class MerkkijononPalat {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Kirjoita lause: ");
        String sentence = lukija.nextLine();

        String[] words = sentence.split(" ");

        for (String word : words) {
            System.out.println(word);
        }

        lukija.close();
    }
}