package kappale3;

import java.util.Scanner;

public class Katsastus {
    public static void main(String[] args) {

        Scanner lukijaToimenpide = new Scanner(System.in);
        System.out.println("Onko 1=katsastus, 2=jälkitarkastus: ");
        int Toimenpide = lukijaToimenpide.nextInt();
        int hinta = 0;
        if (Toimenpide == 1) {
            hinta = hinta + 50;

            Scanner lukijaPäästöt = new Scanner(System.in);
            System.out.println("Mitataanko päästöt 0=ei, 1=kyllä: ");
            int Päästöt = lukijaPäästöt.nextInt();

            if (Päästöt == 1) {
                Scanner lukijaTyyppi = new Scanner(System.in);
                System.out.println("Onko auto 0=bensa, 1=diesel: ");
                int Tyyppi = lukijaTyyppi.nextInt();

                lukijaTyyppi.close();
                lukijaPäästöt.close();
                if (Tyyppi == 1) {
                    hinta = hinta + 31;
                } else {
                    hinta = hinta + 22;
                }

            } else {
                hinta = hinta + 0;
            }

        } else {
            hinta = hinta + 30;
        }

        System.out.println("Hinta on " + hinta);

        lukijaToimenpide.close();

    }
}
