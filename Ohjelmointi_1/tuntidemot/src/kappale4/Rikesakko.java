package kappale4;

import java.util.Scanner;

public class Rikesakko {
    public static void main(String[] args) {
        Scanner lukijaRajoitus = new Scanner(System.in);
        System.out.println("Anna nopeusrajoitus: ");
        int rajoitus = lukijaRajoitus.nextInt();

        Scanner lukijaNopeus = new Scanner(System.in);
        System.out.println("Anna nopeutesi: ");
        int nopeus = lukijaNopeus.nextInt();

        int ylinopeus = nopeus - rajoitus;
        int sakko = 0;

        if (rajoitus >= 10 && rajoitus <= 60 && ylinopeus > 0 && ylinopeus <= 20) {
            if (ylinopeus > 0 && ylinopeus <= 15) {
                sakko = 170;
            } else if (ylinopeus > 15 && ylinopeus <= 20) {
                sakko = 200;
            }
            System.out.println("Rikesakko on " + sakko);
        } else if (rajoitus >= 70 && rajoitus <= 120 && ylinopeus > 0 && ylinopeus <= 20) {
            if (ylinopeus > 0 && ylinopeus <= 15) {
                sakko = 140;
            } else if (ylinopeus > 15 && ylinopeus <= 20) {
                sakko = 200;
            }
            System.out.println("Rikesakko on " + sakko);
        } else {
            System.out.println("Menee päiväsakoille");
        }

        lukijaNopeus.close();
        lukijaRajoitus.close();
    }
}
