package kappale1;

import java.util.Scanner;

public class Puoluetuki {
    public static void main(String[] args) {

            Scanner lukija = new Scanner(System.in); 
            System.out.println("Anna kansanedustajien lukumäärä: ");

            int Edustajat = lukija.nextInt();
            int tuki = Edustajat * 148175;
            System.out.println("Puoluetuen määrä on " + tuki + " euroa");
            lukija.close();
    }
}
