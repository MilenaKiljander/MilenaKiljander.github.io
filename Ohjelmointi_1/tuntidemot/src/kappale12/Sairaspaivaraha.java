package kappale12;

import java.util.Scanner;

public class Sairaspaivaraha {

    public static void main(String[] args) {
        Sairaspaivaraha ohjelma = new Sairaspaivaraha();
        double vuositulo = ohjelma.kysyVuositulo();
        double sairaspaivaraha = ohjelma.laskeSairaspaivaraha(vuositulo);
        System.out.printf("Vuosituloilla %.2f sairaspäiväraha on %.2f euroa/päivä.\n", vuositulo, sairaspaivaraha);
    }

    public double kysyVuositulo() {
        try (Scanner lukija = new Scanner(System.in)) {
            System.out.println("Anna vuositulosi: ");
            double vuositulo = lukija.nextDouble();
            return vuositulo;
        }
    }

    public double laskeSairaspaivaraha(double vuositulo) {
        double sairaspaivaraha = 0.0;
        if (vuositulo <= 1399) {
            sairaspaivaraha = 0.0;
        } else if (vuositulo <= 36419) {
            sairaspaivaraha = 0.7 * vuositulo / 300.0;
        } else if (vuositulo <= 56032) {
            sairaspaivaraha = 84.98 + 0.4 * (vuositulo - 36419) / 300.0;
        } else {
            sairaspaivaraha = 111.13 + 0.25 * (vuositulo - 56032) / 300.0;
        }
        return sairaspaivaraha;
    }
}
