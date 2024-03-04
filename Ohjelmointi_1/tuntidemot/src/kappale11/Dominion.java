package kappale11;

import java.util.Scanner;

public class Dominion {
    public static void main(String[] args) {

        Scanner lukija = new Scanner(System.in);

        System.out.println("Anna kirouskorttien määrä: ");
        int kirous = lukija.nextInt();

        System.out.println("Anna tilakorttien määrä: ");
        int tila = lukija.nextInt();

        System.out.println("Anna pitäjäkorttien määrä: ");
        int pitaja = lukija.nextInt();

        System.out.println("Anna läänikorttien määrä: ");
        int laani = lukija.nextInt();

        Dominion dominion = new Dominion();
        int pisteet = dominion.laskePisteet(kirous, tila, pitaja, laani);

        System.out.println("Pisteiden yhteismäärä on " + pisteet);

        lukija.close();

    }

    public int laskePisteet(int kirous, int tila, int pitaja, int laani) {
        return kirous * -1 + tila * 2 + pitaja * 3 + laani * 6;
    }
}
