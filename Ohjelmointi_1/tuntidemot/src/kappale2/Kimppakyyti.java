package kappale2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Kimppakyyti {
public static void main(String[] args) {
    //Esimerkiksi jos ajetut kilometri on 500.0, kulutus on 7.0 litraa/100km, polttoaine maksaa 1.690 euroa/litra ja 
    // kimppakyytiläisiä on kolme, jokainen maksaa 19.72 (500.0 * 7.0 / 100.0 * 1.690 /3

    Scanner lukijaKilometrit = new Scanner(System.in);
    System.out.println("Anna ajetut kilometrit: ");
    double Kilometrit = lukijaKilometrit.nextDouble();

    Scanner lukijaKulutus = new Scanner(System.in);
    System.out.println("Anna kulutus per 100 km: ");
    double Kulutus = lukijaKulutus.nextDouble();

    Scanner lukijaLitrahinta = new Scanner(System.in);
    System.out.println("Anna polttoaineen litrahinta: ");
    double Litrahinta = lukijaLitrahinta.nextDouble();

    Scanner lukijaKyyti = new Scanner(System.in);
    System.out.println("Anna kimppakyytiläisten lukumäärä: ");
    double Kyyti = lukijaKyyti.nextDouble();

    DecimalFormat desimaalit = new DecimalFormat("0.00");
    double Vastaus = Kilometrit * Kulutus / 100.0 * Litrahinta / Kyyti;
    System.out.println("Bensakustannus per henkilö on " + desimaalit.format(Vastaus) + " euroa");

    lukijaKilometrit.close();
    lukijaKulutus.close();
    lukijaLitrahinta.close();
    lukijaKyyti.close();
}
}
