package kappale7;

import java.util.Scanner;

public class Lento {

    public static void main(String[] args) {

        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna lennon numero: ");
        String lento = lukija.nextLine();
        
        if (!lento.startsWith("AY")) {
            System.out.println("Ei ole Finnairin lento");
        } else {

            char thirdCharacter = lento.charAt(2);

            if (thirdCharacter == '1') {
                System.out.println("Kaukolento");
            } else if (thirdCharacter >= '2' && thirdCharacter <= '6') {
                System.out.println("Kotimaan lento");
            } else if (thirdCharacter == '7') {
                System.out.println("Venäjän lento");
            }
        }

        lukija.close();
    }
}
