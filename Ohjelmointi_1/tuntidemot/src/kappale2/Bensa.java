package kappale2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Bensa {
public static void main(String[] args) {
    //tankkaus / ajetut * litrahinta

    Scanner lukijaMäärä = new Scanner(System.in);
    System.out.println("Anna tankattu määrä: ");
    double Määrä = lukijaMäärä.nextDouble();

    Scanner lukijaAjetut = new Scanner(System.in);
    System.out.println("Anna ajetut kilometrit: ");
    double Ajetut = lukijaAjetut.nextDouble();

    Scanner lukijaLitrahinta = new Scanner (System.in);
    System.out.println("Anna litrahinta: ");
    double Litrahinta = lukijaLitrahinta.nextDouble();

    DecimalFormat desimaalit = new DecimalFormat("0.00");
    double Vastaus = Määrä / Ajetut * Litrahinta;
    System.out.println("Ajo per kilometri maksaa " + desimaalit.format(Vastaus));

    lukijaMäärä.close();
    lukijaAjetut.close();
    lukijaLitrahinta.close();
}
}
