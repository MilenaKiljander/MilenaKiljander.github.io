package kappale2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Paivasakko {
public static void main(String[] args) {
    //(nettotulot – 255)  /60
    Scanner lukijanNettotulot = new Scanner(System.in);
    System.out.println("Anna nettotulot: ");
    double Nettotulot = lukijanNettotulot.nextDouble();

    DecimalFormat desimaalit = new DecimalFormat("0");
    double Sakko = (Nettotulot - 255) / 60;
    System.out.println("Nettotuloilla " + desimaalit.format(Nettotulot) + " päiväsakko on " + desimaalit.format(Sakko) + " euroa");

    lukijanNettotulot.close();
}
}

