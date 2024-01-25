package kappale4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ylevero {
    public static void main(String[] args) {

        System.out.println("Anna vuositulosi ja ikäsi: ");
        Scanner lukijaTulot = new Scanner(System.in);
        double tulot = lukijaTulot.nextDouble();
        int ikä = lukijaTulot.nextInt();

        double verot = tulot * 0.68 / 100;
        if (ikä < 18 || verot < 70) {
            verot = 0;
        } else if (verot > 140) {
            verot = 140;
        } else {
            verot = tulot * 0.68 / 100;
        }
        DecimalFormat ds = new DecimalFormat("0.00");
        System.out.println("Ylevero on " + ds.format(verot));
        lukijaTulot.close();

    }
}