package kappale10;

import java.util.Scanner;

public class Mars {
    public static void main(String[] args) {

        Scanner lukija = new Scanner(System.in);
        int[] mittaukset = new int[10];
        int summa = 0;
        int pienin = Integer.MAX_VALUE;
        int suurin = Integer.MIN_VALUE;

        for (int i = 0; i < 10; i++) {
            System.out.print("Syötä mittaus " + (i + 1) + "/10: ");
            int mittaus = lukija.nextInt();
            if (mittaus >= -140 && mittaus <= 20) {
                mittaukset[i] = mittaus;
                summa += mittaus;
                if (mittaus < pienin) {
                    pienin = mittaus;
                }
                if (mittaus > suurin) {
                    suurin = mittaus;
                }
            } else {
                System.out.println("Anna lämpötila väliltä -140 - +20!");
                i--;
            }
        }

        lukija.close();

        double keskiarvo = (double) summa / 10;
        System.out.println("\nMittausten keskiarvo: " + keskiarvo);
        System.out.println("Pienin mittaustulos: " + pienin);
        System.out.println("Suurin mittaustulos: " + suurin);
    }
}