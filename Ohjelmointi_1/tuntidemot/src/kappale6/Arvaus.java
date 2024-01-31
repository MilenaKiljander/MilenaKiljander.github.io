package kappale6;

import java.util.Scanner;

public class Arvaus {
    public static void main(String[] args) {

        int K = 5;
        int arvaus = 78;
        int arvaukset = 0;
        int i;

        Scanner lukija = new Scanner(System.in);
        System.out.print("Arvaa lukua väliltä 1-100: ");

        for (i = 0; i < K; i++) {
            int luku = lukija.nextInt();
            arvaukset++;

            if (luku == arvaus) {
                System.out.println("Arvasit oikein. Arvauksia oli " + arvaukset);
                break;
            } else if (luku > arvaus) {
                System.out.println("Arvaa suurempaa: ");
                luku = lukija.nextInt();
            } else if (luku < arvaus) {
                System.out.println("Arvaa pienempää: ");
                luku = lukija.nextInt();
            }

            lukija.close();
        }
    }
}
