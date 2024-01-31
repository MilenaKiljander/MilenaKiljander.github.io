package kappale5;

import java.util.Scanner;

public class Harjoitus {
    public static void main(String[] args) {

      
        Scanner lukija2 = new Scanner(System.in);
        System.out.println("Anna kolmion koko:");
        int koko = lukija2.nextInt();

        for (int i = 1; i <= koko; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println();
            lukija2.close();
        }
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna kolmion koko:");
        int korkeus = lukija.nextInt();

        for (int i = 1; i <= korkeus; i++) {
            for (int j = korkeus; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println();
            lukija.close();
        }

    }
}
