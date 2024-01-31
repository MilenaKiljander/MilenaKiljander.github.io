package kappale5;

import java.util.Scanner;

public class Opintopisteet {
    public static void main(String[] args) {

        System.out.println("Anna lukukausien määrä: ");
        Scanner lukija = new Scanner(System.in);
        int lukukaudet = lukija.nextInt();
        int summa = 0;

        for (int i=1; i<= lukukaudet; i++){
            System.out.println("Anna " + i + ". lukukauden opintopisteesi: ");
            int pisteet = lukija.nextInt();
            summa = summa + pisteet;
        }
        
        int tavoite = lukukaudet * 30;

        System.out.println("Sinulla pitäisi olla tähän mennessä " + tavoite + " opintopistettä.");
        System.out.println("Sinulla on " + summa + " opintopistettä.");

        if( summa > tavoite){
            System.out.println("Olet edellä tavoitteesta.");
        }else if ( summa < tavoite){
            System.out.println("Olet jäljessä tavoitteesta.");
        }else{
            System.out.println("Olet tavoitteessa.");
        }

        int tutkinto = 210 - summa;
        System.out.println("Tutkinnosta puuttuu vielä "+ tutkinto + " opintopistettä.");
        lukija.close();
    }
}
