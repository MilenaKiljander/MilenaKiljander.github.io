package kappale1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ALV {
    public static void main(String[] args) {

        Scanner lukijaYksi = new Scanner(System.in);
        System.out.println("Anna 1. tuotteen hinta: ");
        double Yksi = lukijaYksi.nextDouble();
        DecimalFormat desimaalit = new DecimalFormat("0.00");
        double Alvi = (Yksi * 14) / 114;
        System.out.println("Tuotteen 1 ALV on " + desimaalit.format(Alvi) + " euroa.");

        Scanner lukijaKaksi = new Scanner(System.in);
        System.out.println("Anna 2. tuotteen hinta: ");
        double Kaksi = lukijaKaksi.nextDouble();
        DecimalFormat desimaalit2 = new DecimalFormat("0.00");
        double Alvi2 = (Kaksi * 14) / 114;
        System.out.println("Tuotteen 2 ALV on " + desimaalit2.format(Alvi2) + " euroa.");

        Scanner lukijaKolme = new Scanner(System.in);
        System.out.println("Anna 3. tuotteen hinta: ");
        double Kolme = lukijaKolme.nextDouble();
        DecimalFormat desimaalit3 = new DecimalFormat("0.00");
        double Alvi3 = (Kolme * 14) / 114;
        System.out.println("Tuotteen 3 ALV on " + desimaalit3.format(Alvi3) + " euroa.");

        lukijaYksi.close();
        lukijaKaksi.close();
        lukijaKolme.close();
    }
}
