package kappale1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Maalaus {
    public static void main(String[] args) {

        System.out.print("Anna huoneen leveys, pituus ja korkeus: ");
        Scanner lukijaLeveys = new Scanner(System.in);
        Scanner lukijaPituus = new Scanner(System.in);
        Scanner lukijaKorkeus = new Scanner(System.in);

        double Leveys = lukijaLeveys.nextDouble();
        double Pituus = lukijaLeveys.nextDouble();
        double Korkeus = lukijaLeveys.nextDouble();

        Scanner lukijaLitra = new Scanner(System.in);
        System.out.print("Paljonko litralla saadaan maalattua neliöitä: ");
        double Litra = lukijaLitra.nextDouble();

        DecimalFormat desimaalit = new DecimalFormat("0.00");
        double tarve = (Leveys + Leveys + Pituus + Pituus) * Korkeus / Litra;
        System.out.println("Maalin tarve on " + desimaalit.format(tarve) + " litraa");

        lukijaLeveys.close();
        lukijaKorkeus.close();
        lukijaPituus.close();
        lukijaLitra.close();
    }
}
