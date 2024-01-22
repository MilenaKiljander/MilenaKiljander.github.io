package kappale1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Cooper {
public static void main(String[] args) {
    System.out.println("Anna juostu matka: ");
    Scanner lukijaMatka = new Scanner(System.in);
    double Matka = lukijaMatka.nextDouble();

    DecimalFormat desimaalit = new DecimalFormat("0");
    double Kierrokset = Matka/400;
    System.out.println("Kokonaisia 400 metrin kierroksia oli " + desimaalit.format(Kierrokset));
    lukijaMatka.close();
}
}
