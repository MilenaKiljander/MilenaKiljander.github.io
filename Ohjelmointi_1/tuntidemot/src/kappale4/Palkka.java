package kappale4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Palkka {
    public static void main(String[] args) {

        Scanner lukijaPalkka = new Scanner(System.in);
        System.out.println("Anna palkka: ");
        double Palkka = lukijaPalkka.nextDouble();

        Scanner lukijaVeroprosentti = new Scanner(System.in);
        System.out.println("Anna veroprosentti: ");
        double Veroprosentti = lukijaVeroprosentti.nextDouble();

        Scanner lukijaIkä = new Scanner(System.in);
        System.out.println("Anna ikä: ");
        double Ikä = lukijaIkä.nextDouble();

        Scanner lukijaBrutto = new Scanner(System.in);
        DecimalFormat desimaalit5 = new DecimalFormat("0");
        System.out.println("Bruttopalkka " + desimaalit5.format(Palkka));

        Scanner lukijaVeronosuus = new Scanner(System.in);
        DecimalFormat desimaalit4 = new DecimalFormat("0.00");
        Double Veronosuus = (Palkka * Veroprosentti) / 100.0;
        System.out.println("Veron osuus " + desimaalit4.format(Veronosuus));

        double Työttömyyseläkevakuutus = 0.0555;
        if (Ikä >= 53) {
            Työttömyyseläkevakuutus = 0.0705;
        }
        DecimalFormat desimaalit = new DecimalFormat("0.00");
        double Eläkemaksuvastaus = Palkka * Työttömyyseläkevakuutus;
        System.out.println("Työeläkevakuutusmaksun osuus " + desimaalit.format(Eläkemaksuvastaus));

        Scanner lukijaVakuutus = new Scanner(System.in);
        DecimalFormat desimaalit2 = new DecimalFormat("0.00");
        double Vakuutus = Palkka * 0.0115;
        System.out.println("Työttömyysvakuutuksen osuus " + desimaalit2.format(Vakuutus));

        Scanner lukijaKäteen = new Scanner(System.in);
        DecimalFormat desimaalit3 = new DecimalFormat("0.00");
        double Vastaus = Palkka - Veronosuus - Vakuutus - Eläkemaksuvastaus;
        System.out.println("Käteen jää " + desimaalit3.format(Vastaus));

        lukijaPalkka.close();
        lukijaVeroprosentti.close();
        lukijaIkä.close();
        lukijaVeronosuus.close();
        lukijaVakuutus.close();
        lukijaKäteen.close();
        lukijaBrutto.close();
    }
}
