package kappale9;

import java.util.Scanner;

public class ArvonTarkastus {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        
        Scanner lukija = new Scanner(System.in);
        System.out.print("Syötä luku väliltä 0-23: ");
        int luku = lukija.nextInt();

        if (luku >= 0 && luku <= 23) {
            System.out.println("Luku " + luku + " on sallittu.");
            lukija.close();
        } else {
            throw new IllegalArgumentException();
        }

    }
}
