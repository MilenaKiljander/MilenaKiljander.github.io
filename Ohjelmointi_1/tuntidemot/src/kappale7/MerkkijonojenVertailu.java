package kappale7;

import java.util.Scanner;

public class MerkkijonojenVertailu {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Syötä kaksi merkkijonoa:");
        String eka = lukija.nextLine();
        String toka = lukija.nextLine();

        if (eka.equals(toka)) {
            System.out.println("Syötetyt merkkijonot olivat samat!");
        } else {
            System.out.println("Syötetyt merkkijonot eivät olleet samat!");
        }
        lukija.close();
    }
}
