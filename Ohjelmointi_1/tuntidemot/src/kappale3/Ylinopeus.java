package kappale3;

import java.util.Scanner;

public class Ylinopeus {
    public static void main(String[] args) {

        Scanner lukijaNopeus = new Scanner(System.in);
        System.out.println("Kerro nopeus: ");
        int Luku = lukijaNopeus.nextInt();

        if (Luku > 120) {
            System.out.println("Ylinopeussakko!");
        }

        else if (Luku <= 120) {
            System.out.println("");
        }

        lukijaNopeus.close();
    }
}
