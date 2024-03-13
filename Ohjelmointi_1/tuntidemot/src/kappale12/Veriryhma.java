package kappale12;

import java.util.ArrayList;
import java.util.Scanner;

public class Veriryhma {
    public static ArrayList<String> kysyVeriryhmat() {
        ArrayList<String> luovutukset = new ArrayList<>();
        try (Scanner lukija = new Scanner(System.in)) {
            while (true) {
                System.out.print("Anna veriryhmä (- lopettaa): ");
                String veriryhma = lukija.nextLine().toUpperCase().trim();
                if (veriryhma.equals("-")) {
                    break;
                }
                luovutukset.add(veriryhma);
            }
        }
        return luovutukset;
    }

    public static int laskeLuovutustenMaarat(ArrayList<String> luovutukset, String veriryhma) {
        int pyydetytLuovutukset = 0;
        for (String luovutus : luovutukset) {
            if (luovutus.equals(veriryhma)) {
                pyydetytLuovutukset++;
            }
        }
        return pyydetytLuovutukset;
    }

    public static void main(String[] args) {
        ArrayList<String> luovutukset = kysyVeriryhmat();
        try (Scanner lukija = new Scanner(System.in)) {
            System.out.println("Luovutuksia oli yhteensä " + luovutukset.size());
            System.out.print("Minkä veriryhmän luovutusten määrän haluat tietää: ");
            String veriryhma = lukija.nextLine().toUpperCase().trim();
            int pyydetyt = laskeLuovutustenMaarat(luovutukset, veriryhma);
            System.out.println("Veriryhmän " + veriryhma + " luovutuksia oli " + pyydetyt);
        }
    }
}
