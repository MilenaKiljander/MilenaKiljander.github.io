package kappale9;

import java.util.Scanner;

public class Summaaja {
    public static void main(String[] args) {

        Scanner lukija = new Scanner(System.in);
        int summa = 0;

        while (true) {
            System.out.println("Syötä seuraava luku (0 lopettaa): ");
            String input = lukija.nextLine();

            if (input.equals("0")) {
                break;
            }

            try {
                int luku = Integer.parseInt(input);
                summa += luku;
            } catch (NumberFormatException e) {
                System.out.println("Virheellinen syöte!");
                continue;
            }
        }

        System.out.println("Lukujen summa on " + summa + ".");
        lukija.close();
    }
}
