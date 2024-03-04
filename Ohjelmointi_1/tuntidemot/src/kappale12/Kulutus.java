package kappale12;

import java.util.Scanner;

public class Kulutus {

    public static void main(String[] args) {
        Kulutus kulutusOhjelma = new Kulutus();
        int kilometrit = kulutusOhjelma.kysyKilometrit();
        int tankattu = kulutusOhjelma.kysyTankkaus();
        double kulutus = kulutusOhjelma.laskeKulutus(kilometrit, tankattu);
        kulutusOhjelma.naytaKulutus(kulutus);
    }

    public int kysyKilometrit() {
        try (Scanner lukija = new Scanner(System.in)) {
            System.out.println("Anna ajetut kilometrit: ");
            int kilometrit = lukija.nextInt();
            return kilometrit;
        }
    }

    public int kysyTankkaus() {
        try (Scanner lukija = new Scanner(System.in)) {
            System.out.println("Anna tankattu määrä: ");
            int tankattu = lukija.nextInt();
            return tankattu;
        }
    }

    public double laskeKulutus(int kilometrit, int tankattu) {
        double kulutus = ((double) tankattu / kilometrit) * 100;
        return kulutus;
    }

    public void naytaKulutus(double kulutus) {
        System.out.printf("Kulutus/100km on %.2f litraa\n", kulutus);
    }
}
