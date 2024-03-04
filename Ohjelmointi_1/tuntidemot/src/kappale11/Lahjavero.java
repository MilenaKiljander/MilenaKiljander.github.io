package kappale11;

import java.util.Scanner;

public class Lahjavero {
    public static void main(String[] args) {

        Scanner lukija = new Scanner(System.in);

        System.out.println("Anna lahjan suuruus: ");
        double suuruus = lukija.nextDouble();

        double vero = laskeVero(suuruus);
        System.out.printf("Lahjavero on  %.2f euroa%n", vero);

        lukija.close();
    }

    public static double laskeVero(double arvo) {
        if (arvo <= 5000) {
            return 0;
        } else if (arvo <= 25000) {
            return 100 + (arvo - 5000) * 0.08;
        } else if (arvo <= 55000) {
            return 1700 + (arvo - 25000) * 0.1;
        } else if (arvo <= 200000) {
            return 4700 + (arvo - 55000) * 0.12;
        } else if (arvo <= 1000000) {
            return 22100 + (arvo - 200000) * 0.15;
        } else {
            return 142100 + (arvo - 1000000) * 0.17;
        }
    }
}
