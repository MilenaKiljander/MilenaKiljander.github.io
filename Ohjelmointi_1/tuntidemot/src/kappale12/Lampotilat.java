package kappale12;

import java.util.Arrays;
import java.util.Scanner;

public class Lampotilat {
    public static void main(String[] args) {
        final int MAX = 100;
        int[] lampotilat = new int[MAX];
        int lkm = kysyLampotilat(lampotilat, MAX);
        naytaLampotilat(lampotilat, lkm);
    }

    public static int kysyLampotilat(int[] lampotilat, final int MAX) {
        try (Scanner lukija = new Scanner(System.in)) {
            int lkm = 0;
            int lampotila;
            do {
                System.out.println("Anna lämpötila: ");
                lampotila = lukija.nextInt();
                if (lampotila != -999) {
                    lampotilat[lkm] = lampotila;
                    lkm++;
                }
            } while (lampotila != -999 && lkm < MAX);
            Arrays.sort(lampotilat, 0, lkm);
            return lkm;
        }
    }

    public static void naytaLampotilat(int[] lampotilat, int lkm) {
        System.out.print("Annoit lämpötilat: ");
        for (int i = 0; i < lkm - 1; i++) {
            System.out.print(lampotilat[i] + " ");
        }
        if (lkm > 0) {
            System.out.print(lampotilat[lkm - 1]);
        }
    }
}
