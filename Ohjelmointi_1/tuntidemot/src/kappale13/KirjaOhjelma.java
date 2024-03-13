package kappale13;

import java.util.Scanner;

public class KirjaOhjelma {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        // Luetaan käyttäjältä tiedot kirjalle
        System.out.println("Anna nimi:");
        String nimi = lukija.nextLine();
        System.out.println("Anna isbn:");
        String isbn = lukija.nextLine();
        System.out.println("Anna hinta:");
        double hinta = Double.parseDouble(lukija.nextLine().replace(',', '.'));
        System.out.println("Anna julkaisuvuosi:");
        int vuosi = Integer.parseInt(lukija.nextLine());
        
        // Luodaan ensimmäinen kirja parametrillisella konstruktorilla
        Kirja kirja1 = new Kirja(nimi, isbn, hinta, vuosi);
        // Tulostetaan ensimmäisen kirjan tiedot toString-metodilla
        System.out.println(kirja1);
        
        // Luodaan toinen kirja parametrittomalla konstruktorilla
        Kirja kirja2 = new Kirja();
        // Asetetaan toisen kirjan tiedot set-metodeilla
        kirja2.setNimi("Java-ohjelmointi");
        kirja2.setIsbn("9789521435560");
        kirja2.setHinta(65.50);
        kirja2.setVuosi(2018);
        // Tulostetaan toisen kirjan tiedot get-metodeilla
        System.out.println("Nimi: " + kirja2.getNimi());
        System.out.println("Isbn: " + kirja2.getIsbn());
        System.out.println("Hinta: " + kirja2.getHinta());
        System.out.println("Julkaisuvuosi: " + kirja2.getVuosi());
        
        lukija.close();
    }
}
