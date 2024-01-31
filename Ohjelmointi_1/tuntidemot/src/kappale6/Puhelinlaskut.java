package kappale6;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Puhelinlaskut {
    public static void main(String[] args) {

        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna rahasumma puhelinlaskulle 1");
        String lasku1 = lukija.nextLine();

        System.out.println("Anna rahasumma puhelinlaskulle 2");
        String lasku2 = lukija.nextLine();

        DecimalFormat ds = new DecimalFormat("0.00");

        double lasku1d = Double.parseDouble(lasku1);
        double lasku2d = Double.parseDouble(lasku2);

        Double summa = lasku1d + lasku2d;
        System.out.println("Haluttu yhteissumma lukuna on " + ds.format(summa) + " euroa");

        lukija.close();

    }
}
