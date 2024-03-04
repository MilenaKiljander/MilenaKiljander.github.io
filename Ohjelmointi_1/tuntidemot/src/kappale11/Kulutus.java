package kappale11;

import java.util.Scanner;

public class Kulutus {
    public static void main(String[] args) {

        Scanner lukija = new Scanner(System.in);

        int kilometrit = kysyKilometrit(lukija);
        double tankattu = kysyTankkaus(lukija);
        double kulutus = laskeKulutus(kilometrit, tankattu);
        naytaKulutus(kulutus);

        lukija.close();
    }

    public static int kysyKilometrit(Scanner lukija) {
        System.out.println("Anna ajetut kilometrit: ");
        return lukija.nextInt();
    }

    public static double kysyTankkaus(Scanner lukija) {
        System.out.println("Anna tankattu määrä: ");
        return lukija.nextDouble();
    }

    public static double laskeKulutus(int kilometrit, double tankattu) {
        return (tankattu / kilometrit) * 100;
    }

    public static void naytaKulutus(double kulutus) {
        System.out.printf("Kulutus/100km on  %.2f litraa%n", kulutus);
    }
}