package kappale13;

import java.util.Scanner;

public class AsuntoOhjelma {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        // Luetaan käyttäjältä asunnon tiedot
        System.out.println("Anna asunnon tyyppi:");
        String tyyppi = lukija.nextLine();
        System.out.println("Anna osoite:");
        String osoite = lukija.nextLine();
        System.out.println("Anna pinta-ala:");
        double pintaAla = Double.parseDouble(lukija.nextLine().replace(',', '.'));
        System.out.println("Anna hinta:");
        double hinta = Double.parseDouble(lukija.nextLine().replace(',', '.'));
        System.out.println("Anna kuvaus:");
        String kuvaus = lukija.nextLine();
        
        // Luodaan uusi asunto-olio parametrillisella konstruktorilla
        Asunto asunto = new Asunto(tyyppi, osoite, pintaAla, hinta, kuvaus);
        
        // Tulostetaan asunnon tiedot
        System.out.println(asunto);
        
        lukija.close();
    }
}
