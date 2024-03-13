package kappale13;

import java.util.Scanner;

public class RemonttiOhjelma {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        // Luetaan käyttäjältä remontin tiedot
        System.out.println("Anna vuosi:");
        int vuosi = Integer.parseInt(lukija.nextLine());
        System.out.println("Anna kuvaus:");
        // Luodaan uusi remontti-olio parametrillisella konstruktorilla
        Remontti remontti = new Remontti();
        
        // Asetetaan vuosi ja tarkistetaan palautusarvo
        boolean vuosiAsetettu = remontti.setVuosi(vuosi);
        
        // Tulostetaan vastaava viesti
        if (vuosiAsetettu) {
            System.out.println(remontti);
        } else {
            System.out.println("Vuosi ei voi olla tulevaisuudessa");
        }
        
        lukija.close();
    }
}
