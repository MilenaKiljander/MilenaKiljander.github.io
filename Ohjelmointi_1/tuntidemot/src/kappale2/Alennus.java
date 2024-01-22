package kappale2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Alennus {
public static void main(String[] args) {
    //Alennettu hinta lasketaan: hinta * (100.0 - alennusprosentti) / 100.0

    Scanner lukijaAlentamaton = new Scanner(System.in);
    System.out.println("Anna alentamaton hinta: ");
    double Alentamaton = lukijaAlentamaton.nextDouble();

    Scanner lukijaProsentti = new Scanner(System.in);
    System.out.println("Anna alennusprosentti: ");
    double Prosentti = lukijaProsentti.nextDouble();

    DecimalFormat desimaalit = new DecimalFormat("0.00");
    double Vastaus = Alentamaton * (100.0 - Prosentti) / 100.0;
    System.out.println("Alennettu hinta on " + desimaalit.format(Vastaus));

    lukijaAlentamaton.close();
    lukijaProsentti.close();
}
}
