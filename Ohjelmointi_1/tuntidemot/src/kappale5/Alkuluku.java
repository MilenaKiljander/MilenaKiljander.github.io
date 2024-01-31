package kappale5;

import java.util.Scanner;

public class Alkuluku {
    public static void main(String[] args) {

        System.out.println("Syötä jokin positiivinen kokonaisluku: ");
        Scanner lukija = new Scanner(System.in);
        int luku = lukija.nextInt();
        int lkm = 2;

        for (int i = 2; i < luku; i++) {
            int tulos = luku % i;
            lkm++;

            if (tulos == 0) {
                System.out.println("Luku " + luku + " ei ole alkuluku.");
                break;

            } else if (lkm == luku - 1) {
                System.out.println("Luku " + luku + " on alkuluku.");
                break;
            } else {
                continue;
            }

        }
        lukija.close();

    }
}
