package kappale4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Matkavertailu {
    public static void main(String[] args) {

        Scanner lukijaMatkat = new Scanner(System.in);
        System.out.println("Montako matkaa teet kuukaudessa: ");
        int Matkat = lukijaMatkat.nextInt();

        Scanner lukijaLippu = new Scanner(System.in);
        System.out.println("Anna yksittäisen lipun hinta: ");
        double Lippu = lukijaLippu.nextDouble();

        Scanner lukijaKuukausi = new Scanner(System.in);
        System.out.println("Anna kuukausilipun hinta: ");
        double Kuukausi = lukijaKuukausi.nextDouble();

        double Lipunhinta = Kuukausi / Matkat;
        if (Lipunhinta < Lippu) {
            DecimalFormat ds = new DecimalFormat("0.00");
            double Vastaus = (Lippu * Matkat) - Kuukausi;
            System.out.println("Kuukausilippu on " + ds.format(Vastaus) + " euroa halvempi kuin yksittäinen");
        } else {
            DecimalFormat ds = new DecimalFormat("0.00");
            double Tokavastaus = Kuukausi - (Lippu * Matkat);
            System.out.println("Yksittäinen on " + ds.format(Tokavastaus) + " euroa halvempi kuin kuukausilippu");
        }

        lukijaMatkat.close();
        lukijaLippu.close();
        lukijaKuukausi.close();

    }
}
