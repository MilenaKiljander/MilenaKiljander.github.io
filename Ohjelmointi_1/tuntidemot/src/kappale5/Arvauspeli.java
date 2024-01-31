package kappale5;

import java.util.Random;
import java.util.Scanner;

public class Arvauspeli {

    static Random satunnaisgeneraattori = new Random(); // älä muuta tätä riviä!

    public static void main(String[] args) {

        // ...toteuta koodisi tänne
        int K = 5;
        int i, luku;

        Scanner lukija = new Scanner(System.in);

        for (i = 0; i < K; i++) {
            // Tämän satunnaisen luvun on oltava ohjelmasi oikea vastaus!
            int arvaus = satunnaisgeneraattori.nextInt(100);

            System.out.print(i == 0 ? "Arvaa ajattelemani luku väliltä 0-99: " : "Arvaa uudelleen: ");
            luku = lukija.nextInt();

            if (luku == arvaus) {
                System.out.println("Oikein!");
                break; // This line allows the loop to exit if the answer is correct
            } else if (luku > arvaus) {
                System.out.println("Oikea luku on pienempi kuin " + luku + "!");
            } else if (luku < arvaus) {
                System.out.println("Oikea luku on suurempi kuin " + luku + "!");
            }
            lukija.close();
        }
    }
}
    
