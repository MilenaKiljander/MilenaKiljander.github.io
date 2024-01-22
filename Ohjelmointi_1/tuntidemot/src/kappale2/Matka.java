package kappale2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Matka {
public static void main(String[] args) {
    //ajoaika = (double) matka / nopeus

    Scanner lukijaMatka = new Scanner(System.in);
    System.out.println("Anna matka: ");
    double Matka = lukijaMatka.nextDouble();

    Scanner lukijaNopeus = new Scanner(System.in);
    System.out.println("Anna nopeus: ");
    double Nopeus = lukijaNopeus.nextDouble();

    DecimalFormat desimaalit = new DecimalFormat("0.00");
    double Ajoaika = (double) Matka / Nopeus;
    System.out.println("Aikaa menee " + desimaalit.format(Ajoaika) + " tuntia");

    lukijaMatka.close();
    lukijaNopeus.close();
}
}
