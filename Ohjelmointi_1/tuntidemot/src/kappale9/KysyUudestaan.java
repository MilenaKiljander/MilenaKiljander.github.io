package kappale9;

import java.util.Scanner;

public class KysyUudestaan {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        boolean ok = false;

        while (ok == false) {
            try {
                System.out.print("Syötä kokonaisluku: ");
                String syöte = lukija.nextLine();
                int luku = Integer.parseInt(syöte);
                System.out.println("Syötit luvun " + luku + ".");
                ok = true;
            } catch (NumberFormatException e) {
                System.out.println("Virheellinen luku!\n");
            }
        }
        lukija.close();
    }
}
